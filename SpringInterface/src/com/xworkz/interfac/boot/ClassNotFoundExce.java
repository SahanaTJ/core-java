package com.xworkz.interfac.boot;

public class ClassNotFoundExce {
  
	public static void main(String[] args) {
	System.out.println("Main method started");	
	}
		private static void  loadClass() throws ClassNotFoundException {
			Class classLoaded = Class.forName("com.xworkz.interfac.boot.ClassNotFoundException");
			
		}
		
	}

