package controller;

import java.util.List;

import exception.CamposCadastroEnderecoVazios;
import exception.EnderecoNulo;
import model.Endereco;

public interface IControlladorEndereco {
	
	public Endereco cadastrarEndereco(Endereco endereco) throws EnderecoNulo, CamposCadastroEnderecoVazios;
	public List<Endereco> listarEnderecos();
	public Endereco atualizarEndereco(Endereco endereco) throws EnderecoNulo, CamposCadastroEnderecoVazios;
	public void deletarEndereco(Endereco endereco) throws EnderecoNulo;

}
