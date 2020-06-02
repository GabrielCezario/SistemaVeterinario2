package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pet")
public class Pet implements BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "dataNascimento")
	private Date dataNascimento;
	
	@Column(name = "peso")
	private double peso;
	
	@OneToOne
	private TipoAnimal tipoAnimal;
	
	@ManyToOne
	private DonoPet donoPet;
	
	@OneToOne
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
