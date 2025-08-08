package com.example.ecommerce_app.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce_app.model.Payment;
import com.example.ecommerce_app.service.PaymentService;

@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payments")
    public String showPaymentsPage(Model model) {
        List<Payment> payments = paymentService.getAllPayments();
        model.addAttribute("paymentList", payments);
        return "payments";  // payments.html
    }

    @GetMapping("/add-payment")
    public String showAddPaymentPage(Model model) {
        model.addAttribute("payment", new Payment());
        return "add-payment"; // add-payment.html
    }

    @PostMapping("/save-payment")
    public String savePayment(@ModelAttribute("payment") Payment payment) {
        payment.setPaymentDate(LocalDateTime.now());
        paymentService.savePayment(payment);
        return "redirect:/payments";
    }

    @GetMapping("/edit-payment/{id}")
    public String showEditPaymentPage(@PathVariable Long id, Model model) {
        Payment payment = paymentService.getPaymentById(id);
        model.addAttribute("payment", payment);
        return "edit-payment"; // edit-payment.html
    }

    @PostMapping("/update-payment")
    public String updatePayment(@ModelAttribute("payment") Payment payment) {
        paymentService.savePayment(payment);
        return "redirect:/payments";
    }

    @GetMapping("/delete-payment/{id}")
    public String deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
        return "redirect:/payments";
    }
}
