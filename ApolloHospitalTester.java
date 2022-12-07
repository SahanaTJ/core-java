package com.xworkz.hospitalapp.hospital;

import java.util.Scanner;

public class ApolloHospitalTester {
   

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = scanner.nextInt();
		
		ApolloHospital apollo = new ApolloHospital(size);
		
		for (int i = 0; i < size; i++) {
		Patient patient = new Patient();
		System.out.println("Enter the patientName: ");
		patient.setPatientName(scanner.next());
		
		System.out.println("Enter the age: ");
		patient.setAge(scanner.nextInt());
		
		System.out.println("Enter the address: ");
		patient.setAddress(scanner.next());
		
		System.out.println("Enter the Gender: ");
		String gender = scanner.next();
		patient.setGender(Gender.valueOf(gender));// String to enum
		
		/*patient.patientName = "";
		//patient.age = 22;
		//patient.gender = Gender.Female;
		//patient.address = "Gayatrinagar";
		
		Patient patient1 = new Patient();
		patient1.patientName = "Sneha";
		patient1.age = 23;
		patient1.gender = Gender.Female;
		patient1.address = "Rajajinagar";*/
		
		apollo.addPatient(patient);	
		//apollo.addPatient(patient1);
		}
		apollo.getAllPAtients();
		
		System.out.println("Enter the patient name");
		String patientName = scanner.next();
		apollo.getPatientByName(patientName);
	
		System.out.println("Enter the patient age");
		int age = scanner.nextInt();
		apollo.getPatientByAge(age);
		
		System.out.println("Enter the patient address");
		String address = scanner.next();
		apollo.getPatientByAddress(address);
		
		System.out.println("Enter the patient gender");
		String gender = scanner.next();
		apollo.getPatientByGender(Gender.valueOf(gender));
		
		System.out.println("Enter the patient gender");
		String gender1 = scanner.next();
		apollo.getPatientNameByGender(Gender.valueOf(gender1));
		
		System.out.println("Enter the patient name");
		String patientName1 = scanner.next();
		apollo.getGenderByPatientName(patientName1);
		
		System.out.println("Enter the patient name");
		String patientName2="sachi";
		System.out.println("");
		
		
		System.out.println("");
	}

}
