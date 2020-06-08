package repository.jpa;

import java.util.List;

import model.Endereco;

public interface IEnderecoRepositoryJPA extends IRepositoryJPA<Endereco>{
	
	public List<Endereco> listarEndereco();

}
