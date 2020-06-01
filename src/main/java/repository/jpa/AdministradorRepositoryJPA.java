package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Administrador;

public class AdministradorRepositoryJPA extends RepositoryJPA<Administrador>{

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
	
}
