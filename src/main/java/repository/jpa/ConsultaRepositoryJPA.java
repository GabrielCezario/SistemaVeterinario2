package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Consulta;

public class ConsultaRepositoryJPA extends RepositoryJPA<Consulta>{

	private EntityManager entityManager;
	
	public List<Consulta> listConsulta(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Consulta> listConsulta = null;
		
		try {
			listConsulta = entityManager.createQuery("from Consulta").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listConsulta;
	}
	
}
