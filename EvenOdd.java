package com.java.util.scanner;

import java.util.Scanner;

public class EvenOdd {
   
	public static void main(String args[]) {
		int x=9;
		Scanner sc = new Scanner(System.in);
		if(x%2==0) {
			System.out.println("even");
			
		}else {
			System.out.println("Odd");
		}
	}
}
