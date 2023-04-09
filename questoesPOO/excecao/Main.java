package excecao;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		

		CadastroUsuarios cadastro = new CadastroUsuarios(2);
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < cadastro.getUsuarios().length; i++) {
			
			while (true) {
				try {
					Usuario u = new Usuario();
					
					System.out.print("Nome de usuario: ");
					String nome = input.nextLine();
					u.setNome(nome);
					
					cadastro.verificarUsuario(u);
					
					System.out.print("Senha: ");
					String senha = input.nextLine();
					
					System.out.print("Confirmar senha: ");
					String confirmarSenha = input.nextLine();
					
					if (!senha.equals(confirmarSenha))
						throw new SenhaDiferentesException();
			
					u.setSenha(senha);
					cadastro.addUsuario(u);
					break;
					
				} catch (UsuarioJaExisteException | SenhaDiferentesException e) {
					System.out.println(e.getMessage());
				
				}
					
				
			}
				
			
		}
		
		System.out.println(Arrays.toString(cadastro.getUsuarios()));
	}

}
