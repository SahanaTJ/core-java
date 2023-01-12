package com.infosys.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.components")
public class GhostConfiguration {

	@Bean
	public String name() {
		System.out.println("registering Name");
		return "NewsPaper";
	}
	
	@Bean
	public int id() {
	  System.out.println("registering Id");
	  int ref = 10;
		return ref ;
	}	
	@Bean 
	public String language() {
		System.out.println("registering language");
		return "Kannada";
	}	
       /////////////////////////////////////////////////////////////
		
	@Bean
	public String name1() {
		System.out.println("registering name");
		return "Engine";
	}
		
	@Bean
	public int version() {
		System.out.println("registering Version");
		int ref1 = 8563;
		return ref1;
	}
   
	@Bean
	public String comapany() {
		System.out.println("registering company");
		return "ref2";
	}
	
	///////////////////////////////////////////////////////////////
	
	@Bean
	public String name2() {
		System.out.println("registering name");
		return "Sneak";
	}
	
	@Bean
	public double length() {
		System.out.println("registering length");
		double ref3 =7.8;
		return ref3;
	}
	
	@Bean
	public String type() {
		System.out.println("registering type");
		return "ref4";
		
	}
	
	//////////////////////////////////////////////////////////////
	
	@Bean
	public String name3() {
		System.out.println("registering name");
		return "Ghost";
	}
	
	@Bean
	public LocalDate date() {
		System.out.println("registering date");
		return LocalDate.of(2023, 10, 31);
	}
	
	@Bean 
	private String color() {
		System.out.println("registering color");
		return "ref5";

	}
}
