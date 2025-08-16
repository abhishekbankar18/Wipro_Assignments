package com.example.citizen_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Citizen 
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long citizenId;

    private String name;
    private String email;
    private String phoneNumber;
	public Long getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Long citizenId) {
		this.citizenId = citizenId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(Long citizenId, String name, String email, String phoneNumber) {
		super();
		this.citizenId = citizenId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
    

}
