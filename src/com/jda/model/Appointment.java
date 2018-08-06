package com.jda.model;

public class Appointment {
	String doctorid;
	String specialization;
	String patientid;
	String time;
	String date;

	public String getDoctorId() {
		return doctorid;
	}

	public void setDoctorId(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getSpecialiazation() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getPatientId() {
		return patientid;
	}
	public void setPatientId(String patientid) {
		this.patientid=patientid;
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
		return "\n{ \"doctor Id\" : " + doctorid + "\n\"specialization\"  : " + specialization+"\n\"patient Id\"  : " + patientid + "\n\"Time\" : " + time+ "\n\"Date\" : "
				+ date + "}";
	}
}