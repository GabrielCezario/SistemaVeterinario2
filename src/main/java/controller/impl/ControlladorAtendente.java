package controller.impl;

import java.util.List;

import api.StringUtils;
import controller.IControlladorAtendente;
import exception.ObjetoNulo;
import exception.CamposCadastroVazios;
import model.Atendente;
import repository.jpa.impl.AtendenteRepositoryJPA;

public class ControlladorAtendente implements IControlladorAtendente{
	
	private AtendenteRepositoryJPA atendenteRepositoryJPA;
	
	public Atendente cadastrarAtendente(Atendente atendente) throws CamposCadastroVazios, ObjetoNulo {
		
		verificarAtendenteNulo(atendente);
		verificarCamposObrigatoriosCadastroPessoa(atendente);
		
		atendenteRepositoryJPA = new AtendenteRepositoryJPA();
		return atendenteRepositoryJPA.save(atendente);
		
	}
	
	public List<Atendente> listarAtendentes(){
		
		atendenteRepositoryJPA = new AtendenteRepositoryJPA();
		return atendenteRepositoryJPA.listAtendente();
				
	}
	
	public Atendente atualizarAtendente(Atendente atendente) throws CamposCadastroVazios, ObjetoNulo {
		
		verificarAtendenteNulo(atendente);
		verificarCamposObrigatoriosCadastroPessoa(atendente);
		
		atendenteRepositoryJPA = new AtendenteRepositoryJPA();
		return atendenteRepositoryJPA.save(atendente);
		
	}
	
	public void deletarAtendente(Atendente atendente) throws ObjetoNulo {
		
		verificarAtendenteNulo(atendente);
		
		atendenteRepositoryJPA = new AtendenteRepositoryJPA();
		atendenteRepositoryJPA.delete(Atendente.class, atendente.getId());
		
	}
	
	public List<Atendente> listarAtendentesPorNome(String nome){
		
		atendenteRepositoryJPA = new AtendenteRepositoryJPA();
		return atendenteRepositoryJPA.listAtendentePorNome(nome);
				
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================
	
	private void verificarAtendenteNulo(Atendente atendente) throws ObjetoNulo{
		
		if(atendente == null)
			throw new ObjetoNulo("Error: Você tentou inserir um adminsitrador nulo!");
		
	}
	
	private void verificarCamposObrigatoriosCadastroPessoa(Atendente atendente) throws CamposCadastroVazios {
		
		if(StringUtils.veriyStringIsInvalid(atendente.getNome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um adminsitrador com o nome vazio!");
		
		if(StringUtils.veriyStringIsInvalid(atendente.getSobrenome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um adminsitrador com o sobrenome vazio!");
		
		if(StringUtils.veriyStringIsInvalid(atendente.getCpf()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um adminsitrador com o CPF vazio!");
		
		if(StringUtils.veriyStringIsInvalid(atendente.getTelefone()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um adminsitrador com o telefone vazio!");
		
	}

}
