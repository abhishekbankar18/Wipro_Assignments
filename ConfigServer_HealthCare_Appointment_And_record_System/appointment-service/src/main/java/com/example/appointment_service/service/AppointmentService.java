package com.example.appointment_service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.appointment_service.model.Appointment;
import com.example.appointment_service.repository.AppointmentRepository;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository repository;

    public Appointment bookAppointment(Appointment appointment) {
        return repository.save(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }

    public Appointment getAppointmentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void cancelAppointment(Long id) {
        Appointment app = repository.findById(id).orElse(null);
        if(app != null) {
            app.setStatus("CANCELLED");
            repository.save(app);
        }
    }
}
