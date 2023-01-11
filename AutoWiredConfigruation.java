package com.xworkz.configuration;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.configuration")
public class AutoWiredConfigruation {
	public AutoWiredConfigruation() {
		System.out.println("Running Constructor AutoWired");
	}

	@Bean("ownerName")

	public String HardwareShopOwnerName() {
		return "Sindhu";
	}

	@Bean("address")
	public String HardwareShopAddress() {
		return "Banglore";
	}

	@Bean("name")

	public String HardwareShopName()

	{
		return "Happy Service Shop";
	}

	@Bean("id")
	public int HardwareShopId() {

		return 10;
	}

	@Bean("gstNo")
	public String HardwareShopGstNo() {
		return "GSTIN202285966";
	}

	@Bean("developer")

	public String softwareDeveloper() {
		return "Java Developer";
	}

	@Bean("name")

	public String softwareName() {
		return "Sahana";
	}

	@Bean("version")

	public String softwareVersion() {
		return "V6.10";

	}

	@Bean("free")

	public Boolean softwareFree() {
		return true;
	}

	@Bean("date")

	public LocalDate softwareDate() {
		return LocalDate.now();
	}

	@Bean("engineername")

	public String softwareEngineerName() {
		return "Sahana";
	}

	@Bean("engineerCompany")

	public String softwareEngineerCompany() {
		return "FirstAmerica";
	}

	@Bean("engineerSalary")

	public Double softwareEngineerSalary() {
		return 223120D;
	}

	@Bean("experience")
	public int softwareEngineerExpperience() {
		return 1;
	}

	@Bean("color")
	public String pencilColor() {
		return "Red";
	}

	@Bean("Pencilname")

	public String pencilName() {
		return "Nataraj";
	}

	@Bean("type")
	public String penciltype() {
		return "Writing";
	}

	@Bean("pencilprice")
	public Double pencilPrice() {
		return 10.5;
	}

	@Bean("Sharp")
	public Boolean pencilSharp() {
		return false;
	}

	@Bean("stolen")
	public Boolean pencilStolen() {
		return false;
	}

	@Bean("rubberStolen")
	public Boolean rubberStolen() {
		return false;
	}


	@Bean("rubberName")
	public String rubberName() {
		return "Apsara";
	}

	@Bean("rubberType")
	public String rubberType() {
		return "Rubber";
	}

	@Bean("rubberColor")
	public String rubberColor() {
		return "White";
	}

	@Bean("rubberShape")
	public String rubberShape() {
		return "Square";
	}

	@Bean("rubberSize")
	public int rubberSize() {
		return 2;
	}

	@Bean("rubberPrice")
	public double rubberPrice() {
		return 102.0;
	}

	@Bean("bekaryName")
	public String bekaryName() {
		return "Manjunath";
	}

	@Bean("bekaryAddress")
	public String bekaryAddress() {
		return "Bengalore";
	}

	@Bean("bekaryOwnerName")
	public String bekaryOwnerName() {
		return "Ravi Teja";
	}

	@Bean("bekaryState")
	public String bekaryState() {
		return "Karnataka";
	}

	@Bean("bekaryProduct")
	public String bekaryProduct() {
		return "Bread";
	}
	
	@Bean("workers")
	public int bekaryNoOfWorkers()
	{
		return 10;
	}
	
	@Bean("area")
	public String bekaryArea()
	{
		return "Kelmbelli";
	}
	
	@Bean("bekaryPinCode")
	public int bekaryPinCode()
	{
		return 577542;
	}
	@Bean("bekaryDate")
	public LocalDate bekarydate()
	{
		return LocalDate.now();
	}
	
}