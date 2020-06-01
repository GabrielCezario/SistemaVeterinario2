package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Atendente;

public class AtendenteRepositoryJPA extends RepositoryJPA<Atendente>{
	
	private EntityManager entityManager;
	
	public List<Atendente> listAtendente(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Atendente> listAtendente = null;
		
		try {
			listAtendente = entityManager.createQuery("from Atendente").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listAtendente;		
	}

}
