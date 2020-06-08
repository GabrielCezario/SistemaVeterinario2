package controller;

import java.util.List;

import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Administrador;

public interface IControlladorAdministrador {
	
	public Administrador cadastrarAdministrador(Administrador administrador) throws CamposCadastroVazios, ObjetoNulo;
	public List<Administrador> listarAdministradores();
	public Administrador atualizarAdministrador(Administrador administrador) throws CamposCadastroVazios, ObjetoNulo;
	public void deletarAdministrador(Administrador administrador) throws ObjetoNulo;
	public List<Administrador> listarAdministradoresPorNome(String nome);

}
