package repository.jpa;

import java.util.List;

import model.Relatorio;

public interface IRelatorioRepositoryJPA extends IRepositoryJPA<Relatorio>{

	public List<Relatorio> listarRelatorios();
	public List<Relatorio> listarRelatorios(String relatorioNome);
	
	
}
