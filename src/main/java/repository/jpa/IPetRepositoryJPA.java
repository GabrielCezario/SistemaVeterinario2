package repository.jpa;

import java.util.List;

import model.Pet;

public interface IPetRepositoryJPA extends IRepositoryJPA<Pet>{

	public List<Pet> listarPet();
	public List<Pet> listarPetPorNome(String nome);
	
	
}
