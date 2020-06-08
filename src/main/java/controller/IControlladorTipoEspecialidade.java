package controller;

import java.util.List;

import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.TipoEspecialidade;

public interface IControlladorTipoEspecialidade {
	
	public TipoEspecialidade cadastrarTipoEspecialidade(TipoEspecialidade tipoEspecialidade) throws ObjetoNulo, CamposCadastroVazios;
	public List<TipoEspecialidade> listarTiposEspecialidades();
	public TipoEspecialidade atualizarTipoEspecialidade(TipoEspecialidade tipoEspecialidade) throws ObjetoNulo, CamposCadastroVazios;
	public void deletarTipoEspecialidade(TipoEspecialidade tipoEspecialidade) throws ObjetoNulo;
	public List<TipoEspecialidade> listarTiposEspecialidadesPorNome(String nome);

}
