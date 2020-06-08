package controller;

import java.util.List;

import model.FichaMedica;

public interface IControlladorFichaMedica {
	
	public FichaMedica cadastrarFichaMedica(FichaMedica fichaMedica);
	public List<FichaMedica> listarFichaMedica();
	public FichaMedica atualizarFichaMedica(FichaMedica fichaMedica);
	public void deletarFichaMedica(FichaMedica fichaMedica);

}
