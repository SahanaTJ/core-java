package com.xworkz.springframework;

import org.springframework.stereotype.Component;

@Component
public class MobileNetwork {

	public MobileNetwork() {
		System.out.println("MobileNetwork is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "MobileNetwork";
	}
}
