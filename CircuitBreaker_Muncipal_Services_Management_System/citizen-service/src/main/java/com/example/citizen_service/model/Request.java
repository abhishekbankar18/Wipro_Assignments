package com.example.citizen_service.model;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
public class Request {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private String title;
    private String description;

//    @ManyToOne
//    @JoinColumn(name = "status_id")
//    private RequestStatus status;
//
//    @ManyToOne
//    @JoinColumn(name = "citizen_id")
//    private Citizen citizen;

    
    private Long assignedEmployeeId; 
    private Long departmentId;       

    private Instant createdDate;
    private Instant updatedDate;

    @PrePersist
    public void prePersist() {
        this.createdDate = Instant.now();
        this.updatedDate = Instant.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedDate = Instant.now();
    }

	public void setStatus(RequestStatus status) {
		// TODO Auto-generated method stub
		
	}
}
