package repository.jpa;

import java.util.List;

import model.TipoAnimal;

public interface ITipoAnimalRepositoryJPA extends IRepositoryJPA<TipoAnimal>{

	public List<TipoAnimal> listarTipoAnimal();
	public List<TipoAnimal> listarTipoAnimalPorNome(String nome);
	
}
