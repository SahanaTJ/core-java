package com.java.util.scanner;
import java.util.Scanner;

public class Swapping {
   
	public static void main(String args[]) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter values of A");
		a=sc.nextInt();
		System.out.print("Enter values of B");
		b=sc.nextInt();
		System.out.print("\n value of a and b before swapping is A:"+a+" b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("\n value of a and b after swapping is A:"+a+" b:"+b);
	}
}
