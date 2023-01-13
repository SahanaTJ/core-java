package com.xwork.movie.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xwork.movie")
public class MovieConfiguration {
 
	public  MovieConfiguration() {
		System.out.println("Creating MovieConfiguration by using No-argument Constructor");
	}
}
