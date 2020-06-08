package controller;

import java.util.List;

import exception.ConsultaInvalidoException;
import model.Consulta;

public interface IControlladorConsulta {
	
	public Consulta cadastrarConsulta(Consulta consulta) throws Exception;
	public List<Consulta> listarConsultas();
	public Consulta atualizarConsulta(Consulta consulta) throws ConsultaInvalidoException;
	public void deletarConsulta(Consulta consulta) throws ConsultaInvalidoException;
	public List<Consulta> listarConsultasPorNomePet(String nomePet);

}
