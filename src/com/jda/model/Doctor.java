package com.jda.model;

public class Doctor {

	String doctorName;
	String doctorId;
	String specialiazation;
	String availability;
	//public int appointments[] = { 5, 5, 5, 5, 5, 5, 5 };

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorname) {
		this.doctorName = doctorname;
	}

	public String getDoctorId() {
		return doctorId;

	}

	public void setDoctorId(String id) {
		this.doctorId = id;
	}

	public String getSpecialization() {
		return specialiazation;
	}

	public void setSpecialization(String specialization) {
		this.specialiazation = specialization;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;

	}

	@Override
	public String toString() {
		return "\n{ \"doctorname\" : " + doctorName + "\n\"doctorId\"  : " +doctorId + "\n\"specialiazation\" : "
				+ specialiazation + "\n\"availabilty\" : " + availability + "}";
	}

}
