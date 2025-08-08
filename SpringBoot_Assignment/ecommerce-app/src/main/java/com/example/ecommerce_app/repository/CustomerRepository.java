package com.example.ecommerce_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce_app.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);
}
