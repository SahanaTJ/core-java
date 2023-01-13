package com.xwork.movie.components;

import org.springframework.stereotype.Component;

@Component
public class Battery {

	private Capacity capacity;
	
	public void Battery() {
		System.out.println("Battery Capacity created");
	}
}
