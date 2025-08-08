package com.model;

import java.time.LocalDate;

public class AppointmentService 
{
	DoctorRepository doctorRepository;

	public DoctorRepository getDoctorRepository() {
		return doctorRepository;
	}

	public void setDoctorRepository(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}
	
	public String book(String doctorId, String dateStr)
	{
		LocalDate date = LocalDate.parse(dateStr);
		
		if(doctorRepository.isDoctorAvailable(doctorId, date))
		{
			return "Appointment confirmed";
		}
		else
		{
			return "Doctor not available";
		}
	}
	
}
