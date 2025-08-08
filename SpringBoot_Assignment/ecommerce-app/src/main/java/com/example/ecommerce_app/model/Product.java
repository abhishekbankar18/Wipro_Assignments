package com.example.ecommerce_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Product { 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 
     
    private String name; 
    private Double price;
    
//  @ManyToMany 
//  @JoinTable( 
//    name = "order_product",  
//    joinColumns = @JoinColumn(name = "product_id"),  
//inverseJoinColumns = @JoinColumn(name = "order_id")) 
//private List<Order> orders; 
//Getters and Setters 
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	} 
     

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
} 