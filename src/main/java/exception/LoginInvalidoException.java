package exception;

public class LoginInvalidoException extends Exception{

	private boolean loginInvalido;
	private boolean senhaInvalido;
	
	public LoginInvalidoException() {
		
	}

	public boolean isLoginInvalido() {
		return loginInvalido;
	}

	public void setLoginInvalido(boolean loginInvalido) {
		this.loginInvalido = loginInvalido;
	}

	public boolean isSenhaInvalido() {
		return senhaInvalido;
	}

	public void setSenhaInvalido(boolean senhaInvalido) {
		this.senhaInvalido = senhaInvalido;
	}
	
}
