package com.jda.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.jda.model.Patient;
import com.jda.utility.Utility;

public class PatientService {
	Utility utility = new Utility();
	public static ArrayList<Patient> list = new ArrayList<Patient>();
	ObjectMapper mapper = new ObjectMapper();
	public static int id = 1;

	private Patient createUser() {
		Patient patient = new Patient();
		System.out.println("Enter patient name");
		patient.setPatientName(utility.inputstring());
		patient.setPatientId(Integer.toString(id));
		System.out.println("Enter   " + patient.getPatientName() + "   mobile number");
		patient.setMoblieNumber(utility.inputLong());
		System.out.println("Enter  " + patient.getPatientName() + "  age");
		patient.setAge(utility.inputInteger());
		id++;
		return patient;
	}

	public  void add(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		read(filename);
		list.add(createUser());
		save(filename);
		
	}

	public void remove(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter Patients's Id whose data should be removed");
		String patientId = utility.inputString();
		int count = 0;

		for (Patient P : list) {
			if (patientId.equals(P.getPatientId())) {
				list.remove(P);
				count++;
			}

			save(filename);
			if (count == 0)
				System.out.println("Data not found");
		}

	}

	public void print(String filename) throws JsonParseException, JsonMappingException, IOException {
		File newFile = new File(
				"C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme\\files\\" + filename + ".json");
		if (newFile.length() == 0)
			System.out.println("File is empty");
		else {
			read(filename);
			for (Patient P : list) {
				System.out.println(P.toString());
			}
		}
	}
	public void save(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(
				new File("C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme\\files\\" + filename + ".json"),
				list);
		System.out.println(".....Doctors data Saved....");
	}

	public void read(String filename) throws JsonParseException, JsonMappingException, IOException {

		list = mapper.readValue(
				new File("C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme\\files\\" + filename + ".json"),
				new TypeReference<ArrayList<Patient>>() {
				});

	}
	
	}

