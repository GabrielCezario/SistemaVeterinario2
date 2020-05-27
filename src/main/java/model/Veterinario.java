package model;

import java.util.Date;

public class Veterinario extends Pessoa {
	
	private TipoEspecialidade tipoEspecialidade;

	public Veterinario() {
		
	}
	
	public Veterinario(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco, TipoEspecialidade tipoEspecialidade) {
		super(nome, sobrenome, cpf, telefone, dataNascimento, endereco);
		
		this.tipoEspecialidade = tipoEspecialidade;
	}

	public TipoEspecialidade getEspecialidade() {
		return tipoEspecialidade;
	}

	public void setEspecialidade(TipoEspecialidade tipoEspecialidade) {
		this.tipoEspecialidade = tipoEspecialidade;
	}
	
}
