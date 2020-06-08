package repository.jpa;

import java.util.List;

import model.Consulta;

public interface IConsultaRepositoryJPA extends IRepositoryJPA<Consulta>{

	public List<Consulta> listConsulta();
	public List<Consulta> listConsultaPorNomePet(String nomePet);
	
}
