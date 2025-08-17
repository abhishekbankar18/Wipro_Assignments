package com.example.doctor_service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.doctor_service.model.Doctor;
import com.example.doctor_service.repository.DoctorRepository;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository repository;

    public Doctor saveDoctor(Doctor doctor) {
        return repository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteDoctor(Long id) {
        repository.deleteById(id);
    }
}
