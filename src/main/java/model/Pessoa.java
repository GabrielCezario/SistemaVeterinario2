package model;

import java.util.Date;

public class Pessoa implements BaseEntity{
	
	private Integer id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	private Date dataNascimento;
	private Endereco endereco;
	
	public Pessoa() {
		
	}
	
	public Pessoa(Integer id) {
		this.id = id;
	}

	public Pessoa(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	
	@Override
	public Integer getId() {
		return this.id;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
