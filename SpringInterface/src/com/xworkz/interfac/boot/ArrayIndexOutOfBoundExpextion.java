package com.xworkz.interfac.boot;

import java.util.Arrays;

public class ArrayIndexOutOfBoundExpextion {
  
	public static void main(String[] args) {
		
		 System.out.println("Main is Started");
		 try {
				int[] my = new int[3];
				my[0]=78;
				my[1]=90;
			    my[2]=89;
		    	my[3]=78;

		 } catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Denominator can't be exceeded than fixed one..");
		}
	}	 
}
