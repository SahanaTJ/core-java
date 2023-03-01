package com.xworkz.aeroplane.entity;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ForestRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		ForestEntity entity = manager.find(ForestEntity.class,100);
		System.out.println(entity);
		manager.close(); //mandatory
		
	}
}
