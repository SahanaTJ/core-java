package com.xworkz.components;
import java.time.Month;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	 private String name;
	 private int duration;
   private Month startingMonth;

	public Season() {
		// TODO Auto-generated constructor stub
	}

	public Season(@Value("Winter") String name, @Value("4") int duration,
			@Value("Month.NOVEMBER") Month startingMonth) {
		this.name = name;
		this.duration = duration;
		this.startingMonth = startingMonth;
	}

	@Override
	public String toString() {
		return "Season [name=" + name + ", duration=" + duration + ", startingMonth=" + startingMonth + "]";
	}
}
