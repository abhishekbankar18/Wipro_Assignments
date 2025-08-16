package com.example.employee_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.employee_service.Feign.DepartmentClient;
import com.example.employee_service.dto.DepartmentDTO;
import com.example.employee_service.model.Employee;
import com.example.employee_service.repository.EmployeeRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentClient departmentClient;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentClient departmentClient) {
        this.employeeRepository = employeeRepository;
        this.departmentClient = departmentClient;
    }

    @CircuitBreaker(name = "departmentService", fallbackMethod = "departmentFallback")
    public Employee createEmployee(Employee employee, Long departmentId) {
        DepartmentDTO department = departmentClient.getDepartmentById(departmentId);

        if (department == null) {
            throw new RuntimeException("Department not found with id: " + departmentId);
        }

        employee.setDepartmentId(departmentId);
        return employeeRepository.save(employee);
    }


    public Employee departmentFallback(Employee employee, Long departmentId, Throwable t) {
        System.out.println("Circuit Breaker triggered: " + t.getMessage());
        employee.setDepartmentId(null); 
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }
}
