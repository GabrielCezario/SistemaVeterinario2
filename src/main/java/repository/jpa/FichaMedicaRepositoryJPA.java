package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.FichaMedica;

public class FichaMedicaRepositoryJPA extends RepositoryJPA<FichaMedica>{

	private EntityManager entityManager;
	
	public List<FichaMedica> listarFichaMedica(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<FichaMedica> listFichaMedica = null;
		
		try {
			listFichaMedica = entityManager.createQuery("from FichaMedica").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listFichaMedica;
	}
	
}
