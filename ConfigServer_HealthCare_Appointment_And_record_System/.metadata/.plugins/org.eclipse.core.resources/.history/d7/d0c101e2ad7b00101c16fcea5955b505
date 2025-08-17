package com.example.medicalrecords_service.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.medicalrecords_service.model.MedicalRecord;
import com.example.medicalrecords_service.service.MedicalRecordService;

@RestController
@RequestMapping("/medical-records")
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService service;

    @PostMapping
    public MedicalRecord addRecord(@RequestBody MedicalRecord record) {
        return service.addRecord(record);
    }

    @GetMapping("/patient/{patientId}")
    public List<MedicalRecord> getRecords(@PathVariable Long patientId) {
        return service.getRecordsByPatient(patientId);
    }

    @GetMapping
    public List<MedicalRecord> getAllRecords() {
        return service.getAllRecords();
    }
}
