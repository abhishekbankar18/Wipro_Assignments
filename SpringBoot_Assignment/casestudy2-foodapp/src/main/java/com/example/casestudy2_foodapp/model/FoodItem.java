 package com.example.casestudy2_foodapp.model;
 
 public class FoodItem 
 {
	 private String name;
	 private String description;
 // Constructors, getters, and setters
	 
	 public FoodItem() 
	 {
			super();
			// TODO Auto-generated constructor stub
	}
	 
	 public FoodItem(String name, String description) 
	 {
		 this.name = name;
		 this.description = description;
	 }

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() 
	 {
		 return name;
	 }
	 
	 public String getDescription() 
	 {
		 return description;
	 }
 }