package controller.impl;

import java.util.List;

import controller.IControlladorFichaMedica;
import model.FichaMedica;
import repository.jpa.impl.FichaMedicaRepositoryJPA;

public class ControlladorFichaMedica implements IControlladorFichaMedica{
	
	private FichaMedicaRepositoryJPA fichaMedicaRepositoryJPA;
	
	public FichaMedica cadastrarFichaMedica(FichaMedica fichaMedica) {
		fichaMedicaRepositoryJPA = new FichaMedicaRepositoryJPA();
		return fichaMedicaRepositoryJPA.save(fichaMedica);
	}
	
	public List<FichaMedica> listarFichaMedica(){
		fichaMedicaRepositoryJPA = new FichaMedicaRepositoryJPA();
		return fichaMedicaRepositoryJPA.listarFichaMedica();
	}
	
	public FichaMedica atualizarFichaMedica(FichaMedica fichaMedica) {
		fichaMedicaRepositoryJPA = new FichaMedicaRepositoryJPA();
		return fichaMedicaRepositoryJPA.save(fichaMedica);
	}
	
	public void deletarFichaMedica(FichaMedica fichaMedica) {
		fichaMedicaRepositoryJPA = new FichaMedicaRepositoryJPA();
		fichaMedicaRepositoryJPA.delete(FichaMedica.class, fichaMedica.getId());
	}

}
