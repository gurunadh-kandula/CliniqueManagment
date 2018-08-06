package com.jda.model;

public class Doctor {

	String doctorname;
	String id;
	String specialization;
	String availability;
	//public int appointments[] = { 5, 5, 5, 5, 5, 5, 5 };

	public String getDoctorName() {
		return doctorname;
	}

	public void setDoctorName(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getDoctorId() {
		return id;

	}

	public void setDoctorId(String id) {
		this.id = id;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;

	}

	@Override
	public String toString() {
		return "\n{ \"doctor Name\" : " + doctorname + "\n\"doctor Id\"  : " + id + "\n\"specialization\" : "
				+ specialization + "\n\"availabilty\" : " + availability + "}";
	}

}
