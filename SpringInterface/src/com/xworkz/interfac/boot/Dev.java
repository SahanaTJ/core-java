package com.xworkz.interfac.boot;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Dev {
 
	public static void main(String[] args) {
		
	System.out.println("Main method started");
		
		try {    //forname is forcefully handle the runtime exception
	Class tester = Class.forName("com.xworkz.interfac.boot.Dev");
		
		System.out.println("Class loaded Successfully..");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		
		System.out.println("Main method ended");
    
		} 
		public static void m1() throws ClassNotFoundException {
			m2();
		}
		private static void m2() throws ClassNotFoundException {
		}
		private static void m3() throws ClassNotFoundException {
			Class.forName("com.xworkz.interfac.boot.Dev");
		}
	}
}

//exception at forcefully
//default 2
//default handle by catch
//another one developer
//java.lang.ClassNotFoundException


//Creating our own Exception ---- Custom EXception
// 2 types of exception
//compile time and runtime example
//or checked exception or unchecked

//
