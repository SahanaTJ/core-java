package com.xworkz.autowired.boot;

import java.awt.Color;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Rubber {
	@Autowired
	@Qualifier("nameOfRubber")
	private String name;
	@Autowired
	@Qualifier("typeOfRubber")
	private String type;
	@Autowired
	@Qualifier("priceOfRubber")
	private double prie;
	@Autowired
	@Qualifier("colorOfRubber")
	private String color;
	@Autowired
	@Qualifier("shapeOfRubber")
	private String shape;
	@Autowired
	@Qualifier("stolennn")
	private boolean stolen;
	@Autowired
	@Qualifier("sizeOfRubber")
	private String size;
	
	
	public Rubber() {
		System.out.println("Created Rubber by spring..");
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", prie=" + prie + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
	
	

}
