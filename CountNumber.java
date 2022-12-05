package com.java.util.scanner;

import java.util.Scanner;

public class CountNumber {
   
	public static void main(String args[]) {
		int n, count=0;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Number of digits:" +count);
	}
}
