package com.example.appointment_service.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.appointment_service.model.Appointment;
import com.example.appointment_service.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @PostMapping
    public Appointment bookAppointment(@RequestBody Appointment appointment) {
        return service.bookAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAppointments() {
        return service.getAllAppointments();
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable Long id) {
        return service.getAppointmentById(id);
    }

    @PutMapping("/cancel/{id}")
    public String cancelAppointment(@PathVariable Long id) {
        service.cancelAppointment(id);
        return "Appointment cancelled";
    }
}
