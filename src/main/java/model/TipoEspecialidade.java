package model;

public class TipoEspecialidade implements BaseEntity{
	
	private Integer id;
	private String descricao;
	
	public TipoEspecialidade() {
		
	}

	public TipoEspecialidade(Integer id) {
		this.id = id;
	}

	public TipoEspecialidade(Integer id, String descricao) {
		this.id = id;
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

}
