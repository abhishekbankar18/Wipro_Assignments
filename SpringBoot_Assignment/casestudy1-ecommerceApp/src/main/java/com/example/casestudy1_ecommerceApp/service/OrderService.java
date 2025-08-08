package com.example.casestudy1_ecommerceApp.service;

import org.springframework.stereotype.Service;

import com.example.casestudy1_ecommerceApp.model.CartItem;
import com.example.casestudy1_ecommerceApp.model.Order;

import java.util.*;
@Service
public class OrderService {
private Map<Long, Order> orders = new HashMap<>();
private Long nextOrderId = 1L;
public Order placeOrder(List<CartItem> items) {
double total = items.stream().mapToDouble(item-> item.getProduct().getPrice() * item.getQuantity()).sum();
Order order = new Order(nextOrderId++, items, total);
orders.put(order.getOrderId(), order);
return order;
}
public Order getOrderById(Long id) {
return orders.get(id);
}
}