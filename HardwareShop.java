package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.components.Bekary;
import com.xworkz.configuration.AutoWiredConfigruation;

public class HardwareShop {
   
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoWiredConfigruation.class);
		String[] ref = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

		HardwareShop hardwareShop = applicationContext.getBean(HardwareShop.class);
		System.out.println(hardwareShop);

		Software software = applicationContext.getBean(Software.class);
		System.out.println(software.toString());

		Pencil pencil = applicationContext.getBean(Pencil.class);
		System.out.println(pencil.toString());
		Bekary bekary=applicationContext.getBean(Bekary.class);
		System.out.println(bekary);
		
		
		Rubber rubber=applicationContext.getBean(Rubber.class);
		System.out.println(rubber.toString());
		
		

	}

}
