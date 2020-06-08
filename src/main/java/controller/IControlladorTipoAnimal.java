package controller;

import java.util.List;

import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.TipoAnimal;

public interface IControlladorTipoAnimal {
	
	public TipoAnimal cadastrarTipoAnimal(TipoAnimal tipoAnimal) throws ObjetoNulo, CamposCadastroVazios;
	public List<TipoAnimal> listarTipoAnimais();
	public TipoAnimal atualizarTipoAnimal(TipoAnimal tipoAnimal) throws ObjetoNulo, CamposCadastroVazios;
	public void deletarTipoAnimal(TipoAnimal tipoAnimal) throws ObjetoNulo;
	public List<TipoAnimal> listarTipoAnimaisPorNome(String nome);

}
