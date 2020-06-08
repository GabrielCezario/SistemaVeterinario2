package controller;

import java.util.List;

import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Atendente;

public interface IControlladorAtendente {
	
	public Atendente cadastrarAtendente(Atendente atendente) throws CamposCadastroVazios, ObjetoNulo;
	public List<Atendente> listarAtendentes();
	public Atendente atualizarAtendente(Atendente atendente) throws CamposCadastroVazios, ObjetoNulo;
	public void deletarAtendente(Atendente atendente) throws ObjetoNulo;
	public List<Atendente> listarAtendentesPorNome(String nome);

}
