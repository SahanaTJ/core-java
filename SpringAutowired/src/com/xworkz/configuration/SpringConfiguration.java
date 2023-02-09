package com.xworkz.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.components")
public class SpringConfiguration {
  

	@Bean
	public String roleName() {
		System.out.println("registering role");
		return "SoftwareEngineer";
	}
	
	@Bean
	public int years() {
		System.out.println("registering years..");
		int ref = 10;
		return ref;
	}
	
	@Bean
	public String companyName() {
		System.out.println("registering company name...");
		return "Infosys";
	}
	
	///////////////////////////////////////////////////////////////
	
	@Bean
	public String nameOfGovt() {
		System.out.println("registering name...");
		return "BJP";
	}
	
	@Bean 
	public String nameOfPresident() {
		System.out.println("registering president name..");
		return "NarendrModi";
		
	}
	
	@Bean
	public double tenuree() {
		System.out.println("registering tenure..");
		return 5;
	}
	
	@Bean 
	public int members() {
		System.out.println("registering members..");
		return 251;
	}
	
	@Bean
	public boolean majorityCheck() {
		System.out.println("registering majority...");
		return true;
	}
	
    ///////////////////////////////////////////////////////////////
	
	
	@Bean 
	public int idValue() {
		System.out.println("registering id value..");
		return 101;
	}
	
	@Bean 
	public String nameOfHardware() {
		System.out.println("registering name...");
		return "Keyboard";
	}
	
	@Bean
	public double number() {
		System.out.println("registering gst number...");
		return 123.5;
	}
	
	@Bean
	public String owner() {
		System.out.println("registering owner name..");
		return "sahana";
	}
	
	@Bean
	public String addresss() {
		System.out.println("registering address...");
		return "Rajajinagar";
	}
	
    ///////////////////////////////////////////////////////////////
	
	
	@Bean
	public String nameOfSoftware() {
		System.out.println("registering name...");
		return "Eclipse";
	}
	
	
	@Bean
	public String developerName() {
		System.out.println("registering developer name...");
		return "Omkar";
	}
	
	@Bean
	public LocalDate datee() {
		System.out.println("registering date..");
		return LocalDate.of(2010, 10, 31);
	}
	
	@Bean 
	public boolean freeSoftware() {
		System.out.println("registering free...");
		return true;
	}
	
     ///////////////////////////////////////////////////////////////
	
	@Bean
	public String nameOfPencil() {
		System.out.println("registering name..");
		return "Nataraja";
	}
	
	@Bean
	public String typeOfPencil() {
		System.out.println("registering type..");
		return "Led";
	}
	
	@Bean
	public double priceOfPencil() {
		System.out.println("registering price..");
		return 10;
	}
	
	@Bean
	public String colorr() {
		System.out.println("registering color..");
		return "Red";
	}
	
	@Bean
	public boolean sharpp() {
		System.out.println("registering sharp..");
		return true;
	}
	
	@Bean
	public boolean stolenn() {
		System.out.println("registering stolen..");
		return false;
	}
	
     ///////////////////////////////////////////////////////////////
	
	
	@Bean
	public String nameOfRubber() {
		System.out.println("registering name..");
		return "Doms";
	}
	
	@Bean
	public String typeOfRubber() {
		System.out.println("registering type..");
		return "wood";
	}
	
	@Bean
	public double priceOfRubber() {
		System.out.println("registering price..");
		return 20;
	}
	
	@Bean
	public String colorOfRubber() {
		System.out.println("registering color..");
		return "White";
	}
	
	@Bean
	public String shapeOfRubber() {
		System.out.println("registering shape..");
		return "Square";
	}
	
	@Bean
	public boolean stolennn() {
		System.out.println("registering stolen..");
		return false;
	}
	
	@Bean
	public String sizeOfRubber() {
		System.out.println("registering size..");
		return "small";
	}
	
    ///////////////////////////////////////////////////////////////
	
	
	@Bean
	public String nameOfEngg() {
		System.out.println("registering name..");
		return "Swapna";
	}
	
	@Bean
	public String company() {
		System.out.println("registering company..");
		return "AxisBank";
	}
	
	@Bean
	public int expOfEngineer() {
		System.out.println("registering experience..");
		return 1 ;
	}
	
	@Bean
	public double salaryOfEngineer() {
		System.out.println("registering salary..");
		return 40000.00 ;
	}
	
     ///////////////////////////////////////////////////////////////
	
	
	@Bean
	public byte idOfPerson() {
		System.out.println("registering id..");
		return 15;
	}
	
	@Bean
	public short ageOfPerson() {
		System.out.println("registering age..");
		return 23;
	}
	
	@Bean
	public String nameOfPerson() {
		System.out.println("registering name..");
		return "Sahana";
	}
	
	@Bean
	public int expOfPerson() {
		System.out.println("registering exp..");
		return 1;
	}
	
	@Bean
	public long mobileNoo() {
		System.out.println("registering mobile no..");
		return 8618461535L;
	}
	
	@Bean
	public double salaryOfPerson() {
		System.out.println("registering salary..");
		return 40000.00;
	}
	
	@Bean
	public float heightOfPerson() {
		System.out.println("registering height..");
		return 3.6F;
	}
	
	@Bean
	public boolean isAliveOrNot() {
		System.out.println("registering alive..");
		return true;
	}
	
	@Bean
	public char chhh() {
		System.out.println("registering char..");
		return 'S';
	}
	
}

