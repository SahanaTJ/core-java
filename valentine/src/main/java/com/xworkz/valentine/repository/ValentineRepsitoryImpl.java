package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;

@Repository
public class ValentineRepsitoryImpl implements ValentineRepository {

	@Autowired
	private EntityManagerFactory EntityManagerFactory;
	
	public ValentineRepsitoryImpl() {
	System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(ValentineEntity entity) {
		
     System.out.println("Running save");
     EntityManager entityManager = this.EntityManagerFactory.createEntityManager();
     EntityTransaction transaction = entityManager.getTransaction();
     transaction.begin();
     entityManager.persist(entity);
     transaction.commit();
     entityManager.close();
     return false;
	}

}
