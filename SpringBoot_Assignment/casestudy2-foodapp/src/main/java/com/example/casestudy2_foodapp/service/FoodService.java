package com.example.casestudy2_foodapp.service;

import org.springframework.stereotype.Service;

import com.example.casestudy2_foodapp.model.FoodItem;

import java.util.ArrayList;
import java.util.List;
@Service
public class FoodService {
private final List<FoodItem> foodItems = new ArrayList<>();
public List<FoodItem> getAllFoodItems() {
return foodItems;
}
public void addFoodItem(FoodItem foodItem) {
foodItems.add(foodItem);
}
}