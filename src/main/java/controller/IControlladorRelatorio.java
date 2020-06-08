package controller;

import java.util.List;

import model.Relatorio;

public interface IControlladorRelatorio {
	
	public Relatorio cadastrarRelatorio(Relatorio relatorio);
	public List<Relatorio> listarRelatorios();
	public Relatorio atualizarRelatorio(Relatorio relatorio);
	public void deletarRelatorio(Relatorio relatorio);
	public List<Relatorio> listarRelatoriosPorNome(String relatorioNome);

}
