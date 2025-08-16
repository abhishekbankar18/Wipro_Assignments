package com.example.citizen_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.citizen_service.model.Citizen;
import com.example.citizen_service.model.Request;
import com.example.citizen_service.model.RequestStatus;
import com.example.citizen_service.repository.CitizenRepository;
import com.example.citizen_service.repository.RequestRepository;
import com.example.citizen_service.repository.RequestStatusRepository;

@Service
public class CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private RequestStatusRepository statusRepository;

    // Citizen CRUD
    public List<Citizen> getAllCitizens() {
        return citizenRepository.findAll();
    }

    public Citizen getCitizenById(Long id) {
        return citizenRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Citizen not found with id: " + id));
    }

    public Citizen addCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    public Citizen updateCitizen(Long id, Citizen updatedCitizen) {
        Citizen existing = getCitizenById(id);

        if (updatedCitizen.getName() != null) {
            existing.setName(updatedCitizen.getName());
        }
        if (updatedCitizen.getEmail() != null) {
            existing.setEmail(updatedCitizen.getEmail());
        }
        if (updatedCitizen.getPhoneNumber() != null) {
            existing.setPhoneNumber(updatedCitizen.getPhoneNumber());
        }

        return citizenRepository.save(existing);
    }

    public void deleteCitizen(Long id) {
        citizenRepository.deleteById(id);
    }

    // Request CRUD
    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Request getRequestById(Long id) {
        return requestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Request not found with id: " + id));
    }

    public Request addRequest(Request request) {
        return requestRepository.save(request);
    }

    public Request updateRequestStatus(Long requestId, String statusName) {
        Request req = getRequestById(requestId);

        RequestStatus status = statusRepository.findAll().stream()
                .filter(s -> s.getStatusName().equalsIgnoreCase(statusName))
                .findFirst()
                .orElseGet(() -> {
                    RequestStatus newStatus = new RequestStatus();
                    newStatus.setStatusName(statusName);
                    return statusRepository.save(newStatus);
                });

        req.setStatus(status);
        return requestRepository.save(req);
    }

    public void deleteRequest(Long id) {
        requestRepository.deleteById(id);
    }
}

