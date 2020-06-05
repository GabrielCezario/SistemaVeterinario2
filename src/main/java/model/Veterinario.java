package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Veterinario")
public class Veterinario extends Pessoa {
	
	@ManyToMany
	@JoinTable(
			name = "veterinario_tipoEspecialidade", 
			joinColumns = @JoinColumn(name = "veterinario_id"), 
			inverseJoinColumns = @JoinColumn(name = "tipoEspecialidade_id"))
	private List<TipoEspecialidade> tipoEspecialidade;

	public Veterinario() {
		
	}
	
	public Veterinario(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco, Login login, List<TipoEspecialidade> tipoEspecialidade) {
		super(nome, sobrenome, cpf, telefone, dataNascimento, endereco, login);
		
		this.tipoEspecialidade = tipoEspecialidade;
	}

	public List<TipoEspecialidade> getTipoEspecialidade() {
		return tipoEspecialidade;
	}

	public void setTipoEspecialidade(List<TipoEspecialidade> tipoEspecialidade) {
		this.tipoEspecialidade = tipoEspecialidade;
	}
	
}
