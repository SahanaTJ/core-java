package com.sahana.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
 
	@Autowired
	@Qualifier("snakename")
	private String name;
	@Autowired
	@Qualifier("8.6")
	private double length;
	@Autowired
	@Qualifier("balck red white green")
	private String color;
	@Autowired
	@Qualifier("snaketype")
	private String type;
	@Autowired
	@Qualifier("snakePoisionous")
	private String poisionous;
	
	public void snake() {
		System.out.println("Creating Sneak by  using Spring....");
		
		}
	
	
       public Snake(String name, String type, String poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}


    @Override
	public String toString() {
		return "Sneak [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
	
