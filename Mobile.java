package com.xworkz.springframework.components;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
	public Mobile() {
		System.out.println("Mobile is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Mobile";
	}
}
