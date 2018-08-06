package com.jda.model;

public class Patient {
	String patientName;
	String patientId;
	long mobileNumber;
	int age;
   
    public String getPatientName() {
		return patientName;

	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMoblieNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}
	@Override
	public String toString() {
		return "\n{ \"patientName\" : " + patientName + "\n\"patientId\"  : " + patientId + "\n\"mobileNumber\" : " + mobileNumber+ "\n\"age\" : "
				+ age + "}";
	}
}
