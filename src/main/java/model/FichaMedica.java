package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@OneToOne(mappedBy = "fichaMedica")
	private Pet pet;
	
	public FichaMedica() {
		
	}

	public FichaMedica(Integer id) {
		this.id = id;
	}

	public FichaMedica(String diagnostico, Pet pet) {
		this.diagnostico = diagnostico;
		this.pet = pet;
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
	
}
