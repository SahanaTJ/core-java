package com.xworkz.components;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

      public  Jio() {
		System.out.println("Creating Jio using no-argu const.....");
      }
      
	@Override
	public void connect() {
		System.out.println("Running connect Provider");
		
	}

}
