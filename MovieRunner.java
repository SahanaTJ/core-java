package com.xwork.movie.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.movie.components.Movie;
import com.xwork.movie.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBean(Movie.class));
	}
}
