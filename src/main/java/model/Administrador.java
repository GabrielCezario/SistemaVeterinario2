package model;

import java.util.Date;

public class Administrador extends Pessoa implements BaseEntity{
	
	public Administrador() {
		
	}
	
	public Administrador(Integer id) {
		super(id);
	}
	
	public Administrador(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco) {
		super(nome, sobrenome, cpf, telefone, dataNascimento, endereco);
	}

}
