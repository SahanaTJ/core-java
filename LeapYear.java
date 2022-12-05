package com.java.util.scanner;

import java.util.Scanner;

public class LeapYear {
    
	public static void main(String args[]) {
		int year=20004;
		if(year%400==0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("leap year");
		}else {
			System.out.println("not");
		}
	}
	
}
