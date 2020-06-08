package repository.jpa;

import java.util.List;

import model.Pessoa;

public interface IPessoaRepositoryJPA extends IRepositoryJPA<Pessoa>{

	public List<Pessoa> listarPessoa();
	
}
