package com.xworkz.components;

import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser{
 
	public  Chrome() {
		System.out.println("Creating Chrome using no-argu const.....");
	}

	@Override
	public void Connect() {
		System.out.println("Running Connect Browser");
	}

	@Override
	public void Browser() {
	
		
	}
}
