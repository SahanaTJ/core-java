package com.java.util.scanner;

public class ReverseString {
  
public static void main(String args[]) {
		
		//reverse a string
		String name ="Sahana";
		System.out.println(name);
		
		//in built
		for(int i=0;i<name.length();i++) {
			System.out.print(" "+name.charAt(i));
		}
		System.out.println("   String reverse");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(" "+name.charAt(i));
			}
}
}
