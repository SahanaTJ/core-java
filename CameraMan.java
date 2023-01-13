package com.xwork.movie.components;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {
  
	private Camera camera;
	
	public void CameraMan() {
		System.out.println("CameraMan is Created");
	}
}
