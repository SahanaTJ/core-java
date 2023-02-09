package com.xworkz.autowired.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Government {

	@Autowired
	@Qualifier("nameOfGovt")
	private String name;
	@Autowired
	@Qualifier("nameOfPresident")
	private String presidentName;
	@Autowired
	@Qualifier("tenuree")
	private double tenure;
	@Autowired
	@Qualifier("members")
	private int totalMembers;
	@Autowired
	@Qualifier("majorityCheck")
	private boolean majority;
	
	public Government() {
		System.out.println("Created Government by spring...");
	}

	@Override
	public String toString() {
		return "Government [name=" + name + ", presidentName=" + presidentName + ", tenure=" + tenure
				+ ", totalMembers=" + totalMembers + ", majority=" + majority + "]";
	}
	
	
}


