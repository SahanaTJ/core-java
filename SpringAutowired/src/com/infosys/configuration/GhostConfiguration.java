package com.infosys.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sahana.java.spring.Engine;
import com.sahana.java.spring.Ghost;
import com.sahana.java.spring.NewsPaper;
import com.sahana.java.spring.Snake;

@Configuration
@ComponentScan("com.infosys.sahana")
public class GhostConfiguration {

	@Bean
	public String name() {
		System.out.println("registering Name");
	   NewsPaper newspaper = new NewsPaper();
		return "ref";
	}
	
	@Bean
	public int id() {
	  System.out.println("registering Id");
	  NewsPaper newspaper = new NewsPaper();
	  int ref = 10;
		return ref ;
	}	
	@Bean 
	public String language() {
		System.out.println("registering language");
		NewsPaper newspaper = new NewsPaper();
		return "ref1";
	}	
       /////////////////////////////////////////////////////////////
		
	@Bean
	public String name1() {
		System.out.println("registering name");
		Engine eng = new Engine();
		return "ref";
	}
		
	@Bean
	public int version() {
		System.out.println("registering Version");
		Engine eng = new Engine();
		int ref1 = 8563;
		return ref1;
	}
   
	@Bean
	public String comapany() {
		System.out.println("registering company");
		Engine eng = new Engine();
		return "ref2";
	}
	
	///////////////////////////////////////////////////////////////
	
	@Bean
	public String name2() {
		System.out.println("registering name");
		//Snake sn = new Snake(52, 85, 34);
		return "ref";
	}

	@Bean
	public double length() {
		System.out.println("registering length");
	//	Snake sn = new Snake();
		double ref3 =7.8;
		return ref3;
	}
	
	@Bean
	public String type() {
		System.out.println("registering type");
	//	Snake sn = new Snake();
		return "ref4";
		
	}
	
	//////////////////////////////////////////////////////////////
	
	@Bean
	public String name3() {
		System.out.println("registering name");
	//	Ghost gh = new Ghost();
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
