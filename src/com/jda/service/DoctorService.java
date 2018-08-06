package com.jda.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.jda.model.Doctor;

import com.jda.utility.Utility;

public class DoctorService {
	Utility utility = new Utility();
	public static ArrayList<Doctor> list = new ArrayList<Doctor>();
	ObjectMapper mapper = new ObjectMapper();
	public static int id = 1;

	private Doctor createUser() {
		Doctor doctor = new Doctor();
		System.out.println("Enter doctor name");
		doctor.setDoctorName(utility.inputstring());
		doctor.setDoctorId(Integer.toString(id));
		System.out.println("Enter" + doctor.getDoctorName() + "'s specialization");
		doctor.setSpecialization(utility.inputstring());
		System.out.println("Enter" + doctor.getDoctorName() + "availability");
		doctor.setSpecialization(utility.inputstring());
		id++;
		return doctor;

	}

	public ArrayList<Doctor> add(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		list.add(createUser());
		save(filename);
		return list;

	}

	public void remove(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter doctor's Id whose data should e removed");
		String doctorId = utility.inputString();
		int count = 0;

		for (Doctor Dr : list) {
			if (doctorId.equals(Dr.getDoctorId())) {
				list.remove(Dr);
				count++;
			}

			save(filename);
			if (count == 0)
				System.out.println("Data not found");
		}

	}

	public void print(String filename) throws JsonParseException, JsonMappingException, IOException {
		File newFile = new File(
				"C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme" + filename + ".json");
		if (newFile.length() == 0)
			System.out.println("File is empty");
		else {
			read(filename);
			for (Doctor Dr : list) {
				System.out.println(Dr.toString());
			}
		}
	}

	public void save(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(
				new File("C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme" + filename + ".json"),
				list);
		System.out.println(".....Doctors data Saved....");
	}

	public void read(String filename) throws JsonParseException, JsonMappingException, IOException {

		list = mapper.readValue(
				new File("C:\\Users\\1023404\\eclipse-workspace\\CliniqueManagementProgramme" + filename + ".json"),
				new TypeReference<ArrayList<Doctor>>() {
				});

	}

}
