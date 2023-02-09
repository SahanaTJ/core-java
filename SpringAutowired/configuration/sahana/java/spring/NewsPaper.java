package com.sahana.java.spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
  
	@Autowired
	@Qualifier("8563225")
	private int id;
	@Autowired
	@Qualifier("newspapername")
	private String name;
	@Autowired
	@Qualifier("newspaperownername")
	private String ownerName;
	@Autowired
	@Qualifier("Kannada English Hindi")
	private String language;
	@Autowired
	@Qualifier("newpaperPrice")
	private double price;
	

	public NewsPaper() {
		System.out.println("Creating Newspaper by spring...");
	}
	
	public NewsPaper(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public void newspaper() {
		System.out.println("Creating NewsPaper by  using Spring....");
		
		}

	  public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
