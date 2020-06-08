package controller.impl;

import java.util.List;

import exception.ObjetoNulo;
import model.Veterinario;

public interface IControlladorVeterinario {
	
	public Veterinario cadastrarVeterinario(Veterinario veterinario) throws Exception;
	public List<Veterinario> listarVeterinarios();
	public Veterinario atualizarVeterinario(Veterinario veterinario) throws Exception;
	public void deletarVeterinario(Veterinario veterinario) throws ObjetoNulo;
	public List<Veterinario> listarVeterinariosPorNome(String nome);

}
