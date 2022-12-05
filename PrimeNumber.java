package com.java.util.scanner;

import java.util.Scanner;

public class PrimeNumber {
  
	public static void  main(String args[]) {
		int num=10;
		int count=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("not prime");
		}else {
			System.out.println("not matched");
			}
		//reverse number
		int num1 =123;
		int reverse1=1;
		int digit,temp=0;
		while(num>0) {
			digit=num%10;
			reverse1=reverse1*10+digit;
			num=num/10;
		}
		if(temp==reverse1) {
			System.out.println("Palidrome");
		}else {
			System.out.println("not");
			
			}
	}
}
