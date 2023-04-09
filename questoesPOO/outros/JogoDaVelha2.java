package outros;

import java.util.Scanner;

public class JogoDaVelha2 {
	
public static void main(String[] args) {
		
		JogoDaVelha jogo = new JogoDaVelha();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Jogador1: ");
		String j1 = input.nextLine();
		System.out.print("Jogador2: ");
		String j2 = input.nextLine();
		
		char[] tab = "\n00|02|04\n06|08|10\n12|14|16\n".toCharArray();
		
		System.out.println("posições jogáveis");
		System.out.println(tab);
		
		System.out.println(jogo.getTabuleiro());
		int n = 0;
		
		boolean alterna = true;
		
		for (int i = 0; i < 9; i++) {
			
			String jogador;
			char c;
			
			if (alterna) {
				jogador = j1;
				c = 'X';
				alterna = false;
			} else {
				jogador = j2;
				c = 'O';
				alterna = true;
			}
			
			System.out.println("Jogador da vez: " + jogador);
			System.out.print("\nDigite a posição: ");
			n = Integer.parseInt(input.nextLine());
			
			while (!jogo.validar(n)) {
				System.out.println("Posição inválida");
				System.out.print("Digite a posição: ");
				n = Integer.parseInt(input.nextLine());
			}
			
			jogo.jogador(n, c);
			
			if (jogo.validarVencer(c)) {
				System.out.println(jogo.getTabuleiro());
				System.out.println(jogador + " ganhou!");
				break;
			}
			
			if (i == 8) {
				System.out.println("Deu velha");
				break;
			}
			System.out.println(jogo.getTabuleiro());
			
		}
		
	}

}
