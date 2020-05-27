package model;

public class TipoAnimal implements BaseEntity{
	
	private Integer id;
	private String descricao;
	
	public TipoAnimal() {
		
	}
	public TipoAnimal(Integer id) {
		this.id = id;
	}
	
	public TipoAnimal(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public Integer getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}