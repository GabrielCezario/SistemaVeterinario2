package model;

public class FichaMedica implements BaseEntity {

	private Integer id;
	private String diagnostico;
	private Pet pet;
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
