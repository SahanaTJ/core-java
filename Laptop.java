package com.xworkz.springframework.components;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	public Laptop() {
		System.out.println("Laptop is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Laptop";
	}
}
