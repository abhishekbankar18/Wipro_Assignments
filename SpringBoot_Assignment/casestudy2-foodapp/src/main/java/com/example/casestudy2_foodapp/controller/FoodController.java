package com.example.casestudy2_foodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestParam;

import com.example.casestudy2_foodapp.model.FoodItem;
import com.example.casestudy2_foodapp.service.FoodService;
@Controller
public class FoodController {
@Autowired
private FoodService foodService;
@GetMapping("/")
public String listFood(Model model) {
model.addAttribute("foodItems", foodService.getAllFoodItems());
return "food-list";
}
@GetMapping("/add-food")
public String showAddFoodForm() {
return "add-food";
}
@PostMapping("/add-food")
public String addFood(@RequestParam String name, @RequestParam String description) {
FoodItem foodItem = new FoodItem(name, description);
foodService.addFoodItem(foodItem);
return "redirect:/";
}
}