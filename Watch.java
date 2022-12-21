package com.xworkz.collection.om;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {
  
	public static void main(String args[]) {
		
		String watch1 = "Sonata";
		String watch2 = "Titan";
		String watch3 = "Apple";
		String watch4 = "HMT";
		String watch5 = "Smart";
		
		Collection<String> collection = new ArrayList<String>();
		
		collection.add(watch5);
		collection.add(watch4);
		collection.add(watch2);
		collection.add(watch3);
		collection.add(null);
		collection.add(watch1);
		
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
