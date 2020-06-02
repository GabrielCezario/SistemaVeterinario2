package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Atendente")
public class Atendente extends Pessoa implements BaseEntity{
	
	public Atendente() {
		
	}
	
	public Atendente(Integer id) {
		super(id);
	}
	
	public Atendente(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco, Login login) {
		super(nome, sobrenome, cpf, telefone, dataNascimento, endereco, login);
	}

}
