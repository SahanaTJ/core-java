package com.xworkz.showroomapp.showroom;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Manager {
	

		private String name;
		private Gender gender;
		private long contactNo;
		private int age;
		
		
		public void displayInfo() {
			System.out.println("Enter manager name");
			System.out.println("Enter manager id");
			System.out.println("Enter manager contact number");
			System.out.println("Enter manager address");
		}

	}

	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}
}