package excecao;

@SuppressWarnings("serial")
public class UsuarioJaExisteException extends Exception {
	
	@Override
	public String getMessage() {
		return "Este nome de usuário já está sendo usado";
	}

}
