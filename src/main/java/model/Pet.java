package model;

import java.util.Date;

public class Pet implements BaseEntity{
	
	private Integer id;
	private String nome;
	private Date dataNascimento;
	private double peso;
	private TipoAnimal tipoAnimal;
	private DonoPet donoPet;
	private FichaMedica fichaMedica;
	
	public Pet() {
		
	}
	
	public Pet(Integer id) {
		this.id = id;
	}
	
	public Pet(String nome, Date dataNascimento, double peso, TipoAnimal tipoAnimal, DonoPet donoPet, FichaMedica fichaMedica) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.tipoAnimal = tipoAnimal;
		this.donoPet = donoPet;
		this.fichaMedica = fichaMedica;
	}
	
	@Override
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public DonoPet getDonoPet() {
		return donoPet;
	}

	public void setDonoPet(DonoPet donoPet) {
		this.donoPet = donoPet;
	}

	public FichaMedica getFichaMedica() {
		return fichaMedica;
	}

	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
	}

}
