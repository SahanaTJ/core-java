package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindTotalDaysByName {

	public static void main(String[] args) {
		System.out.println("Running in FindTotalDaysByName");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findTotalDaysByName");
		Object obj = query.getSingleResult();
		Integer td = (Integer) obj;
		System.out.println(td);
		manager.close();

	}
}
