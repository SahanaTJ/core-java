package com.sahana.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
 
	@Autowired
	@Qualifier("carengine")
	private String name;
	@Autowired
	@Qualifier("typeOfEngine")
	private String typee;
	@Autowired
	@Qualifier("engineNumber")
	private String number;
	@Autowired
	@Qualifier("7.8")
	private int version;
	@Autowired
	@Qualifier("comapnyname")
	private String comapany;
	@Autowired
    @Qualifier("engineStrokes")
	private String steokes;
	
	public Engine() {
		System.out.println("Creating Engine by using spring...");
	}
	
	public Engine(String name, String typee, String comapany) {
		super();
		this.name = name;
		this.typee = typee;
		this.comapany = comapany;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", typee=" + typee + ", number=" + number + ", version=" + version
				+ ", comapany=" + comapany + ", steokes=" + steokes + ", getVersion()=" + getVersion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
