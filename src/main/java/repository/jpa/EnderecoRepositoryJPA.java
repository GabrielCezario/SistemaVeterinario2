package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Endereco;

public class EnderecoRepositoryJPA extends RepositoryJPA<Endereco>{

	private EntityManager entityManager;
	
	public List<Endereco> listarEndereco(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Endereco> listEndereco = null;
		
		try {
			listEndereco = entityManager.createQuery("from Endereco").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listEndereco;
	}
	
}
