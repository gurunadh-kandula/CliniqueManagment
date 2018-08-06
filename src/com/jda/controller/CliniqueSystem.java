package com.jda.controller;

import com.jda.service.AppointmentAlloter;
import com.jda.service.DoctorService;
import com.jda.service.PatientService;
import com.jda.utility.Utility;

public class CliniqueSystem {
	public static void main(String args[]) throws Exception {
		Utility utility = new Utility();
		int choice;
		int select;
		PatientService patientservice = new PatientService();
		DoctorService doctorservice = new DoctorService();
		AppointmentAlloter appointmentalloter;
		String doctorsfile = "doctors";
		String patientsfile = "patients";
		String appointmentsfile = "appointments";

		do {
			System.out.println("WELCOME TO CLINIQUE MANAGEMENT PROGRAMME");
			System.out.println("*********************");
			System.out.println("MAIN MENU----");
			System.out.println("1.Doctor service  2.Patient service  3.Appointment   4.close address book application");
			choice = utility.inputInteger();
			switch (choice) {
			case 1:
				do {
					System.out.println(
							"1.ADD Doctor  2.Remove Doctor  3.PRINT Doctors  4.Search patients by ID  5.Search doctors by ID  6.CLOSE Doctor service");
					select = utility.inputInteger();
					switch (select) {
					case 1:
						doctorservice.add(doctorsfile);
						break;
					case 2:
						doctorservice.remove(doctorsfile);
						break;

					case 3:
						doctorservice.print(doctorsfile);
						break;
					case 4:

					case 5:
						doctorservice.search();
						break;
					case 6:
						select = 0;
						break;
					}
				} while (select != 0);
				break;
			case 2:
				do {
					System.out.println(
							"1.ADD Patient  2.Remove Patient 3.PRINT patients  4.Search doctors by ID  5.CLOSE");
					select = utility.inputInteger();
					switch (select) {

					case 1:
						patientservice.add(patientsfile);
						break;
					case 2:
						patientservice.remove(patientsfile);
						break;
					case 3:
						patientservice.print(patientsfile);
						break;
					case 4:
						doctorservice.search();
						break;
					case 5:
						select = 0;
						break;
					}

				} while (select != 0);
				break;
			case 3:
				appointmentalloter = new AppointmentAlloter();
				appointmentalloter.load(doctorsfile, patientsfile);
				do {
					System.out.println(
							"1.Make an appointment 2.PRINT Appointments 3.PRINT Doctor-Patient Report 4.CLOSE appointment section");
					select = utility.inputInteger();
					switch (select) {
					case 1:
						appointmentalloter.add(appointmentsfile);
						break;
					case 2:
						appointmentalloter.print(appointmentsfile);
						break;

					case 3:
						System.out.println("Please enter the doctors id");
						String Did = utility.inputstring();
						System.out.println("PLease enter the patients id");
						String Pid = utility.inputstring();
						appointmentalloter.DrPatientReport(Pid, Did);
						break;
					case 4:
						select = 0;
						break;

					}
				} while (select != 0);
				break;
			case 4:
				choice = 0;

			}
		} while (choice != 0);
	}

}
