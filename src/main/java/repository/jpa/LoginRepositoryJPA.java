package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Login;

public class LoginRepositoryJPA extends RepositoryJPA<Login>{

	private EntityManager entityManager;
	
	public List<Login> listarLogin(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Login> listLogin = null;
		
		try {
			listLogin = entityManager.createQuery("from Login").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listLogin;
	}
	
	public Login buscarLogin(Login login) {
		
		entityManager = new ConnectionJPA().getEntityManager();
		Login loginData = null;
		
		try {
			loginData = (Login) entityManager.createQuery("from Login where login = '" + login.getLogin() + "'" + " and senha = '" + login.getSenha() + "'").getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return loginData;		
	}
	
	public Integer verificarLoginExistente(Login login) {
		
		entityManager = new ConnectionJPA().getEntityManager();
		Integer id = null;
		
		try {
			id = entityManager.createQuery("from Login where login = '" + login.getLogin() + "'").getFirstResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return id;		
	}
	
	
	
}
