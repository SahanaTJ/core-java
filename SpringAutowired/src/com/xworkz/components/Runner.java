package com.xworkz.components;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.boot.FirstTime;
import com.xworkz.autowired.boot.Government;
import com.xworkz.autowired.boot.HardwareShop;
import com.xworkz.autowired.boot.Pencil;
import com.xworkz.autowired.boot.PersonalData;
import com.xworkz.autowired.boot.Rubber;
import com.xworkz.autowired.boot.Software;
import com.xworkz.autowired.boot.SoftwareEngineer;
import com.xworkz.configuration.SpringConfiguration;

public class Runner {
  
public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		String[] ref = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		
		FirstTime ref1 = spring.getBean(FirstTime.class);
		System.out.println(ref1);
		
		Government ref2 = spring.getBean(Government.class);
		System.out.println(ref2);
		
		HardwareShop ref3 = spring.getBean(HardwareShop.class);
		System.out.println(ref3);
		
		Software ref4 = spring.getBean(Software.class);
		System.out.println(ref4);
		
		Pencil ref5 = spring.getBean(Pencil.class);
		System.out.println(ref5);
		
		Rubber ref6 = spring.getBean(Rubber.class);
		System.out.println(ref6);
		
		SoftwareEngineer ref7 = spring.getBean(SoftwareEngineer.class);
		System.out.println(ref7);
		
		PersonalData ref8 = spring.getBean(PersonalData.class);
		System.out.println(ref8);
	}

}


