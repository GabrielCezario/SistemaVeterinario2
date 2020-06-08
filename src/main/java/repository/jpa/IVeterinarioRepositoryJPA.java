package repository.jpa;

import java.util.List;

import model.Veterinario;

public interface IVeterinarioRepositoryJPA extends IRepositoryJPA<Veterinario>{

	public List<Veterinario> listarVeterinario();
	public List<Veterinario> listarVeterinarioPorNome(String nome);
	
}
