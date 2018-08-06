package com.jda.model;

public class Patient {
	String patientname;
	String id;
	long mobilenumber;
	int age;
    public int appointments[]={5,5,5,5,5,5,5,5};
    public String getPatientName() {
		return patientname;

	}

	public void setPatientName(String patientname) {
		this.patientname = patientname;
	}

	public String getPatientId() {
		return id;
	}

	public void setPatientId(String id) {
		this.id = id;
	}

	public long getMobileNumber() {
		return mobilenumber;
	}

	public void setMoblieNumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}
	@Override
	public String toString() {
		return "\n{ \"patient Name\" : " + patientname + "\n\"patient Id\"  : " + id + "\n\"mobilenumber\" : " + mobilenumber+ "\n\"age\" : "
				+ age + "}";
	}
}
