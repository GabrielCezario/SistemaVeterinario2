package repository.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionJPA;
import model.Relatorio;
import repository.jpa.IRelatorioRepositoryJPA;

public class RelatorioRepositoryJPA extends RepositoryJPA<Relatorio> implements IRelatorioRepositoryJPA{

	private EntityManager entityManager;
	
	public List<Relatorio> listarRelatorios(){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Relatorio> listRelatorio = null;
		
		try {
			listRelatorio = entityManager.createQuery("from Relatorio").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		
		return listRelatorio;
	}
	
	public List<Relatorio> listarRelatorios(String relatorioNome){
		
		entityManager = new ConnectionJPA().getEntityManager();
		List<Relatorio> listRelatorio = null;
		
		try {
			listRelatorio = entityManager.createQuery("from Relatorio where titulo = '"+relatorioNome+"'").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
		
		return listRelatorio;
	}
	
}
