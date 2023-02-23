package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroEntity;

@Repository
public class AeroRepositoryImpl implements AeroRepository {

	@Autowired
	private EntityManagerFactory EntityManagerFactory;
	
	public AeroRepositoryImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(AeroEntity entity) {
		EntityManager entityManager = this.EntityManagerFactory.createEntityManager();
	     EntityTransaction transaction = entityManager.getTransaction();
	     transaction.begin();
	     entityManager.persist(entity);
	     transaction.commit();
	     entityManager.close();
		return false;
	}
	
	@Override
	public AeroEntity findById(int id) {
		System.out.println("find by id in repo"+id);
		EntityManager entityManager = this.EntityManagerFactory.createEntityManager();
		AeroEntity fromDb = entityManager.find(AeroEntity.class, id);
		entityManager.close();
		return fromDb;
	}

}
