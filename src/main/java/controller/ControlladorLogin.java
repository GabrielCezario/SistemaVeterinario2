package controller;

import api.StringUtils;
import exception.LoginInvalidoException;
import exception.LoginJaCadastrado;
import exception.ObjetoNulo;
import model.Login;
import repository.jpa.LoginRepositoryJPA;

public class ControlladorLogin {
	
	private LoginRepositoryJPA loginRepositoryJPA;
	
	public Login cadastrarLogin(Login login) throws LoginInvalidoException, LoginJaCadastrado, ObjetoNulo {
		
		verificarLoginNulo(login);
		verificarDadosLoginVazios(login);
		verificarLoginExistente(login);
		
		loginRepositoryJPA = new LoginRepositoryJPA();		
		return loginRepositoryJPA.save(login);
		
	}
	
	public void deletarLogin(Login login) throws ObjetoNulo, LoginInvalidoException {
		
		verificarLoginNulo(login);
		verificarDadosLoginVazios(login);
		
		loginRepositoryJPA = new LoginRepositoryJPA();
		loginRepositoryJPA.delete(Login.class, login.getId());
		
	}
	
	public Login realizarLogin(Login login) throws LoginInvalidoException, ObjetoNulo {
		
		verificarLoginNulo(login);
		verificarDadosLoginVazios(login);
		
		loginRepositoryJPA = new LoginRepositoryJPA();
		Login loginData = loginRepositoryJPA.buscarLogin(login);
		
		return loginData;	
		
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================
	
	private void verificarLoginNulo(Login login) throws ObjetoNulo {
		
		if(login == null)
			throw new ObjetoNulo("Error: login nulo!");
		
	}
	
	private void verificarDadosLoginVazios(Login login) throws LoginInvalidoException {
		
		if(StringUtils.veriyStringIsInvalid(login.getLogin()))
			throw new LoginInvalidoException("Error: Você tentou inserir um Login vazio!");
		
		if(StringUtils.veriyStringIsInvalid(login.getSenha()))
			throw new LoginInvalidoException("Error: Você tentou inserir uma senha vazia!");
		
	}
	
	private void verificarLoginExistente(Login login) throws LoginJaCadastrado {
		
		loginRepositoryJPA = new LoginRepositoryJPA();
		Integer idData = loginRepositoryJPA.verificarLoginExistente(login);
		
		if(idData != 0 || idData != null)
			throw new LoginJaCadastrado("Error: O login já existe");
		
	}	

}
