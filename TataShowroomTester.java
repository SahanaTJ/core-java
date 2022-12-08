package com.xworkz.showroomapp.showroom;
import java.util.Scanner;

public class TataShowroomTester {
  
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		TataShowroom bj = new TataShowroom(size);
		
		for(int i = 0; i < size; i++) {
		
		Manager mg = new Manager();
		
		System.out.println("Enter manager name");
		mg.setName(sc.next());
		
		System.out.println("Enter manager age");
		mg.setAge(sc.nextInt());
		
		System.out.println("Enter manager contact number");
		mg.setContactNo(sc.nextLong());
		
		System.out.println("Enter manager gender");
		String gender = sc.next();
		mg.setGender(Gender.valueOf(gender));
		
		bj.addManager(mg);
		
		}
		
		System.out.println("Enter manager name");
		String name = sc.next();
		bj.getManagerByName(name);
		
		System.out.println("Enter manager age");
		int age = sc.nextInt();
		System.out.println("Enter new name");
		String name1 = sc.next();
		bj.updateManagerNameByAge(age, name1);
		
		bj.getAllManagerDetails();
		
		System.out.println("Enter manager age we want to delete");
		int age2 = sc.nextInt();
		bj.deleteManagerByAge(age2);
		
		bj.getNewManager();
}

}