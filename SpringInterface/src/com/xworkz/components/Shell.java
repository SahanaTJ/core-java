package com.xworkz.components;

import org.springframework.stereotype.Component;

@Component
public class Shell  implements PetrolBunk{

	public Shell() {
		System.out.println("Creating Shell using no-argu const");
	}
	
	public void purchase() {
	System.out.println("Running purchase Shell");	
	}
}
