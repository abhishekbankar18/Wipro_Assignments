package com.example.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.appointment_service.model.Appointment;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByPatientId(Long patientId);
}
