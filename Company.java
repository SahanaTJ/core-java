package com.xwork.movie.components;

import org.springframework.stereotype.Component;

@Component
public class Company {
 
	private Location location;
	public Company() {
		System.out.println("Company is Created");
	}
}
