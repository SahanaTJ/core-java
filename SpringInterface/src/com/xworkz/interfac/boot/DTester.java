package com.xworkz.interfac.boot;

public class DTester {
  
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		DTester.jingaalala();
		System.out.println("Main method ended");
	}
	
	public static  void jingaalala() {
		System.out.println("Inside jingaalala method");
		jingaalala();  //StackOverFlowError
	
	}
}

//jvm will throw the exception
//throwable is class
// is extends the all child class