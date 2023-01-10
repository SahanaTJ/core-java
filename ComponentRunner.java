package com.xworkz.meven.components;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.meven.configuaration.SpringConfiguaration;

public class ComponentRunner {
  
	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
	}
}
