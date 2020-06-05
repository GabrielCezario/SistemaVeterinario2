package controller;

import java.util.List;

import api.StringUtils;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.TipoAnimal;
import repository.jpa.TipoAnimalRepositoryJPA;

public class ControlladorTipoAnimal {
	
	private TipoAnimalRepositoryJPA tipoAnimalRepositoryJPA;
	
	public TipoAnimal cadastrarTipoAnimal(TipoAnimal tipoAnimal) throws ObjetoNulo, CamposCadastroVazios {
		
		verificarTipoAnimalNulo(tipoAnimal);
		verificarCamposObrigatorios(tipoAnimal);
		
		tipoAnimalRepositoryJPA = new TipoAnimalRepositoryJPA();
		return tipoAnimalRepositoryJPA.save(tipoAnimal);
		
	}
	
	public List<TipoAnimal> listarTipoAnimais(){
		tipoAnimalRepositoryJPA = new TipoAnimalRepositoryJPA();
		return tipoAnimalRepositoryJPA.listarTipoAnimal();
	}
	
	public TipoAnimal atualizarTipoAnimal(TipoAnimal tipoAnimal) throws ObjetoNulo, CamposCadastroVazios {
		
		verificarTipoAnimalNulo(tipoAnimal);
		verificarCamposObrigatorios(tipoAnimal);
		
		tipoAnimalRepositoryJPA = new TipoAnimalRepositoryJPA();
		return tipoAnimalRepositoryJPA.save(tipoAnimal);
		
	}
	
	public void deletarTipoAnimal(TipoAnimal tipoAnimal) throws ObjetoNulo {
		
		verificarTipoAnimalNulo(tipoAnimal);
		
		tipoAnimalRepositoryJPA = new TipoAnimalRepositoryJPA();
		tipoAnimalRepositoryJPA.delete(TipoAnimal.class, tipoAnimal.getId());
		
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================

	private void verificarTipoAnimalNulo(TipoAnimal tipoAnimal) throws ObjetoNulo{
		
		if(tipoAnimal == null)
			throw new ObjetoNulo("Error: Você tentou inserir um tipo animal nulo!");
		
	}
	
	private void verificarCamposObrigatorios(TipoAnimal tipoAnimal) throws CamposCadastroVazios {
		
		if(StringUtils.veriyStringIsInvalid(tipoAnimal.getDescricao()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um tipo com o descricao vazio!");
		
	}
	
}
