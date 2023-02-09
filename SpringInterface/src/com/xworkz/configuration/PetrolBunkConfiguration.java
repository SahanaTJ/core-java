package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.components")
public class PetrolBunkConfiguration {

	public PetrolBunkConfiguration() {
		System.out.println("Created PetrolBunk Configuration");
	}
	
}