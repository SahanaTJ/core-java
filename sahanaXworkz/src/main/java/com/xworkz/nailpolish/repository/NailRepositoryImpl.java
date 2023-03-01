package com.xworkz.nailpolish.repository;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.nailpolish.entity.NailEntity;

@Repository
public class NailRepositoryImpl implements NailRepository {

	@Autowired
	private EntityManagerFactory EntityManagerFactory;

	public NailRepositoryImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(NailEntity entity) {
		EntityManager entityManager = this.EntityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public NailEntity findById(int id) {
		System.out.println("find by id in repo" + id);
		EntityManager entityManager = this.EntityManagerFactory.createEntityManager();
		NailEntity fromDb = entityManager.find(NailEntity.class, id);
		entityManager.close();
		return fromDb;
	}
 
	@Override
	public List<NailEntity> findByBrandName(String brandname){
		 
		EntityManager manager = this.EntityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByBrandName");
			query.setParameter("bname", brandname);
			List<NailEntity> list =query.getResultList();
			System.out.println("Toatl List found in repo " + list.size());
	return list;
	
		}finally {
			
		manager.close();
		
	}
 }
}