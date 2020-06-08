package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.TipoEspecialidade;
import repository.jpa.ITipoEspecialidadeRepository;

public class TipoEspecialidadeRepository extends RepositoryJPA<TipoEspecialidade> implements ITipoEspecialidadeRepository{
	
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
	
	public List<TipoEspecialidade> listarEspecialidadePorNome(String nome){
		
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
