package controller.impl;

import java.util.List;

import api.StringUtils;
import controller.IControlladorTipoEspecialidade;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.TipoEspecialidade;
import repository.jpa.impl.TipoEspecialidadeRepository;

public class ControlladorTipoEspecialidade implements IControlladorTipoEspecialidade{
	
	private TipoEspecialidadeRepository tipoEspecialidadeRepository;
	
	public TipoEspecialidade cadastrarTipoEspecialidade(TipoEspecialidade tipoEspecialidade) throws ObjetoNulo, CamposCadastroVazios {
		
		verificarTipoEspecialidadeNulo(tipoEspecialidade);
		verificarCamposObrigatorios(tipoEspecialidade);
		
		tipoEspecialidadeRepository = new TipoEspecialidadeRepository();
		return tipoEspecialidadeRepository.save(tipoEspecialidade);
		
	}
	
	public List<TipoEspecialidade> listarTiposEspecialidades(){
		tipoEspecialidadeRepository = new TipoEspecialidadeRepository();
		return tipoEspecialidadeRepository.listarEspecialidade();
	}
	
	public TipoEspecialidade atualizarTipoEspecialidade(TipoEspecialidade tipoEspecialidade) throws ObjetoNulo, CamposCadastroVazios {
		
		verificarTipoEspecialidadeNulo(tipoEspecialidade);
		verificarCamposObrigatorios(tipoEspecialidade);
		
		tipoEspecialidadeRepository = new TipoEspecialidadeRepository();
		return tipoEspecialidadeRepository.save(tipoEspecialidade);
		
	}
	
	public void deletarTipoEspecialidade(TipoEspecialidade tipoEspecialidade) throws ObjetoNulo {
		
		verificarTipoEspecialidadeNulo(tipoEspecialidade);
		
		tipoEspecialidadeRepository = new TipoEspecialidadeRepository();
		tipoEspecialidadeRepository.delete(TipoEspecialidade.class, tipoEspecialidade.getId());
		
	}
	
	public List<TipoEspecialidade> listarTiposEspecialidadesPorNome(String nome){
		tipoEspecialidadeRepository = new TipoEspecialidadeRepository();
		return tipoEspecialidadeRepository.listarEspecialidadePorNome(nome);
	}
	
	// ===================================================== ( METODOS PRIVADOS ) ====================================================

	private void verificarTipoEspecialidadeNulo(TipoEspecialidade tipoEspecialidade) throws ObjetoNulo{
		
		if(tipoEspecialidade == null)
			throw new ObjetoNulo("Error: Voc� tentou inserir um tipo especialidade nulo!");
		
	}
	
	private void verificarCamposObrigatorios(TipoEspecialidade tipoEspecialidade) throws CamposCadastroVazios {
		
		if(StringUtils.veriyStringIsInvalid(tipoEspecialidade.getDescricao()))
			throw new CamposCadastroVazios("Error: Voc� tentou inserir um tipo com o tipo especialidade vazio!");
		
	}

}
