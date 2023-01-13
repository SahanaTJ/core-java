package com.xwork.movie.components;

import org.springframework.stereotype.Component;

@Component
public class Movie {
  
	private Director director;
	private CameraMan cameraMan;
	
	public void Movie() {
		System.out.println("Director is Created Movie");
	}
}
