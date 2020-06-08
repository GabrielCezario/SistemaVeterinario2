package controller.impl;

import java.util.List;

import api.StringUtils;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Veterinario;
import repository.jpa.impl.VeterinarioRepositoryJPA;

public class ControlladorVeterinario implements IControlladorVeterinario{
	
	private VeterinarioRepositoryJPA veterinarioRepositoryJPA;
	
	public Veterinario cadastrarVeterinario(Veterinario veterinario) throws Exception {
		
		verificarVeterinarioNulo(veterinario);
		verificarCamposObrigatorios(veterinario);
		
		veterinarioRepositoryJPA = new VeterinarioRepositoryJPA();
		return veterinarioRepositoryJPA.save(veterinario);
		
	}
	
	public List<Veterinario> listarVeterinarios(){
		
		veterinarioRepositoryJPA = new VeterinarioRepositoryJPA();
		return veterinarioRepositoryJPA.listarVeterinario();
				
	}
	
	public Veterinario atualizarVeterinario(Veterinario veterinario) throws Exception {
		
		verificarVeterinarioNulo(veterinario);
		verificarCamposObrigatorios(veterinario);
		
		veterinarioRepositoryJPA = new VeterinarioRepositoryJPA();
		return veterinarioRepositoryJPA.save(veterinario);
		
	}
	
	public void deletarVeterinario(Veterinario veterinario) throws ObjetoNulo {
		
		verificarVeterinarioNulo(veterinario);
		
		veterinarioRepositoryJPA = new VeterinarioRepositoryJPA();
		veterinarioRepositoryJPA.delete(Veterinario.class, veterinario.getId());
		
	}
	
	public List<Veterinario> listarVeterinariosPorNome(String nome){
		
		veterinarioRepositoryJPA = new VeterinarioRepositoryJPA();
		return veterinarioRepositoryJPA.listarVeterinarioPorNome(nome);
				
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================
	
	private void verificarVeterinarioNulo(Veterinario veterinario) throws ObjetoNulo{
		
		if(veterinario == null)
			throw new ObjetoNulo("Error: Você tentou inserir um veterinario nulo!");
		
	}
	
	private void verificarCamposObrigatorios(Veterinario veterinario) throws Exception {
		
		if(StringUtils.veriyStringIsInvalid(veterinario.getNome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um veterinario com o nome vazio!");
		
		if(StringUtils.veriyStringIsInvalid(veterinario.getSobrenome()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um veterinario com o sobrenome vazio!");
		
		if(StringUtils.veriyStringIsInvalid(veterinario.getCpf()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um veterinario com o CPF vazio!");
		
		if(StringUtils.veriyStringIsInvalid(veterinario.getTelefone()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um veterinario com o telefone vazio!");
		
		if(StringUtils.veriyStringIsInvalid(veterinario.getTelefone()))
			throw new CamposCadastroVazios("Error: Você tentou inserir um veterinario com o telefone vazio!");
		
		if(veterinario.getTipoEspecialidade().isEmpty() || veterinario.getTipoEspecialidade() == null)
			throw new Exception("Error: Você tentou inserir um veterinario sem especialidades");
		
	}

}
