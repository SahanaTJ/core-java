package com.xworkz.autowired.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberType")
	private String type;
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	@Autowired
	@Qualifier("rubberSize")
	private int size;
	@Autowired
	@Qualifier("rubberPrice")
	private double price;
	@Autowired
	@Qualifier("rubberShape")
	private String shape;
	@Autowired
	@Qualifier("rubberStolen")
	private boolean stolen;

	@Override
	public String toString() {
		return "Rubber [rubber=" + name + ", type=" + type + ", color=" + color + ", size=" + size + ", price=" + price
				+ ", shape=" + shape + ", stolen=" + stolen + "]";
	}
}
