package controller.impl;

import java.util.List;

import api.StringUtils;
import controller.IControlladorEndereco;
import exception.CamposCadastroEnderecoVazios;
import exception.EnderecoNulo;
import model.Endereco;
import repository.jpa.impl.EnderecoRepositoryJPA;

public class ControlladorEndereco implements IControlladorEndereco{
	
	private EnderecoRepositoryJPA enderecoRepositoryJPA;
	
	public Endereco cadastrarEndereco(Endereco endereco) throws EnderecoNulo, CamposCadastroEnderecoVazios {
		
		verificarEnderecoNulo(endereco);
		verificarCamposObrigatoriosEndereco(endereco);
		
		enderecoRepositoryJPA = new EnderecoRepositoryJPA();
		return enderecoRepositoryJPA.save(endereco);
		
	}
	
	public List<Endereco> listarEnderecos(){
		
		enderecoRepositoryJPA = new EnderecoRepositoryJPA();
		return enderecoRepositoryJPA.listarEndereco();
		
	}
	
	public Endereco atualizarEndereco(Endereco endereco) throws EnderecoNulo, CamposCadastroEnderecoVazios {
		
		verificarEnderecoNulo(endereco);
		verificarCamposObrigatoriosEndereco(endereco);
		
		enderecoRepositoryJPA = new EnderecoRepositoryJPA();
		return enderecoRepositoryJPA.save(endereco);
		
	}
	
	public void deletarEndereco(Endereco endereco) throws EnderecoNulo {
		
		verificarEnderecoNulo(endereco);
		
		enderecoRepositoryJPA = new EnderecoRepositoryJPA();
		enderecoRepositoryJPA.delete(Endereco.class, endereco.getId());
		
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================
	
	private void verificarEnderecoNulo(Endereco endereco) throws EnderecoNulo {
		
		if(endereco == null)
			throw new EnderecoNulo("Error: Você tentou inserir um endereco nulo!");
		
	}
	
	private void verificarCamposObrigatoriosEndereco(Endereco endereco) throws CamposCadastroEnderecoVazios {
		
		if(StringUtils.veriyStringIsInvalid(endereco.getEstado()))
			throw new CamposCadastroEnderecoVazios("Error: Você tentou inserir um endereco com o estado vazio!");
		
		if(StringUtils.veriyStringIsInvalid(endereco.getCidade()))
			throw new CamposCadastroEnderecoVazios("Error: Você tentou inserir um endereco com o campo de cidade vazio!");
		
		if(StringUtils.veriyStringIsInvalid(endereco.getBairro()))
			throw new CamposCadastroEnderecoVazios("Error: Você tentou inserir um endereco com o estado vazio!");
		
		if(StringUtils.veriyStringIsInvalid(endereco.getRua()))
			throw new CamposCadastroEnderecoVazios("Error: Você tentou inserir um endereco com o estado vazio!");
		
		if(StringUtils.veriyStringIsInvalid(endereco.getNumero()))
			throw new CamposCadastroEnderecoVazios("Error: Você tentou inserir um endereco com o estado vazio!");
			
	}

}
