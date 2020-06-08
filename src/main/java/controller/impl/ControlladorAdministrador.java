package controller.impl;

import java.util.List;

import api.StringUtils;
import controller.IControlladorAdministrador;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Administrador;
import repository.jpa.impl.AdministradorRepositoryJPA;

public class ControlladorAdministrador implements IControlladorAdministrador{
	
	private AdministradorRepositoryJPA administradorRepositoryJPA;
	
	public Administrador cadastrarAdministrador(Administrador administrador) throws CamposCadastroVazios, ObjetoNulo {
		
		verificarAdministradorNulo(administrador);
		verificarCamposObrigatoriosCadastroPessoa(administrador);
		
		administradorRepositoryJPA = new AdministradorRepositoryJPA();
		return administradorRepositoryJPA.save(administrador);
		
	}
	
	public List<Administrador> listarAdministradores(){
		
		administradorRepositoryJPA = new AdministradorRepositoryJPA();
		return administradorRepositoryJPA.listarAdministrador();
				
	}
	
	public Administrador atualizarAdministrador(Administrador administrador) throws CamposCadastroVazios, ObjetoNulo {
		
		verificarAdministradorNulo(administrador);
		verificarCamposObrigatoriosCadastroPessoa(administrador);
		
		administradorRepositoryJPA = new AdministradorRepositoryJPA();
		return administradorRepositoryJPA.save(administrador);
		
	}
	
	public void deletarAdministrador(Administrador administrador) throws ObjetoNulo {
		
		verificarAdministradorNulo(administrador);
		
		administradorRepositoryJPA = new AdministradorRepositoryJPA();
		administradorRepositoryJPA.delete(Administrador.class, administrador.getId());
		
	}
	
	public List<Administrador> listarAdministradoresPorNome(String nome){
		administradorRepositoryJPA = new AdministradorRepositoryJPA();
		return administradorRepositoryJPA.listarAdministradorPorNome(nome);
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================
	
	private void verificarAdministradorNulo(Administrador administrador) throws ObjetoNulo{
		
		if(administrador == null)
			throw new ObjetoNulo("Error: Você tentou inserir um adminsitrador nulo!");
		
	}
	
	private void verificarCamposObrigatoriosCadastroPessoa(Administrador administrador) throws CamposCadastroVazios {
		
		if(StringUtils.veriyStringIsInvalid(administrador.getNome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um adminsitrador com o nome vazio!");
		
		if(StringUtils.veriyStringIsInvalid(administrador.getSobrenome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um adminsitrador com o sobrenome vazio!");
		
		if(StringUtils.veriyStringIsInvalid(administrador.getCpf()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um adminsitrador com o CPF vazio!");
		
		if(StringUtils.veriyStringIsInvalid(administrador.getTelefone()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um adminsitrador com o telefone vazio!");
		
	}

}
