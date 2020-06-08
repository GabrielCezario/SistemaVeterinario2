package repository.jpa;

import java.util.List;

import model.FichaMedica;

public interface IFichaMedicaRepositoryJPA extends IRepositoryJPA<FichaMedica>{

	public List<FichaMedica> listarFichaMedica();
	
}
