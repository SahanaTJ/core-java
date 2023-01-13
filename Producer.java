package com.xwork.movie.components;

import org.springframework.stereotype.Component;

@Component
public class Producer {
 
	private Company company ;
	private Assistant assistant;
	
	public void Producer() {
		System.out.println("Producer is Created");
	}
}
