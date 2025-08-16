package com.example.citizen_service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.citizen_service.model.Citizen;


public interface CitizenRepository extends JpaRepository<Citizen, Long> {
	
}

