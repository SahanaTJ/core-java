package com.xwork.movie.components;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	private Lens lens;
	private Battery battery;
	
	public void Camera() {
		System.out.println("Camera is Created");
	}
}
