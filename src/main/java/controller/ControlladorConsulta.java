package controller;

import java.util.List;

import exception.ConsultaInvalidoException;
import model.Consulta;
import repository.jpa.ConsultaRepositoryJPA;

public class ControlladorConsulta {
	
	private ConsultaRepositoryJPA consultaRepositoryJPA;
	
	public Consulta cadastrarConsulta(Consulta consulta) throws Exception {
		
		verificarDataInvalida(consulta);
		verificarConsultaInvalida(consulta);
		
		consultaRepositoryJPA = new ConsultaRepositoryJPA();
		return consultaRepositoryJPA.save(consulta);
		
	}
	
	public List<Consulta> listarConsultas(){
		
		consultaRepositoryJPA = new ConsultaRepositoryJPA();
		return consultaRepositoryJPA.listConsulta();
		
	}
	
	public Consulta atualizarConsulta(Consulta consulta) throws ConsultaInvalidoException {
		
		verificarConsultaInvalida(consulta);
		
		consultaRepositoryJPA = new ConsultaRepositoryJPA();
		return consultaRepositoryJPA.save(consulta);
		
	}
	
	public void deletarConsulta(Consulta consulta) throws ConsultaInvalidoException {
		
		verificarConsultaInvalida(consulta);
		
		consultaRepositoryJPA = new ConsultaRepositoryJPA();
		consultaRepositoryJPA.delete(Consulta.class, consulta.getId());
		
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================
	
	private void verificarConsultaInvalida(Consulta consulta) throws ConsultaInvalidoException {
		
		if(consulta == null)
			throw new ConsultaInvalidoException("Error: consulta nula");
		
		if(consulta.getPet() == null)
			throw new ConsultaInvalidoException("Error: pet nulo");
		
		if(consulta.getVeterinario() == null)
			throw new ConsultaInvalidoException("Error: veterinario nulo");
		
	}
	
	private void verificarDataInvalida(Consulta consulta) throws Exception {
		
		if(consulta.getDataConsulta() == null)
			throw new Exception("Error: Você tentou inserir uma consulta com uma data inválida!");
		
	}

}
