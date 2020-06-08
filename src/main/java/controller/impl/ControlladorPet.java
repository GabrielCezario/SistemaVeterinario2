package controller.impl;

import java.util.List;

import api.StringUtils;
import controller.IControlladorPet;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Pet;
import repository.jpa.impl.PetRepositoryJPA;

public class ControlladorPet implements IControlladorPet{
	
	private PetRepositoryJPA petRepositoryJPA;
	
	public Pet cadastrarPet(Pet pet) throws ObjetoNulo, CamposCadastroVazios {
		
		verificarPetNulo(pet);
		verificarCamposObrigatoriosCadastroPet(pet);
		
		petRepositoryJPA = new PetRepositoryJPA();
		return petRepositoryJPA.save(pet);
		
	}
	
	public List<Pet> listarPets(){
		
		petRepositoryJPA = new PetRepositoryJPA();
		return petRepositoryJPA.listarPet();
		
	}
	
	public Pet atualizarPet(Pet pet) throws ObjetoNulo, CamposCadastroVazios {
		
		verificarPetNulo(pet);
		verificarCamposObrigatoriosCadastroPet(pet);
		
		petRepositoryJPA = new PetRepositoryJPA();
		return petRepositoryJPA.save(pet);
		
	}
	
	public void deletarPet(Pet pet) throws ObjetoNulo {
		
		verificarPetNulo(pet);
		
		petRepositoryJPA = new PetRepositoryJPA();
		petRepositoryJPA.delete(Pet.class, pet.getId());
		
	}
	
	public List<Pet> listarPetsPorNome(String nome){
		
		petRepositoryJPA = new PetRepositoryJPA();
		return petRepositoryJPA.listarPetPorNome(nome);
		
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================
	
	private void verificarPetNulo(Pet pet) throws ObjetoNulo {
		
		if(pet == null)
			throw new ObjetoNulo("Error: Você tentou inserir um pet nulo!");
		
	}
	
	private void verificarCamposObrigatoriosCadastroPet(Pet pet) throws CamposCadastroVazios {
		
		if(StringUtils.veriyStringIsInvalid(pet.getNome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um pet com o nome vazio!");
		
		if(pet.getPeso() <= 0)
			throw new CamposCadastroVazios("Error: Você tentou inserir um pet com o peso vazio ou negativo!");
		
	}

}
