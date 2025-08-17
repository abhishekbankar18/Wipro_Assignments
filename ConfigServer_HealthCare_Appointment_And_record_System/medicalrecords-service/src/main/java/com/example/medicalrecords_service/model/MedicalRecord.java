package com.example.medicalrecords_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long patientId;
    private LocalDate visitDate;
    private String diagnosis;
    private String prescription;
    private String tests;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public LocalDate getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getTests() {
		return tests;
	}
	public MedicalRecord(Long id, Long patientId, LocalDate visitDate, String diagnosis, String prescription,
			String tests) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.visitDate = visitDate;
		this.diagnosis = diagnosis;
		this.prescription = prescription;
		this.tests = tests;
	}
	public void setTests(String tests) {
		this.tests = tests;
	}

    
}
