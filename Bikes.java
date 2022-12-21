package com.xworkz.collection.om;

import java.util.Collection;
import java.util.TreeSet;

public class Bikes {
  
	public static void main(String args[]) {
		
		String bike1 = "Pulsar";
		String bike2 = "Royal Enfield";
		String bike3 = "Hero Splender Plus";
		String bike4 = "Suzuki Hayabusa";
		String bike5 = "Ducati Panigal";
		String bike6 = "BMW M 1000 RR";
		String bike7 = "BMW S 1000 RR";
		String bike8 = "Bajaj Pulsar 200NS";
		String bike9 = "BMW R Nine T";
		String bike10 = "Bajaj Platina";
		String bike11 = "Bajaj Pulsar 220F";
		String bike12 = "Bajaj Avenger Street 160";
		String bike13 = "Bajaj Domainar 400";
		String bike14 = "Aprillia RSV4";
		String bike15 = "Bajaj CT 110";
		String bike16 = "Bajaj Pulsar RS";
		String bike17 = "TVS Apache  RS200";
		String bike18 = "Apache";
		
		Collection <String> collection = new TreeSet();
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);
		collection.add("New Pulsar 800");
		
		 collection.clear();
		System.out.println("After Clear...");
		System.out.println(collection.size());
	}
}
