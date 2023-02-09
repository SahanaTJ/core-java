package com.xworkz.components;

import org.springframework.stereotype.Component;

@Component
public class Petrol  implements Fuel{

	public void consume() {
	System.out.println("Creating petrol usind no-arg const..");
	}
 
}
