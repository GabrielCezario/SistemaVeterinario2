package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.DonoPet;
import repository.jpa.IDonoPetRepositoryJPA;

public class DonoPetRepositoryJPA extends RepositoryJPA<DonoPet> implements IDonoPetRepositoryJPA{
	
	private EntityManager entityManager;
	
	public List<DonoPet> listarDonoPet(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<DonoPet> listDonoPet = null;
		
		try {
			listDonoPet = entityManager.createQuery("from DonoPet").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listDonoPet;
	}
	
	public List<DonoPet> listarDonoPetPorNome(String nome){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<DonoPet> listDonoPet = null;
		
		try {
			listDonoPet = entityManager.createQuery("from DonoPet where nome = '"+nome+"'").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listDonoPet;
	}

}
