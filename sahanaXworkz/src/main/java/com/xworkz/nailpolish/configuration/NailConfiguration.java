package com.xworkz.nailpolish.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.nailpolish")
public class NailConfiguration {

	public NailConfiguration() {
		  System.out.println("Created" + this.getClass().getSimpleName());
			}
			
			@Bean 
			public ViewResolver viewResolver() {
				System.out.println("registering custom view resolver,,,");
				return new InternalResourceViewResolver("/",".jsp");//used to resolve the provided uri to actual uri
		}
			@Bean
			public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		    	System.out.println("registering LocalContainerEntityManagerFactoryBean");
				return new LocalContainerEntityManagerFactoryBean();
   }
}

