package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Consulta;
import repository.jpa.IConsultaRepositoryJPA;

public class ConsultaRepositoryJPA extends RepositoryJPA<Consulta> implements IConsultaRepositoryJPA{

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
	
	public List<Consulta> listConsultaPorNomePet(String nomePet){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Consulta> listConsulta = null;
		
		try {
			listConsulta = entityManager.createQuery("SELECT DISTINCT consulta from Consulta consulta inner join consulta.pet pet where pet.nome = '"+nomePet+"'").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listConsulta;
	}
	
}
