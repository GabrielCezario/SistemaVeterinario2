package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.DonoPet;

public class DonoPetRepositoryJPA extends RepositoryJPA<DonoPet>{
	
	private EntityManager entityManager;
	
	public List<DonoPet> listarDonoPet(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<DonoPet> listDonoPet = null;
		
		try {
			listDonoPet = entityManager.createQuery("from DonotPet").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listDonoPet;
	}

}
