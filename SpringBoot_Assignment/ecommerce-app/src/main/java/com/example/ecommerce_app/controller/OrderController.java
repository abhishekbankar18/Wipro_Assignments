package com.example.ecommerce_app.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce_app.model.Order;
import com.example.ecommerce_app.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String showOrdersPage(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orderList", orders);
        return "orders";  // orders.html
    }

    @GetMapping("/add-order")
    public String showAddOrderPage(Model model) {
        model.addAttribute("order", new Order());
        return "add-order"; // add-order.html
    }

    @PostMapping("/save-order")
    public String saveOrder(@ModelAttribute("order") Order order) {
        order.setOrderDate(LocalDateTime.now());
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/edit-order/{id}")
    public String showEditOrderPage(@PathVariable Long id, Model model) {
        Order order = orderService.getOrderById(id);
        model.addAttribute("order", order);
        return "edit-order"; // edit-order.html
    }

    @PostMapping("/update-order")
    public String updateOrder(@ModelAttribute("order") Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/delete-order/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }
}
