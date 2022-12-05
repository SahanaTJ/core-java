package com.java.util.scanner;
import java.util.Scanner;

public class Decending {
   
	public static void main(String args[]) {
		int arr[] = new int[] {34,56,78,89,108,566,4};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			int temp=0;
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(arr[i]);
			}
		}
}
