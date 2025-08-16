package com.example.department_service.controller;

import org.springframework.web.bind.annotation.*;

import com.example.department_service.model.ServiceType;
import com.example.department_service.service.ServiceTypeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service-types")
public class ServiceTypeController {

    private final ServiceTypeService serviceTypeService;

    public ServiceTypeController(ServiceTypeService serviceTypeService) {
        this.serviceTypeService = serviceTypeService;
    }

    @PostMapping
    public ServiceType createServiceType(@RequestBody ServiceType serviceType) {
        return serviceTypeService.saveServiceType(serviceType);
    }

    @GetMapping
    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeService.getAllServiceTypes();
    }

    @GetMapping("/{id}")
    public Optional<ServiceType> getServiceTypeById(@PathVariable Long id) {
        return serviceTypeService.getServiceTypeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteServiceType(@PathVariable Long id) {
        serviceTypeService.deleteServiceType(id);
    }
}
