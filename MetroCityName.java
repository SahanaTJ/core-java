package com.xworkz.collection.om;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityName {
  
	public static void main(String args[]) {
		
		String name1 ="Banglore";
		String name2 ="Channai";
		String name3 ="kerala";
		String name4 ="Kolkatha";
		String name5 ="Delhi";
		
      Collection<String> collection = new ArrayList<String>();
      
      collection.add(name5);
      collection.add(name2);
      collection.add(name3);
      collection.add(name4);
      collection.add(name1);
      

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
