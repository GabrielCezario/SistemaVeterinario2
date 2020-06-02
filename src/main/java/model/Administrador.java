package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Administrador")
public class Administrador extends Pessoa implements BaseEntity{
	
	public Administrador() {
		
	}
	
	public Administrador(Integer id) {
		super(id);
	}
	
	public Administrador(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco, Login login) {
		super(nome, sobrenome, cpf, telefone, dataNascimento, endereco, login);
	}

}
