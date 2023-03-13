package com.xworkz.nailpolish.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
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
		System.out.println("Running save in repoImpl " + entity);
		EntityManager entityManager = this.EntityManagerFactory.createEntityManager();// an interface provided by Java
																						// Persistence API
		EntityTransaction transaction = entityManager.getTransaction();// Return the resource-level EntityTransaction
																		// object.
		transaction.begin();
		entityManager.persist(entity); // save data to database
		transaction.commit();
		entityManager.close(); // break the connection pool
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
	public List<NailEntity> findByBrandName(String brandname) {
		EntityManager manager = this.EntityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByBrandName");
			query.setParameter("bname", brandname);
			List<NailEntity> list = query.getResultList(); //
			System.out.println("Toatl List found in repo " + list.size());
			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean update(NailEntity entity) {
		EntityManager manager2 = this.EntityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager2.getTransaction();
			transaction.begin();
			manager2.merge(entity);
			transaction.commit();
			return true;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager2.close();
		}
		return false;
	}

	@Override
	public NailEntity onDelete(int id) {
		EntityManager manager = this.EntityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		NailEntity entity = manager.find(NailEntity.class, id);
		if (entity != null) {
			transaction.begin();
			manager.remove(entity);
			transaction.commit();
			manager.close();
			return entity;
		} else {
			return NailRepository.super.onDelete(id);
		}
	}

	@Override
	public List<NailEntity> list() {
		System.out.println("list on repo");
		EntityManager manager = this.EntityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("list");
			List list = query.getResultList();
			list.forEach(p -> System.out.println(p));
			return list;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return NailRepository.super.list();
	}

	@Override
	public List<NailEntity> findNameAndColor(String name, String color) {
		System.out.println("findNameAndColor in repo");
		EntityManager manager = this.EntityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findNameAndColor");
			query.setParameter("name", name);
			query.setParameter("color", color);
			List list = query.getResultList();
			list.forEach(p -> System.out.println(p));
			if (list.isEmpty()) {
				System.out.println("not mathed both color and name");
				Query findByName = manager.createNamedQuery("findByName");
				findByName.setParameter("byname", name);
				Query findByColor = manager.createNamedQuery("findByColor");
				findByColor.setParameter("bycolor", color);
				List findByNameList = findByName.getResultList();
				List findByColorList = findByColor.getResultList();
				ArrayList<NailEntity> list2 = new ArrayList<NailEntity>();
				list2.addAll(findByNameList);
				list2.addAll(findByColorList);
				list2.forEach(p -> System.out.println(p));
				return list2;
			}
			return list;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return NailRepository.super.findNameAndColor(name, color);
	}

}
