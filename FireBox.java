package com.xworkz.components;

import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser{
  
	public  FireBox() {
		System.out.println("Creating FireBox using no-argu const...");
	}
	
	@Override
	public void Browser() {
		System.out.println("Running Connect Browser");
	}

	@Override
	public void Connect() {
		// TODO Auto-generated method stub
		
	}
}
