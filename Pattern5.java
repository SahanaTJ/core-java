package com.java.util.scanner;

import java.util.Scanner;

public class Pattern5 {
  
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row>=col) {
					System.out.print("*");
				}else {
					//System.out.printl("");
					}
			}
			System.out.println();
		}
	}
}
