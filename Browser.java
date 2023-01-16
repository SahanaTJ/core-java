package com.xworkz.components;

import org.springframework.stereotype.Component;

@Component
public interface Browser {
 
	public static  void browser() {
		System.out.println("Creating Browser using no-argu const...");
	}

	void Browser();

	void Connect();
}
