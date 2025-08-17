package com.example.billing_service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billing_service.model.Billing;
import com.example.billing_service.repository.BillingRepository;


@Service
public class BillingService {
    @Autowired
    private BillingRepository repository;

    public Billing createInvoice(Billing invoice) {
        return repository.save(invoice);
    }

    public List<Billing> getInvoicesByPatient(Long patientId) {
        return repository.findByPatientId(patientId);
    }

    public List<Billing> getAllInvoices() {
        return repository.findAll();
    }

    public void markAsPaid(Long id) {
    	Billing billing = repository.findById(id).orElse(null);
        if(billing != null) {
        	billing.setStatus("PAID");
            repository.save(billing);
        }
    }
}
