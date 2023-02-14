package com.xworkz.cm.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.cm.dto.CMDTO;

@Repository
public class CMRepositoryImpl implements CMRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public CMRepositoryImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(CMDTO dto){
		System.out.println("running the save");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		manager.close();
		return false;
	}

}

