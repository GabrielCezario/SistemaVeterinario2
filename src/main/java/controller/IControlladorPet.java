package controller;

import java.util.List;

import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Pet;

public interface IControlladorPet {
	
	public Pet cadastrarPet(Pet pet) throws ObjetoNulo, CamposCadastroVazios;
	public List<Pet> listarPets();
	public Pet atualizarPet(Pet pet) throws ObjetoNulo, CamposCadastroVazios;
	public void deletarPet(Pet pet) throws ObjetoNulo;
	public List<Pet> listarPetsPorNome(String nome);

}
