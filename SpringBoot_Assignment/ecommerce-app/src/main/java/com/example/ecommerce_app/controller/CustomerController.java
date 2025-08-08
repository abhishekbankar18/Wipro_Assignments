package com.example.ecommerce_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce_app.model.Customer;
import com.example.ecommerce_app.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/home")
    public String showHomePage(Model model) {
        List<Customer> customersList = customerService.getAllCustomers();
        model.addAttribute("customerList", customersList);
        return "home"; // corresponds to home.html
    }

    @GetMapping("/add-customer")
    public String showAddCustomerPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "add-customer"; // corresponds to add-customer.html
    }

    @PostMapping("/save-customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public String showEditCustomer(Model model, @PathVariable Long id) {
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer", customer);
        return "edit-customer"; // corresponds to edit-customer.html
    }

    @PostMapping("/update-customer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer) {
        Customer existingCustomer = customerService.getCustomerById(customer.getId());
        existingCustomer.setName(customer.getName());
        existingCustomer.setPassword(customer.getPassword());
        existingCustomer.setEmail(customer.getEmail());
        customerService.saveCustomer(existingCustomer);
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/home";
    }
}
