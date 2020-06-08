package controller.impl;

import java.util.List;

import controller.IControlladorRelatorio;
import model.Relatorio;
import repository.jpa.impl.RelatorioRepositoryJPA;

public class ControlladorRelatorio implements IControlladorRelatorio{
	
	private RelatorioRepositoryJPA relatorioRepositoryJPA;
	
	public Relatorio cadastrarRelatorio(Relatorio relatorio) {
		
		relatorioRepositoryJPA = new RelatorioRepositoryJPA();
		return relatorioRepositoryJPA.save(relatorio);
	}
	
	public List<Relatorio> listarRelatorios(){
		relatorioRepositoryJPA = new RelatorioRepositoryJPA();
		return relatorioRepositoryJPA.listarRelatorios();
	}
	
	public Relatorio atualizarRelatorio(Relatorio relatorio) {
		
		relatorioRepositoryJPA = new RelatorioRepositoryJPA();
		return relatorioRepositoryJPA.save(relatorio);
	}
	
	public void deletarRelatorio(Relatorio relatorio) {
		
		relatorioRepositoryJPA = new RelatorioRepositoryJPA();
		relatorioRepositoryJPA.delete(Relatorio.class, relatorio.getId());
		
	}
	
	public List<Relatorio> listarRelatoriosPorNome(String relatorioNome){
		relatorioRepositoryJPA = new RelatorioRepositoryJPA();
		return relatorioRepositoryJPA.listarRelatorios(relatorioNome);
	}

}
