package com.xworkz.components;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {

	public void Fuel() {
		System.out.println("Creating Fuel");
	}

	@Override
	public void consume() {
		System.out.println("Running ");
		
	}
	
}

