package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.components.Actor;
import com.xworkz.components.Rocket;
import com.xworkz.components.Season;
import com.xworkz.configuration.SpringConfiguration;


public class SpringRunner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Rocket rocket = context.getBean("rocket", Rocket.class);
		System.out.println("\n"+rocket.toString());

		Rocket gslv = context.getBean("gslv", Rocket.class);
		System.out.println("\n"+gslv.toString());
		
		System.out.println("=========================================================");
		
		Season season = context.getBean("season", Season.class);
		System.out.println("\n"+season.toString());
		
		Season rainy = context.getBean("rainy", Season.class);
		System.out.println("\n"+rainy.toString());
		
		System.out.println("=========================================================");

		Actor actor = context.getBean("darshan",Actor.class);
		System.out.println(actor.toString());
	}
}
