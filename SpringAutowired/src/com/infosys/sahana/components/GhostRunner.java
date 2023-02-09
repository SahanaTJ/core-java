package com.infosys.sahana.components;



import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.configuration.GhostConfiguration;
import com.sahana.java.spring.Engine;
import com.sahana.java.spring.Ghost;
import com.sahana.java.spring.NewsPaper;
import com.sahana.java.spring.Snake;



public class GhostRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);
		
		String[] ref = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		
		NewsPaper ref1 = container.getBean(NewsPaper.class);
		System.out.println(ref1);
		
		Engine ref2 = container.getBean(Engine.class);
		System.out.println(ref2);
		
		Snake ref3 = container.getBean(Snake.class);
		System.out.println(ref3);
		
		Ghost ref4 = container.getBean(Ghost.class);
		System.out.println(ref4);
		
	}

}

