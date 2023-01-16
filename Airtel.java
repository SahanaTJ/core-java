package com.xworkz.components;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{

	public  Airtel() {
		System.out.println("Creating Airtel using no-argu const.....");
	}
	
	@Override
	public void connect() {
		System.out.println("Running connect Provider");
		
	}

}
