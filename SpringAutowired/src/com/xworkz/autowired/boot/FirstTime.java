package com.xworkz.autowired.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FirstTime {
	
	@Autowired
	@Qualifier("roleName")
	private String role;
	@Autowired
	@Qualifier("years")
	private int noOfYears;
	@Autowired
	@Qualifier("companyName")
	private String company;
	
	public FirstTime() {
		System.out.println("Created Firsttime by spring..");
	}

	@Override
	public String toString() {
		return "FirstTime [role=" + role + ", noOfYears=" + noOfYears + ", company=" + company + "]";
	}

}

