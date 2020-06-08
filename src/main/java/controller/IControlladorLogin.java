package controller;

import exception.LoginInvalidoException;
import exception.LoginJaCadastrado;
import exception.ObjetoNulo;
import model.Login;

public interface IControlladorLogin {
	
	public Login cadastrarLogin(Login login) throws LoginInvalidoException, LoginJaCadastrado, ObjetoNulo;
	public void deletarLogin(Login login) throws ObjetoNulo, LoginInvalidoException;
	public Login realizarLogin(Login login) throws LoginInvalidoException, ObjetoNulo;
	

}
