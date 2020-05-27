package model;

import java.util.Date;

public class Atendente extends Pessoa implements BaseEntity{
	
	public Atendente() {
		
	}
	
	public Atendente(Integer id) {
		super(id);
	}
	
	public Atendente(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco) {
		super(nome, sobrenome, cpf, telefone, dataNascimento, endereco);
	}

}
