package com.xworkz.collection.om;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyName {
   
	public static void main(String args[]) {
		
		String software1 = "Infosys";
		String software2 = "Wipro";
		String software3 = "Accenture";
		String software4 = "TCS";
		String software5 = "IBM";
		String software6 = "Oracle";
		String software7 = "Cognizant";
		String software8 = "Capgemini";
		String software9 = "Cisco";
		String software10 = "Mindtree";
		String software11 = "HCL";
		String software12 = "Mu Sigma";
		String software13 = "AMazon";
		String software14 = "Dell";
		String software15 = "Hp";
		String software16 = "Tech Mahindra";
		String software17 = "SAP";
		String software18 = "Nokia";
		String software19 = "Deloitte";
		String software20 = "Intel";
		
		
		Collection<String> collection= new ArrayList<String>();
		
		collection.add(software1);
		collection.add(software2);
		collection.add(software3);
		collection.add(software4);
		collection.add(software5);
		collection.add(software6);
		collection.add(software7);
		collection.add(software8);
		collection.add(software9);
		collection.add(software10);
		collection.add(software11);
		collection.add(software12);
		collection.add(software13);
		collection.add(software14);
		collection.add(software15);
		collection.add(software16);
		collection.add(software17);
		collection.add(software18);
		collection.add(software19);
		collection.add(software20);
		

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
