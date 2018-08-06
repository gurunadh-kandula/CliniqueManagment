package com.jda.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.jda.model.Appointment;
import com.jda.utility.Utility;

public class AppointmentAlloter {
	Utility utility = new Utility();
	PatientService patientservice = new PatientService();
	DoctorService doctorservice = new DoctorService();
	Appointment appointment;
	ObjectMapper mapper = new ObjectMapper();
	public static ArrayList<Appointment> list = new ArrayList<Appointment>();

	public void load(String drfilename, String Pfilename) throws JsonParseException, JsonMappingException, IOException {
		patientservice.read(Pfilename);
		doctorservice.read(drfilename);
	}

	public Appointment createAppointment() {
		System.out.println("Enter the patient id");
		String Pid = utility.inputstring();
		System.out.println("please enter the speciality of the doctor");
		String specialization = utility.inputstring();
		System.out.println("These are the doctors with required specialization");
		doctorservice.searchstream(specialization);
		System.out.println("please enter the doctor's id to make an appointment");
		String DId = utility.inputstring();
		String time = doctorservice.availability(DId);
		System.out.println("please enter the date");
		String date = utility.inputstring();
		appointment = new Appointment(DId, specialization, Pid, time, date);
		return appointment;
	}

	public void add(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		list.add(createAppointment());
		save(filename);

	}

	public void print(String filename) throws JsonParseException, JsonMappingException, IOException {
		File newFile = new File(
				"C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme\\files\\" + filename + ".json");
		if (newFile.length() == 0)
			System.out.println("File is empty");
		else {
			read(filename);
			for (Appointment A : list) {
				System.out.println(A.toString());
			}
		}
	}

	public void read(String filename) throws JsonParseException, JsonMappingException, IOException {

		list = mapper.readValue(
				new File("C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme\\files\\" + filename + ".json"),
				new TypeReference<ArrayList<Appointment>>() {
				});

	}

	public void save(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(
				new File("C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme\\files\\" + filename + ".json"),
				list);
		System.out.println(".....Appointments data Saved....");
	}

	public void DrPatientReport(String Pid, String Did) {
		for (Appointment A : list) {
			if (Pid.equals(A.getPatientId())) {
				if (Did.equals(A.getDoctorId()))
					System.out.println(A);
			}

		}

	}

}
