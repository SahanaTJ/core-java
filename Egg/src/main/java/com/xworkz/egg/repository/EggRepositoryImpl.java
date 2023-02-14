package com.xworkz.egg.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.EggDTO;

@Repository
public class EggRepositoryImpl implements EggRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public EggRepositoryImpl() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDTO dto){
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