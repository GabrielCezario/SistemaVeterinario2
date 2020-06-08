package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.TipoAnimal;
import repository.jpa.ITipoAnimalRepositoryJPA;

public class TipoAnimalRepositoryJPA extends RepositoryJPA<TipoAnimal> implements ITipoAnimalRepositoryJPA{

	private EntityManager entityManager;
	
	public List<TipoAnimal> listarTipoAnimal(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<TipoAnimal> listTipoAnimal = null;
		
		try {
			listTipoAnimal = entityManager.createQuery("from TipoAnimal").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listTipoAnimal;
	}
	
	public List<TipoAnimal> listarTipoAnimalPorNome(String nome){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<TipoAnimal> listTipoAnimal = null;
		
		try {
			listTipoAnimal = entityManager.createQuery("from TipoAnimal where nome ='"+nome+"'").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listTipoAnimal;
	}
	
}
