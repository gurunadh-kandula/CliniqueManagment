package com.jda.model;

public class Appointment {
	String doctorid;
	String specialiazation;
	String patientid;
	String time;
	String date;

	public Appointment(String doctorid, String specialiazation, String patientid, String time, String date) {
		this.doctorid = doctorid;
		this.specialiazation = specialiazation;
		this.patientid = patientid;
		this.time = time;
		this.date = date;
	}
	public Appointment()
	{}

	public String getDoctorId() {
		return doctorid;
	}

	public void setDoctorId(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getSpecialiazation() {
		return specialiazation;
	}

	public void setSpecialization(String specialiazation) {
		this.specialiazation = specialiazation;
	}

	public String getPatientId() {
		return patientid;
	}

	public void setPatientId(String patientid) {
		this.patientid = patientid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;

	}

	@Override
	public String toString() {
		return "\n{ \"doctor Id\" : " + doctorid + "\n\"specialiazation\"  : " + specialiazation + "\n\"patient Id\"  : "
				+ patientid + "\n\"Time\" : " + time + "\n\"Date\" : " + date + "}";
	}
}