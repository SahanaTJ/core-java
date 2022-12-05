package com.java.util.scanner;

import java.util.Scanner;

public class AmstrongNumber {
   
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num= 153;
		int sum=0;
		int temp=num;
		int n;
		while (num>0) {
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
			}
		if(temp==sum) {
			System.out.println("number");	
			
		}else {
		System.out.println("not");
		
	}
}
}