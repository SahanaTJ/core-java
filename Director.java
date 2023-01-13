package com.xwork.movie.components;

import org.springframework.stereotype.Component;

@Component
public class Director {

	private Producer Producer;
	private Experience experience;
	
	public void Director() {
		System.out.println("Director is Created");
	}
}
