package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Pet;
import repository.jpa.IPetRepositoryJPA;

public class PetRepositoryJPA extends RepositoryJPA<Pet> implements IPetRepositoryJPA{

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
	
	public List<Pet> listarPetPorNome(String nome){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Pet> listPet = null;
		
		try {
			listPet = entityManager.createQuery("from Pet where nome = '"+nome+"'").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listPet;
	}
	
}
