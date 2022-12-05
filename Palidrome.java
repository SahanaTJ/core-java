package com.java.util.scanner;

import java.util.Scanner;

public class Palidrome {
   
	public static void main(String args[]) {
		
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		int temp=num;
		while(num>0) {
			int rem=num%10;
			rev=rem*10+rev;
			num=num/10;
		}
		if(temp==rev) {
		}
		
	}
}
