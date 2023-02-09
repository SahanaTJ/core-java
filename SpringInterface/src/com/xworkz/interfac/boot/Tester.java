package com.xworkz.interfac.boot;

import java.util.Arrays;

public class Tester {
  
	public static void main(String[] args) {
		
	 System.out.println("Main is Started");
	//	int[] my = new int[3];
	//	my[0]=78;
	//	my[1]=90;
	//  my[2]=89;
    //	my[3]=78;
	//	System.out.println(Arrays.toString(my));
	
		
		System.out.println("Starting with actual execution....");
		int i = 90;
		 int y = 0;
		 try {
		/*	 String str = null;
			 System.out.println(str.charAt(9));
			 System.out.println(i/y);*/
			 System.out.println("Something is fishy");
			 
		 }catch(ArithmeticException ae) {
		   System.out.println("Cannot Divide number by Zero");
		
		//String str = null;
		//System.out.println(str.charAt(1));
		System.out.println("Main is Ended");
	}
}
}



//exception is abnormal event  we to handle this try catch ,triggered in the jvm
//it is event  triggered during the execution 
// exception is class
//  