package com.xworkz.aeroplane.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByName {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager  manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findStateByName");
		Object obj = query.getSingleResult();
		String state =(String) obj;
		System.out.println(state);
		manager.close();
	}
}
