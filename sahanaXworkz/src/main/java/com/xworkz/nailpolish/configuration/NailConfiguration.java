package com.xworkz.nailpolish.configuration;

import java.sql.DriverManager;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.nailpolish")
@Slf4j
public class NailConfiguration {

	public NailConfiguration() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	// used to process html form which is enctype

	@Bean
	public MultipartResolver multipartResolver() {
		System.out.println("registring MultipartResolver");
		return new StandardServletMultipartResolver();
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("registering custom view resolver,,,");
		return new InternalResourceViewResolver("/", ".jsp");// used to resolve the provided uri to actual uri
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("registering LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}

	public DataSource dataSource() {
		System.out.println("registring dataSource....");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate");
		dataSource.setPassword("Xworkzodc@123");
		dataSource.setUsername("root");
		return dataSource;
	}
}
