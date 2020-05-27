package model;

import java.util.Date;

public class Consulta implements BaseEntity{
	
	private Integer id;
	private Pet pet;
	private Veterinario veterinario;
	private Date dataConsulta;
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
