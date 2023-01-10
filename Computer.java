package com.xworkz.springframework.components;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	public Computer() {
		System.out.println("Computer is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Computer";
	}
}
