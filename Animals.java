package com.xworkz.collection.om;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {
  
	public static void main(String args[]) {
		
		String animal1 = "Tiger";
		String animal2 = "Elephant";
		String animal3 = "Lion";
		String animal4 = "Bear";
		String animal5 = "Rabbit";
		String animal6 = "Monkey";
		String animal7 = "Deer";
		String animal8 = "Wolf";
		String animal9 = "Kangaroo";
		String animal10 = "Boar";
		 
	
		Collection<String> collection = new ArrayList<String>();
		collection.add(animal10);
	    collection.add(animal9);
	    collection.add(animal8);
	    collection.add(animal7);
	    collection.add(animal6);
	    collection.add(animal5);
	    collection.add(animal4);
	    collection.add(animal3);
	    collection.add(animal2);
	    collection.add(null);
	    collection.add(animal1);
	    
		
		System.out.println(collection.size());
		System.out.println(collection);
		System.out.println("Accessing all the element from collection...");
		
		//for each
		
		for(String element:collection) {
			System.out.println(element);
		}
		System.out.println("......Iterator......");
		
	    Iterator<String> itr = collection.iterator();
	    while(itr.hasNext())
		{
			String element = itr.next();
			System.out.println(element);
		}
	}
}

