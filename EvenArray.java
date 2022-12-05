package com.java.util.scanner;

import java.util.Scanner;

public class EvenArray {


	   public static void main(String args[]){
	   
		   Scanner sc = new Scanner(System.in);
	   int a[]={2,4,6,8,1,3,5,7,10};
	   for(int i=0;i<=a.length;i++){
	   if(a[i]%2==0){
	   System.out.println(a[i]);
	   }
	   }

	   }
}