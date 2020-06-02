package exception;

public class CamposCadastroEnderecoVazios extends Exception{

	private boolean estado;
	private boolean cidade;
	private boolean bairro;
	private boolean rua;
	private boolean numero;
	
	public CamposCadastroEnderecoVazios() {
		
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean isCidade() {
		return cidade;
	}

	public void setCidade(boolean cidade) {
		this.cidade = cidade;
	}

	public boolean isBairro() {
		return bairro;
	}

	public void setBairro(boolean bairro) {
		this.bairro = bairro;
	}

	public boolean isRua() {
		return rua;
	}

	public void setRua(boolean rua) {
		this.rua = rua;
	}

	public boolean isNumero() {
		return numero;
	}

	public void setNumero(boolean numero) {
		this.numero = numero;
	}
	
}
