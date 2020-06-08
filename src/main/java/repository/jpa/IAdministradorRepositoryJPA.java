package repository.jpa;

import java.util.List;

import model.Administrador;

public interface IAdministradorRepositoryJPA extends IRepositoryJPA<Administrador>{
	
	public List<Administrador> listarAdministrador();
	public List<Administrador> listarAdministradorPorNome(String nome);

}
