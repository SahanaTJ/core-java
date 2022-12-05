package com.java.util.scanner; //write a program to count the number of characters in given string without using length() method in java

public class StringLength {
  
	public static void main(String args[]) throws Exception {
	      String str = "sampleString";
	      int i = 0;
	      for(char c: str.toCharArray()) {
	         i++;
	      }
	      System.out.println("Length of the given string ::"+i);
	   }
	}

