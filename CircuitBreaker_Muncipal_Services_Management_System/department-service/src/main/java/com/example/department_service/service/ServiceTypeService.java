package com.example.department_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.department_service.model.ServiceType;
import com.example.department_service.repository.ServiceTypeRepository;

@Service
public class ServiceTypeService {

    private final ServiceTypeRepository serviceTypeRepository;

    public ServiceTypeService(ServiceTypeRepository serviceTypeRepository) {
        this.serviceTypeRepository = serviceTypeRepository;
    }

    public ServiceType saveServiceType(ServiceType serviceType) {
        return serviceTypeRepository.save(serviceType);
    }

    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeRepository.findAll();
    }

    public Optional<ServiceType> getServiceTypeById(Long id) {
        return serviceTypeRepository.findById(id);
    }

    public void deleteServiceType(Long id) {
        serviceTypeRepository.deleteById(id);
    }
}
