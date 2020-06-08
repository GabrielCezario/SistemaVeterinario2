package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Pessoa;
import repository.jpa.IPessoaRepositoryJPA;

public class PessoaRepositoryJPA extends RepositoryJPA<Pessoa> implements IPessoaRepositoryJPA{

	private EntityManager entityManager;
	
	public List<Pessoa> listarPessoa(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Pessoa> listPessoa = null;
		
		try {
			listPessoa = entityManager.createQuery("from Pessoa").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listPessoa;
	}
	
}
