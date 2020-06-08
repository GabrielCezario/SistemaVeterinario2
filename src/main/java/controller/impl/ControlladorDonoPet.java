package controller.impl;

import java.util.List;

import api.StringUtils;
import controller.IControlladorDonoPet;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.DonoPet;
import repository.jpa.impl.DonoPetRepositoryJPA;

public class ControlladorDonoPet implements IControlladorDonoPet{
	
	private DonoPetRepositoryJPA donoPetRepositoryJPA;
	
	public DonoPet cadastrarDonoPet(DonoPet donoPet) throws CamposCadastroVazios, ObjetoNulo {
		
		verificarDonoPetNulo(donoPet);
		verificarCamposObrigatoriosCadastroPessoa(donoPet);
		
		donoPetRepositoryJPA = new DonoPetRepositoryJPA();
		return donoPetRepositoryJPA.save(donoPet);
		
	}
	
	public List<DonoPet> listarDonoPets(){
		
		donoPetRepositoryJPA = new DonoPetRepositoryJPA();
		return donoPetRepositoryJPA.listarDonoPet();
				
	}
	
	public DonoPet atualizarDonoPet(DonoPet donoPet) throws CamposCadastroVazios, ObjetoNulo {
		
		verificarDonoPetNulo(donoPet);
		verificarCamposObrigatoriosCadastroPessoa(donoPet);
		
		donoPetRepositoryJPA = new DonoPetRepositoryJPA();
		return donoPetRepositoryJPA.save(donoPet);
		
	}
	
	public void deletarDonoPet(DonoPet donoPet) throws ObjetoNulo {
		
		verificarDonoPetNulo(donoPet);
		
		donoPetRepositoryJPA = new DonoPetRepositoryJPA();
		donoPetRepositoryJPA.delete(DonoPet.class, donoPet.getId());
		
	}
	
	public List<DonoPet> listarDonoPetsPorNome(String nome){
		
		donoPetRepositoryJPA = new DonoPetRepositoryJPA();
		return donoPetRepositoryJPA.listarDonoPetPorNome(nome);
				
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================
	
	private void verificarDonoPetNulo(DonoPet donoPet) throws ObjetoNulo{
		
		if(donoPet == null)
			throw new ObjetoNulo("Error: Você tentou inserir um adminsitrador nulo!");
		
	}
	
	private void verificarCamposObrigatoriosCadastroPessoa(DonoPet donoPet) throws CamposCadastroVazios {
		
		if(StringUtils.veriyStringIsInvalid(donoPet.getNome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um dono de pet com o nome vazio!");
		
		if(StringUtils.veriyStringIsInvalid(donoPet.getSobrenome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um dono de pet com o sobrenome vazio!");
		
		if(StringUtils.veriyStringIsInvalid(donoPet.getCpf()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um dono de pet com o CPF vazio!");
		
		if(StringUtils.veriyStringIsInvalid(donoPet.getTelefone()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um dono de pet com o telefone vazio!");
		
	}

}
