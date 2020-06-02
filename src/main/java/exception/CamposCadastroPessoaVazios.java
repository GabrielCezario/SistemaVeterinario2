package exception;

public class CamposCadastroPessoaVazios extends Exception{

	private boolean nome;
	private boolean sobrenome;
	private boolean cpf;
	private boolean telefone;
	
	public CamposCadastroPessoaVazios() {
		
	}

	public boolean isNome() {
		return nome;
	}

	public void setNome(boolean nome) {
		this.nome = nome;
	}

	public boolean isSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(boolean sobrenome) {
		this.sobrenome = sobrenome;
	}

	public boolean isCpf() {
		return cpf;
	}

	public void setCpf(boolean cpf) {
		this.cpf = cpf;
	}

	public boolean isTelefone() {
		return telefone;
	}

	public void setTelefone(boolean telefone) {
		this.telefone = telefone;
	}	
	
}
