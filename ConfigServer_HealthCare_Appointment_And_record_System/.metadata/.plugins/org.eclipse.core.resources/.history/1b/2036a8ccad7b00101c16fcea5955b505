package com.example.medicalrecords_service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.medicalrecords_service.model.MedicalRecord;
import com.example.medicalrecords_service.repository.MedicalRecordRepository;

@Service
public class MedicalRecordService {
    @Autowired
    private MedicalRecordRepository repository;

    public MedicalRecord addRecord(MedicalRecord record) {
        return repository.save(record);
    }

    public List<MedicalRecord> getRecordsByPatient(Long patientId) {
        return repository.findByPatientId(patientId);
    }

    public List<MedicalRecord> getAllRecords() {
        return repository.findAll();
    }
}
