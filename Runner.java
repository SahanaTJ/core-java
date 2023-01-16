package com.xworkz.interfac.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.components.PetrolBunk;
import com.xworkz.configuration.PetrolBunkConfiguration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(PetrolBunkConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBean(PetrolBunk.class));
		
		PetrolBunk bunk = container.getBean(PetrolBunk.class);
		PetrolBunk.purchase();
	}
}


