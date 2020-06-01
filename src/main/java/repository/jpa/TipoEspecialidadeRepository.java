package repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.TipoEspecialidade;

public class TipoEspecialidadeRepository extends RepositoryJPA<TipoEspecialidade>{
	
	private EntityManager entityManager;
	
	public List<TipoEspecialidade> listarEspecialidade(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<TipoEspecialidade> listEspecialidade = null;
		
		try {
			listEspecialidade = entityManager.createQuery("from TipoEspecialidade").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		return listEspecialidade;
	}

}
