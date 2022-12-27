package com.xworkz.collection.om;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SanitizerDTOTester {
  
	public static void main(String[] args) {
		
		Integer[] val=new Integer[2];
		Collection<SanitizerDTO> san=new ArrayList<SanitizerDTO>();
		SanitizerDTO san1=new SanitizerDTO(1,"Dabur", 50,"White");
		SanitizerDTO san2=new SanitizerDTO(2,"Dove", 100,"White");
		SanitizerDTO san3=new SanitizerDTO(3,"Dettol",91,"green");
		SanitizerDTO san4=new SanitizerDTO(4,"Purell", 65,"White");
		SanitizerDTO san5=new SanitizerDTO(5,"Lifebuoy",25,"White");
		SanitizerDTO san6=new SanitizerDTO(6,"Hyco", 50,"blue");
		SanitizerDTO san7=new SanitizerDTO(7,"Multani", 90,"Yellow");
		SanitizerDTO san8=new SanitizerDTO(8,"Corvil", 120,"Sky blue");
		SanitizerDTO san9=new SanitizerDTO(9,"Trust", 200,"Black");
		SanitizerDTO san10=new SanitizerDTO(10,"Godrej",20,"White");
		
		san.add(san1);
		san.add(san2);
		san.add(san3);
		san.add(san4);
		san.add(san5);
		san.add(san6);
		san.add(san7);
		san.add(san8);
		san.add(san9);
		san.add(san10);
		System.out.println(san);
		System.out.println(san.size());
		System.out.println("...........................");
		System.out.println("..............price>5...............");
		Iterator<SanitizerDTO> itr=san.iterator();
		while(itr.hasNext()) {
			SanitizerDTO element=itr.next();
			if(element.getPrice()>5) {
				System.out.println("element get recoverd "+ element);
			}
		}
				System.out.println(san);
				System.out.println("............................");
				
				System.out.println(".............Null..............");
				for(SanitizerDTO element:san) {
				
					if(element.getId()==0 || element.getBrand()==null || element.getColor()==null) {
					System.out.println(element);
					
			}
		}
				System.out.println("..............................");
					System.out.println("................remove color..........");
					Iterator<SanitizerDTO> itr2=san.iterator();
					while(itr2.hasNext()) {
						SanitizerDTO element=itr2.next();
								if("red".equals(element.getColor()) ||"green".equals(element.getColor())||"blue".equals(element.getColor())) 
								{
								System.out.println("remove element"+element);
								itr2.remove();
			}
				
		}
					System.out.println(san);
					System.out.println("total sanitizer are"+san.size());
					Iterator<SanitizerDTO> itr3=san.iterator();
		
		
	}

}
