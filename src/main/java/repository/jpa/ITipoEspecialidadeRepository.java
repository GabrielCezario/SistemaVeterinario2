package repository.jpa;

import java.util.List;

import model.TipoEspecialidade;

public interface ITipoEspecialidadeRepository extends IRepositoryJPA<TipoEspecialidade>{

	public List<TipoEspecialidade> listarEspecialidade();
	public List<TipoEspecialidade> listarEspecialidadePorNome(String nome);
	
}
