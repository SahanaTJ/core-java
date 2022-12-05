package com.java.util.scanner;

import java.util.Scanner;

public class FibonocciSeries {
  
	public static void main(String args[]) {
		
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int nextTerm=0;
		int num=6;
		int firstTerm=0;
		int secondTerm=1;
		for(int i=1;i<=num;i++) {
	
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		System.out.println(nextTerm);
			
		}
	}
