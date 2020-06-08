package repository.jpa;

import java.util.List;

import model.Atendente;

public interface IAtendenteRepositoryJPA extends IRepositoryJPA<Atendente>{

	public List<Atendente> listAtendente();
	public List<Atendente> listAtendentePorNome(String nome);
	
}
