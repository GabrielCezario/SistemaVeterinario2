package model;

import java.util.Date;

public class DonoPet extends Pessoa implements BaseEntity{
	
	public DonoPet() {
		
	}
	
	public DonoPet(Integer id) {
		super(id);
	}
	
	public DonoPet(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco) {
		super(nome, sobrenome, cpf, telefone, dataNascimento, endereco);
	}

}