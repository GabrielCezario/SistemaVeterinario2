package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Pet;

public class PetRepositoryJPA extends RepositoryJPA<Pet>{

	private EntityManager entityManager;
	
	public List<Pet> listarPet(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Pet> listPet = null;
		
		try {
			listPet = entityManager.createQuery("from Pet").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listPet;
	}
	
}
