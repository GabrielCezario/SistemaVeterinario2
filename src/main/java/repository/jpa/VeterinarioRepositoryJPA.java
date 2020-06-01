package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Veterinario;

public class VeterinarioRepositoryJPA extends RepositoryJPA<Veterinario>{

	private EntityManager entityManager;
	
	public List<Veterinario> listarVeterinario(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Veterinario> listVeterinario = null;
		
		try {
			listVeterinario = entityManager.createQuery("from Veterinario").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listVeterinario;
	}
	
}
