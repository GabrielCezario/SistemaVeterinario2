package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TipoEspecialidade")
public class TipoEspecialidade implements BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@ManyToMany(mappedBy = "tipoEspecialidade")
	private List<Veterinario> listVeterinario = new ArrayList<>();
	
	public TipoEspecialidade() {
		
	}

	public TipoEspecialidade(Integer id) {
		this.id = id;
	}

	public TipoEspecialidade(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Veterinario> getListVeterinario() {
		return listVeterinario;
	}

	public void setListVeterinario(List<Veterinario> listVeterinario) {
		this.listVeterinario = listVeterinario;
	}

	@Override
	public String toString() {
		return this.descricao;
	}	
	
	

}
