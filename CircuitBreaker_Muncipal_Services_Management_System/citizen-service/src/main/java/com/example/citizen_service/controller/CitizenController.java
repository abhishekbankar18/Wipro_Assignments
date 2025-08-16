package com.example.citizen_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.citizen_service.model.Citizen;
import com.example.citizen_service.model.Request;
import com.example.citizen_service.service.CitizenService;

import java.util.List;

@RestController
@RequestMapping("/citizens")
public class CitizenController {

    @Autowired
    private CitizenService citizenService;

    @GetMapping
    public List<Citizen> getAllCitizens() {
        return citizenService.getAllCitizens();
    }

    @GetMapping("/{id}")
    public Citizen getCitizenById(@PathVariable Long id) {
        return citizenService.getCitizenById(id);
    }

    @PostMapping
    public Citizen addCitizen(@RequestBody Citizen citizen) {
        return citizenService.addCitizen(citizen);
    }

    @PutMapping("/{id}")
    public Citizen updateCitizen(@PathVariable Long id, @RequestBody Citizen updatedCitizen) {
        return citizenService.updateCitizen(id, updatedCitizen);
    }

    @DeleteMapping("/{id}")
    public void deleteCitizen(@PathVariable Long id) {
        citizenService.deleteCitizen(id);
    }

    @GetMapping("/requests")
    public List<Request> getAllRequests() {
        return citizenService.getAllRequests();
    }

    @GetMapping("/requests/{id}")
    public Request getRequestById(@PathVariable Long id) {
        return citizenService.getRequestById(id);
    }

    @PostMapping("/requests")
    public Request addRequest(@RequestBody Request request) {
        return citizenService.addRequest(request);
    }

    @PutMapping("/requests/{id}/status")
    public Request updateRequestStatus(@PathVariable Long id, @RequestParam String status) {
        return citizenService.updateRequestStatus(id, status);
    }

    @DeleteMapping("/requests/{id}")
    public void deleteRequest(@PathVariable Long id) {
        citizenService.deleteRequest(id);
    }
}

