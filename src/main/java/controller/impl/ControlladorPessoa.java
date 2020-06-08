package controller.impl;

import java.util.List;

import api.StringUtils;
import controller.IControlladorPessoa;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Pessoa;
import repository.jpa.impl.PessoaRepositoryJPA;

public class ControlladorPessoa implements IControlladorPessoa{

	private PessoaRepositoryJPA pessoaRepositoryJPA;

	public Pessoa cadastrarPessoa(Pessoa pessoa) throws ObjetoNulo, CamposCadastroVazios {
		
		verificarPessoaNula(pessoa);
		verificarCamposObrigatoriosCadastroPessoa(pessoa);
		
		pessoaRepositoryJPA = new PessoaRepositoryJPA();
		return pessoaRepositoryJPA.save(pessoa);
		
	}

	public List<Pessoa> listarPessoas() {
		pessoaRepositoryJPA = new PessoaRepositoryJPA();
		return pessoaRepositoryJPA.listarPessoa();
	}

	public Pessoa atualizarPessoa(Pessoa pessoa) throws ObjetoNulo, CamposCadastroVazios {
		
		verificarPessoaNula(pessoa);
		verificarCamposObrigatoriosCadastroPessoa(pessoa);
		
		pessoaRepositoryJPA = new PessoaRepositoryJPA();
		return pessoaRepositoryJPA.save(pessoa);
		
	}

	public void deletarPessoa(Pessoa pessoa) throws ObjetoNulo {
		
		verificarPessoaNula(pessoa);
		
		pessoaRepositoryJPA = new PessoaRepositoryJPA();
		pessoaRepositoryJPA.delete(Pessoa.class, pessoa.getId());

	}

	// ===================================================== ( METODOS PRIVADOS ) ====================================================

	private void verificarPessoaNula(Pessoa pessoa) throws ObjetoNulo {

		if (pessoa == null)
			throw new ObjetoNulo("Error: Você tentou inserir uma pessoa nulo!");

	}

	private void verificarCamposObrigatoriosCadastroPessoa(Pessoa pessoa) throws CamposCadastroVazios {

		if (StringUtils.veriyStringIsInvalid(pessoa.getNome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir uma pessoa com o nome vazio!");

		if (StringUtils.veriyStringIsInvalid(pessoa.getSobrenome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir uma pessoa com o sobrenome vazio!");

		if (StringUtils.veriyStringIsInvalid(pessoa.getCpf()))
			throw new CamposCadastroVazios("Error: Você tentou inserir uma pessoa com o CPF vazio!");

		if (StringUtils.veriyStringIsInvalid(pessoa.getTelefone()))
			throw new CamposCadastroVazios("Error: Você tentou inserir uma pessoa com o telefone vazio!");

	}

}
