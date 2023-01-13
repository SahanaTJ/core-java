package com.xwork.movie.components;

import org.springframework.stereotype.Component;

@Component
public class Location {

	private Area area;

	public Location() {

		System.out.println("Location Created");
	}
}
