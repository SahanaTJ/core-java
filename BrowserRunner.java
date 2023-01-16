package com.xworkz.interfac.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.components.Airtel;
import com.xworkz.components.Browser;
import com.xworkz.components.Chrome;
import com.xworkz.components.FireBox;
import com.xworkz.components.Jio;
import com.xworkz.components.PetrolBunk;
import com.xworkz.components.Provider;
import com.xworkz.configuration.BrowserConfiguration;

public class BrowserRunner {
 
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBean(Browser.class));
		
		Browser br = container.getBean(Browser.class);
		br.Connect();
		
		Chrome ch = container.getBean(Chrome.class);
		ch.Connect();
		
		FireBox fr = container.getBean(FireBox.class);
		fr.Connect();
		
		Provider pr = container.getBean(Provider.class);
		pr.connect();
		
		Airtel ai = container.getBean(Airtel.class);
		ai.connect();
		
		Jio jo = container.getBean(Jio.class);
		jo.connect();
	}
	
}
