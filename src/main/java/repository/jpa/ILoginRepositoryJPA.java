package repository.jpa;

import java.util.List;

import model.Login;

public interface ILoginRepositoryJPA extends IRepositoryJPA<Login>{

	public List<Login> listarLogin();
	public Login buscarLogin(Login login);
	public Integer verificarLoginExistente(Login login);
	
}
