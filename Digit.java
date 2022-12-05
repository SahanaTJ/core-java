package com.java.util.scanner;

import java.util.Scanner;

public class Digit {


	  public static void main(String args[]){
	   
	   int num=1234;
	   int count=0;
	   Scanner sc = new Scanner(System.in);
	   while(num!=0){
	   
	   num=num/10;
	   count++;
	   }
	  System.out.println("count the given number"+ count);
	  
	  }

	}

