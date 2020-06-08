package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Veterinario;
import repository.jpa.IVeterinarioRepositoryJPA;

public class VeterinarioRepositoryJPA extends RepositoryJPA<Veterinario> implements IVeterinarioRepositoryJPA{

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
	
	public List<Veterinario> listarVeterinarioPorNome(String nome){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Veterinario> listVeterinario = null;
		
		try {
			listVeterinario = entityManager.createQuery("from Veterinario where nome = '"+nome+"'").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listVeterinario;
	}
	
}
