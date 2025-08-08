package com.example.casestudy1_ecommerceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.casestudy1_ecommerceApp.model.CartItem;
import com.example.casestudy1_ecommerceApp.model.Order;
import com.example.casestudy1_ecommerceApp.model.Product;
import com.example.casestudy1_ecommerceApp.service.OrderService;
import com.example.casestudy1_ecommerceApp.service.ProductService;

import java.util.*;
@Controller
@RequestMapping("/orders")
public class OrderController {
@Autowired
private OrderService orderService;
private List<CartItem> cart = new ArrayList<>();
@PostMapping("/add-to-cart")
public String addToCart(@RequestParam("productId") Long productId, @RequestParam("quantity") int quantity) {
Product product = ProductService.getProductById(productId);
cart.add(new CartItem(product, quantity));
return "redirect:/cart";
}
@GetMapping("/cart")
public String showCart(Model model) {
model.addAttribute("cart", cart);
return "cart";
}
@PostMapping("/checkout")
public String checkout(Model model) {
Order order = orderService.placeOrder(cart);
cart.clear(); // Empty the cart after placing the order
model.addAttribute("order", order);
return "order-confirmation";
}
}