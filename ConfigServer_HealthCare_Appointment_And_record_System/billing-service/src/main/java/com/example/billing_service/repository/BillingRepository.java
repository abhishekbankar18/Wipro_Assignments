package com.example.billing_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billing_service.model.Billing;

import java.util.List;

public interface BillingRepository extends JpaRepository<Billing, Long> {
    List<Billing> findByPatientId(Long patientId);
}
