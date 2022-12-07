package com.xworkz.hospitalapp.hospital;

public class ApolloHospital  extends Hospital {
	
	//one to many

	public Patient[] patients;// has a relationship
	int index;
	
	
	public ApolloHospital(int size) {
		// TODO Auto-generated constructor stub
	}

	public void ApolloHospitals(int size) {
		patients = new Patient[size]; // to avoid the runtime 
	}
	
	public boolean addPatient(Patient patient) {
		System.out.println("Inside addPatient method ");
		 boolean isPatientAdded = false;
		 if(patient != null) {
			 System.out.println("Patient's details are right.... go ahead");
			 patients[index++] = patient ;
			 	isPatientAdded = true;
			 //index++;
		 }
		 return isPatientAdded;
	}
	
	public void getAllPAtients() {
		System.out.println("Lists of patients are: ");
		for(int i = 0; i < patients.length; i++) {
			System.out.println(patients[i].getPatientName()+" "+ patients[i].getClass()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
		}
		
	}
	public void getPatientByName(String patientName) {
		System.out.println("Inside getPatientByName");
		System.out.println("No of parameters : 1 : patientName(String)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(patientName)) {
		System.out.println(patients[i].getPatientName()+" "+ patients[i].getClass()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}else {
				System.out.println("No patient found in this lists");
			}
		}
	}
	
	public void getPatientByAge(int age) {
		System.out.println("Inside getPatientByAge");
		System.out.println("No of parameters : 1 : age(int)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getAge().equals(age)) {
				System.out.println(patients[i].getPatientName()+" "+ patients[i].getClass()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}else {
				System.out.println("No patient found in this lists");
			}
		}
	}
	
	public void getPatientByGender(Gender gender) {
		System.out.println("Inside getPatientByGender");
		System.out.println("No of parameters : 1 : gender(Gender)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName()+" "+ patients[i].getClass()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}else {
				System.out.println("No patient found in this lists");
			}
		}
	}
	
	public void getPatientByAddress(String address) {
		System.out.println("Inside getPatientByAddress");
		System.out.println("No of parameters : 1 : address(String)");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getClass().equals(address)) {
				System.out.println(patients[i].getPatientName()+" "+ patients[i].getClass()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}else {
				System.out.println("No patient found in this lists");
			}
		}
	}
	
	public void getPatientNameByGender(Gender gender) {
		System.out.println("Inside getPatientNameByGender");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName());
			}else {
				System.out.println("No patient found");
			}
		}
	}
	
	public void getGenderByPatientName(String patientName) {
		System.out.println("Inside getGenderByPatientName");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getGender());
			}else {
				System.out.println("No patient found");
			}
		}
	}

	public boolean updatePatientAddressByName(String name, String newPatientAddress) {
		boolean isUpdated = false;
		System.out.println("Inside updatedPatientAddressByName");
		System.out.println("No of parameters: 2: 1)param patientname(string)2)param patientAddress");
		for(int i=0;i<patients.length;i++) {
			
			if(patients[i].getPatientName().equals(name)) {
			System.out.println("patient name is matched...processed with updating the address");
		patients[i].setAddress(newPatientAddress);
		        isUpdated=true;
			}
		}
		

	   //return isEmergency;
		
		return isUpdated;
	}
	public boolean deletePatientByName(String PatientName) {
		boolean isDeleted = false;
		Patient[] newPatients = new Patient[patients.length-1];
		//int j=0;
		
		int k;
		for(int i=0; k=0; i <patients.length;i++) {
			if(!patients[i].getPatientName().equals(PatientName)) {
				newPatients[k++]=patients[i];
				isDeleted = true;
		//System.out.println(Array.toString(newPatients.));		
		}
	}
		return isDeleted;
	}
	public void getAllNewPatients() {
		
	}

}

 
//how do achive inheritance by using extends keyword
//how do achive encapasulation by using  private keyword  
//how do achive polymorphism by inheritance is-a-relationship


    //getPatientByAge(int age)
    //getPatientByGender(Gender)
    //getPatientByAddress(String Address)
    //getPatienrNameByGender(String)

