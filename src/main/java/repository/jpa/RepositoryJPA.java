package repository.jpa;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.BaseEntity;

public class RepositoryJPA<T extends BaseEntity>{
	
	private EntityManager entityManager;

	public T save(T t) {
		entityManager = new ConnectionJPA().getEntityManager();
		
		try {
			entityManager.getTransaction().begin();
			
			if(t.getId() == null)
				entityManager.persist(t);
			else
				t = entityManager.merge(t);
			
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}
		
		return t;
	}
	
	public void delete(Class<T> clazz, Integer id) {
		entityManager = new ConnectionJPA().getEntityManager();
		
		T t = entityManager.find(clazz, id);
		
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(t);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}
	}
	
	public T findById(Class<T> clazz, Integer id) {
		entityManager = new ConnectionJPA().getEntityManager();
		
		T t = null;
		
		try {
			t = entityManager.find(clazz, id);
		} finally {
			entityManager.close();
		}
		
		return t;
	}

}
