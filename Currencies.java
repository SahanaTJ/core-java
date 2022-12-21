package com.xworkz.collection.om;

import java.util.Collection;
import java.util.TreeSet;

public class Currencies {
  
	public static void main(String args[]) {
		
		String currencies1 = "Rupees";
		String currencies2 = "Afghani";
		String currencies3 = "Lek";
		String currencies4 = "Dinar";
		String currencies5 = "Euro";
		String currencies6 = "New Kwanza";
		String currencies7 = "East Caribbean ";
		String currencies8 = "Peso";
		String currencies9 = "Dram";
		String currencies10 = "Australian dollar";
		String currencies11 = "Euros";
		String currencies12 = "Manat";
		String currencies13 = "Bahrain";
		String currencies14 = "belorussian";
		String currencies15 = "Belize dollar";
		String currencies16 = "CFA ";
		String currencies17 = "Franc";
		String currencies18 = "Nigultrum";
		String currencies19 = "Convertible";
		String currencies20 = "Convertible mark";
		String currencies21 = "Pula";
		String currencies22 = "Real";
		String currencies23 = "Africa";
		String currencies24 = "Europe";
		String currencies25 = "South";
		String currencies26 = "Belgian franc";
		
		Collection <String>collection = new TreeSet();
		collection.add(currencies1);
		collection.add(currencies2);
		collection.add(currencies3);
		collection.add(currencies4);
		collection.add(currencies5);
		collection.add(currencies6);
		collection.add(currencies7);
		collection.add(currencies8);
		collection.add(currencies9);
		collection.add(currencies10);
		collection.add(currencies11);
		collection.add(currencies12);
		collection.add(currencies13);
		collection.add(currencies14);
		collection.add(currencies15);
		collection.add(currencies16);
		collection.add(currencies17);
		collection.add(currencies18);
		collection.add(currencies19);
		collection.add(currencies20);
		collection.add(currencies21);
		collection.add(currencies22);
		collection.add(currencies23);
		collection.add(currencies24);
		collection.add(currencies25);
		collection.add(currencies26);
		
		
		collection.add("indian rupees");
		
		
       collection.clear();
		System.out.println("After Clear...");
		System.out.println(collection.size());
	}
}
		
		
		
		
