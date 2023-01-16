package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.components")
public class BrowserConfiguration {
  
	public BrowserConfiguration() {
		System.out.println("Creating Browser Configuration....");
	}
}
