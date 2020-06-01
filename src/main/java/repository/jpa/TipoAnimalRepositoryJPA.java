package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.TipoAnimal;

public class TipoAnimalRepositoryJPA extends RepositoryJPA<TipoAnimal>{

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
	
}
