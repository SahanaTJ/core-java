package com.xworkz.collection.om;

import java.util.Collection;

import java.util.TreeSet;

public class Coupoun {
  
	public static void main(String args[]) {
		
       String Coupoun1 = "Schoolpack";
       String Coupoun2 = "Singleday";
       String Coupoun3 = "Social";
       String Coupoun4 = "Marker Earn";
       String Coupoun5 = "Profit cash";
       String Coupoun6 = "coupon hive";
       String Coupoun7 = "Invoic teller";
       String Coupoun8 = "Afford invest";
       String Coupoun9 = "Finance care";
       String Coupoun10 = "Flow hoggle";
       String Coupoun11 = "Cheap town bargains";
       String Coupoun12 = "Monny Saves big";
       
       Collection <String>collection = new TreeSet();
		collection.add(Coupoun1);
		collection.add(Coupoun2);
		collection.add(Coupoun3);
        collection.add(Coupoun4);
        collection.add(Coupoun5);
        collection.add(Coupoun6);
        collection.add(Coupoun7);
        collection.add(Coupoun8);
        collection.add(Coupoun9);
        collection.add(Coupoun10);
        collection.add(Coupoun11);
        collection.add(Coupoun12);
        
		collection.add("Good Redeem");
		
		 collection.clear();
		System.out.println("After Clear...");
		System.out.println(collection.size());
	}
}
