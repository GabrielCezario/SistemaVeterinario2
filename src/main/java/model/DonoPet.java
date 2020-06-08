package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DonoPet")
public class DonoPet extends Pessoa implements BaseEntity{
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "donoPet_id")
	private List<Pet> listPet = new ArrayList<Pet>();;
	
	public DonoPet() {
		
	}
	
	public DonoPet(Integer id) {
		super(id);
	}
	
	public DonoPet(String nome, String sobrenome, String cpf, String telefone, Date dataNascimento, Endereco endereco) {
		super(nome, sobrenome, cpf, telefone, dataNascimento, endereco);
	}

	public List<Pet> getListPet() {
		return listPet;
	}

	public void setListPet(List<Pet> listPet) {
		this.listPet = listPet;
	}

}
