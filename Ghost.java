package com.sahana.java.spring;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
  
	@Autowired
	@Qualifier("Panipuri")
	private String name;
	@Autowired
	@Qualifier("ghostDontNow")
	private String gender;
	@Autowired
	@Qualifier("ghostFatherName")
	private String ghostFatherName;
	@Autowired
	@Qualifier("ghostSisterName")
	private String ghostMotherName;
	@Autowired
	@Qualifier("ghostSisterName")
	private String ghostSisterName;
	@Autowired
	@Qualifier("ghostBrotherName")
	private String ghostBrotherName;
	@Autowired
	@Qualifier("ghostWhitebalck")
	private String color;
	@Autowired
	@Qualifier("ghostHeight")
	private String height;
	@Autowired
	@Qualifier("ghostWeight")
	private String weight;
	@Autowired
	@Qualifier("2023-25-12")
	private LocalDate date;
	@Autowired
	@Qualifier("ghostLocation")
	private String location;
	@Autowired
	@Qualifier("ghostNumber")
	private double number;
	@Autowired
	@Qualifier("ghostaddress")
	private String address;
	@Autowired
	@Qualifier("ghostFullWhiteColorEstaAnthee")
	private String dress;
	@Autowired
	@Qualifier("ghostWhite")
	private String dressColor;
	@Autowired
	@Qualifier("2023-1-24")
	private LocalDate comingDate;
	@Autowired
	@Qualifier("ghostFavFood")
	private String ghostFavFood;
	@Autowired
	@Qualifier("ghostMalige")
	private String ghostFavFlower;
	@Autowired
	@Qualifier("ghostFruitjuice")
	private String ghostFavjuice;
	@Autowired
	@Qualifier("ghostBanglore")
	private String favpalce;
	@Autowired
	@Qualifier("ghostJuiceShop")
	private String favShop;
	
	public void Ghost() {
		System.out.println("Creating Ghost by  using Spring....");
		
		}
	public Ghost(String name, String gender, String color, LocalDate date, String dress, String dressColor,
			LocalDate comingDate, String ghostFavFlower, String ghostFavjuice, String favpalce, String favShop) {
		super();
		this.name = name;
		this.gender = gender;
		this.color = color;
		this.date = date;
		this.dress = dress;
		this.dressColor = dressColor;
		this.comingDate = comingDate;
		this.ghostFavFlower = ghostFavFlower;
		this.ghostFavjuice = ghostFavjuice;
		this.favpalce = favpalce;
		this.favShop = favShop;
	}
	
	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", ghostFatherName=" + ghostFatherName
				+ ", ghostMotherName=" + ghostMotherName + ", ghostSisterName=" + ghostSisterName
				+ ", ghostBrotherName=" + ghostBrotherName + ", color=" + color + ", height=" + height + ", weight="
				+ weight + ", date=" + date + ", location=" + location + ", number=" + number + ", address=" + address
				+ ", dress=" + dress + ", dressColor=" + dressColor + ", comingDate=" + comingDate + ", ghostFavFood="
				+ ghostFavFood + ", ghostFavFlower=" + ghostFavFlower + ", ghostFavjuice=" + ghostFavjuice
				+ ", favpalce=" + favpalce + ", favShop=" + favShop + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
