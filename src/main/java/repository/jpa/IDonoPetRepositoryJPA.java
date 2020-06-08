package repository.jpa;

import java.util.List;

import model.DonoPet;

public interface IDonoPetRepositoryJPA extends IRepositoryJPA<DonoPet>{
	
	public List<DonoPet> listarDonoPet();
	public List<DonoPet> listarDonoPetPorNome(String nome);

}
