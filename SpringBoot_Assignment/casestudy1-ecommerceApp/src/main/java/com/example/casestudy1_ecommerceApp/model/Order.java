package com.example.casestudy1_ecommerceApp.model;

import java.util.List;

public class Order {
	 private Long orderId;
	 private List<CartItem> items;
	 private double totalPrice;
	 // Constructors, Getters, Setters
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long orderId, List<CartItem> items, double totalPrice) {
		super();
		this.orderId = orderId;
		this.items = items;
		this.totalPrice = totalPrice;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public List<CartItem> getItems() {
		return items;
	}
	public void setItems(List<CartItem> items) {
		this.items = items;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	 }