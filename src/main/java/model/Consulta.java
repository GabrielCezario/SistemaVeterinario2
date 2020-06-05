package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Consulta")
public class Consulta implements BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	
	@ManyToOne
	@JoinColumn(name = "veterinario_id")
	private Veterinario veterinario;
	
	@Column(name = "dataConsulta")
	private Date dataConsulta;
	
	@Column(name = "descricaoConsulta")
	private String descricaoConsulta;
	
	public Consulta() {
		
	}

	public Consulta(Integer id) {
		this.id = id;
	}

	public Consulta(Pet pet, Veterinario veterinario, Date dataConsulta, String descricaoConsulta) {
		this.pet = pet;
		this.veterinario = veterinario;
		this.dataConsulta = dataConsulta;
		this.descricaoConsulta = descricaoConsulta;
	}
	
	@Override
	public Integer getId() {
		return id;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getDescricaoConsulta() {
		return descricaoConsulta;
	}

	public void setDescricaoConsulta(String descricaoConsulta) {
		this.descricaoConsulta = descricaoConsulta;
	}

}
