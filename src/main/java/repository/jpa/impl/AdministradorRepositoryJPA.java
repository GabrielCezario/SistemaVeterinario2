package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Administrador;
import repository.jpa.IAdministradorRepositoryJPA;

public class AdministradorRepositoryJPA extends RepositoryJPA<Administrador> implements IAdministradorRepositoryJPA{

	private EntityManager entityManager;
	
	public List<Administrador> listarAdministrador(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Administrador> listaAdministrador = null;
		
		try {
			listaAdministrador = entityManager.createQuery("from Administrador").getResultList();			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listaAdministrador;		
	}
	
	public List<Administrador> listarAdministradorPorNome(String nome){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Administrador> listaAdministrador = null;
		
		try {
			listaAdministrador = entityManager.createQuery("from Administrador where nome = '"+nome+"'").getResultList();			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listaAdministrador;		
	}
	
}
