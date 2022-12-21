package com.xworkz.collection.om;

import java.util.Collection;
import java.util.TreeSet;

public class Sweets {
  
	public static void main(String args[]) {
		
		 String sweet1 = "Gulab Jamun";
		 String sweet2 = "Jalebi";
		 String sweet3 = "Kheer Payasa";
		 String sweet4 = "Shrikhand";
		 String sweet5 = "Rasgulla";
		 String sweet6 = "Ghevar";
		 String sweet7 = "Champakallki";
		 String sweet8 = "Malpua";
		 String sweet9 = "Bebinca";
		 String sweet10 = "Mysore Pak";
		 String sweet11 = "Balushahi";
		 String sweet12 = "Badam Ka Halva";
		 String sweet13 = "Khaja";
		 
		 Collection <String> collection = new TreeSet();
			collection.add(sweet1);
			collection.add(sweet2);
			collection.add(sweet3);
			collection.add(sweet4);
			collection.add(sweet5);
			collection.add(sweet6);
			collection.add(sweet7);
			collection.add(sweet8);
			collection.add(sweet9);
			collection.add(sweet10);
			collection.add(sweet11);
			collection.add(sweet12);
			collection.add(sweet13);
			
			collection.add("Gajar Ka Halwa");
			
			
			collection.clear();
			System.out.println("After Clear...");
			System.out.println(collection.size());
					
	}
}
