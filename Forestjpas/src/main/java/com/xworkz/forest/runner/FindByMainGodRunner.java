package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.FestivalEntity;

public class FindByMainGodRunner {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager  manager = factory.createEntityManager();
		
		Query query = manager.createNamedQuery("findByMainGodRunner");
		Object obj = query.getSingleResult();
		
		String entity=(String)obj;
		System.out.println(entity);
		manager.close();  
		
	}

}
