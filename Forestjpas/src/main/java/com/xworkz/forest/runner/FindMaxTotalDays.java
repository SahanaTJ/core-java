package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMaxTotalDays {

	public static void main(String[] args) {
		System.out.println("Running in FindMaxTotalDays");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMaxTotalDays");
		Object obj = query.getSingleResult();
		Integer ln = (Integer) obj;
		System.out.println(ln);
		manager.close();

	}
}
