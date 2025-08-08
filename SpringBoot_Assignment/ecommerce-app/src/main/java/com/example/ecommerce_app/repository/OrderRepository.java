package com.example.ecommerce_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce_app.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
