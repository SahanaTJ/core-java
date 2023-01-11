package com.xworkz.autowired.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("Pencilname")
	private String name;
	@Autowired
	@Qualifier("type")
	private String type;
	@Autowired
	private String color;
	@Autowired
	@Qualifier("pencilprice")
	private Double price;
	@Autowired
	@Qualifier("Sharp")
	private Boolean sharp;

	@Autowired
	@Qualifier("stolen")
	private Boolean stolen;

	public Pencil() {
		// TODO Auto-generated constructor stub
	}

}
