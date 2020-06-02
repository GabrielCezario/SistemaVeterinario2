package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FichaMedica")
public class FichaMedica implements BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "diagnostico")
	private String diagnostico;
	
	@OneToOne
	private Pet pet;
	
	@ManyToOne
	private Veterinario veterinario;
	
	public FichaMedica() {
		
	}

	public FichaMedica(Integer id) {
		this.id = id;
	}

	public FichaMedica(String diagnostico, Pet pet, Veterinario veterinario) {
		this.diagnostico = diagnostico;
		this.pet = pet;
		this.veterinario = veterinario;
	}
	
	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
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
	
}
