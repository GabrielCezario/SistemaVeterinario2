package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Atendente;
import repository.jpa.IAtendenteRepositoryJPA;

public class AtendenteRepositoryJPA extends RepositoryJPA<Atendente> implements IAtendenteRepositoryJPA{
	
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
	
	public List<Atendente> listAtendentePorNome(String nome){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Atendente> listAtendente = null;
		
		try {
			listAtendente = entityManager.createQuery("from Atendente where nome = '"+nome+"'").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listAtendente;		
	}

}
