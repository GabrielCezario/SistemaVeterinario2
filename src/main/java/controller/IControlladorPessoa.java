package controller;

import java.util.List;

import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Pessoa;

public interface IControlladorPessoa {
	
	public Pessoa cadastrarPessoa(Pessoa pessoa) throws ObjetoNulo, CamposCadastroVazios;
	public List<Pessoa> listarPessoas();
	public Pessoa atualizarPessoa(Pessoa pessoa) throws ObjetoNulo, CamposCadastroVazios;
	public void deletarPessoa(Pessoa pessoa) throws ObjetoNulo;
	

}
