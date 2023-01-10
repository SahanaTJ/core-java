package com.xworkz.components;
import java.util.Locale.LanguageRange;

import org.springframework.stereotype.Component;

@Component
public class Actor {
	 private String name;
	 private String language;
	 private int age;

	public Actor() {
		System.out.println("Actor component");
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", language=" + language + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
