package com.xworkz.valentine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.valentine.entity.ValentineEntity;

public class JPARunner {

	public static void main(String[] args) {
		System.out.println("Do not write in.... its not need...");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		ValentineEntity entity = new ValentineEntity();
		entity.setName("Remeo");
		entity.setValentineName("Juliet");
		entity.setGifts("Rose");
		entity.setPlaces("Heaven");
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
	}
}
