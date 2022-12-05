package com.java.util.scanner;
import java.util.Scanner;

public class DuplicateElements {
  
	public static void main(String args[]){
		 
		 int[] arr=new int[]{2,3,7,2,11,5,7,14};
		 Scanner sc = new Scanner(System.in);
		 for(int i=0;i<arr.length;i++){
		 for(int j=0;i<arr.length;j++){
		 
		if(i=j && arr[i]==arr[j]){

		System.out.println("Duplicate element found:"+ arr[i]);
		}
		 }
		 }
	}
}

