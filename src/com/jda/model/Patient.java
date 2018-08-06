package com.jda.model;

public class Patient {
	String patientname;
	String id;
	long mobilenumber;
	int age;
   
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
		return "\n{ \"patientname\" : " + patientname + "\n\"patientid\"  : " + id + "\n\"mobilenumber\" : " + mobilenumber+ "\n\"age\" : "
				+ age + "}";
	}
}
