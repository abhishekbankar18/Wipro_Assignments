package com.example.department_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceType {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceTypeId;

    private String serviceName;
    
	  @ManyToOne
	  @JoinColumn(name = "department_id")
	 private Department department;

	public ServiceType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceType(Long serviceTypeId, String serviceName) {
		super();
		this.serviceTypeId = serviceTypeId;
		this.serviceName = serviceName;
	}

	public Long getServiceTypeId() {
		return serviceTypeId;
	}

	public void setServiceTypeId(Long serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}


    
    

}
