package excecao;

@SuppressWarnings("serial")
public class SenhaDiferentesException extends Exception {
	
	@Override
	public String getMessage() {
		
		return "As senhas devem ser iguais!";
	}

}
