package outros;

import java.util.Scanner;

public class JogoDaVelha {
	
	private char[] tabuleiro;
	
	public JogoDaVelha() {
		tabuleiro = "_|_|_\n_|_|_\n | | \n".toCharArray();
	}
	
	public char[] getTabuleiro() {
		return tabuleiro;
	}
	
	public int dado() {
		return 2 * (int) (1+Math.random()*8);
	}
	
	public void jogadaPc(int pos) {
		tabuleiro[pos] = 'X';
	}
	
	public void jogador(int pos, char c) {
		tabuleiro[pos] = c;
	}
	
	public boolean validar(int s) {
		
		if (tabuleiro[s] == 'X' || tabuleiro[s] == 'O')
			return false;
		
		return true;
		
	}
	
	public boolean validarVencer(char c) {
		
		return validarLinhas(c) || validarColunas(c) || validarDiagonais(c);
		
	}
	
	private boolean validarLinhas(char c) {
		
		if (tabuleiro[0] == c && tabuleiro[2] == c && tabuleiro[4] == c) return true;
		if (tabuleiro[6] == c && tabuleiro[8] == c && tabuleiro[10] == c) return true;
		if (tabuleiro[12] == c && tabuleiro[14] == c && tabuleiro[16] == c) return true;
		
		return false;
		
	}
	
	private boolean validarColunas(char c) {
		
		if (tabuleiro[0] == c && tabuleiro[6] == c && tabuleiro[12] == c) return true;
		if (tabuleiro[2] == c && tabuleiro[8] == c && tabuleiro[14] == c) return true;
		if (tabuleiro[4] == c && tabuleiro[10] == c && tabuleiro[16] == c) return true;
		
		return false;
	}
	
	private boolean validarDiagonais(char c) {
		
		if (tabuleiro[0] == c && tabuleiro[8] == c && tabuleiro[16] == c) return true;
		if (tabuleiro[12] == c && tabuleiro[8] == c && tabuleiro[4] == c) return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		JogoDaVelha jogo = new JogoDaVelha();
		
		Scanner input = new Scanner(System.in);
		
		char[] tab = "\n00|02|04\n06|08|10\n12|14|16\n".toCharArray();
		
		System.out.println("posições jogáveis");
		System.out.println(tab);
		
		System.out.println(jogo.getTabuleiro());
		int n = 0;
		
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("\nDigite a posição: ");
			n = Integer.parseInt(input.nextLine());
			
			while (!jogo.validar(n)) {
				System.out.println("Posição inválida");
				System.out.print("Digite a posição: ");
				n = Integer.parseInt(input.nextLine());
			}
			
			jogo.jogador(n);
			
			if (jogo.validarVencer('O')) {
				System.out.println(jogo.getTabuleiro());
				System.out.println("Você ganhou");
				break;
			}
			
			if (i == 4) {
				System.out.println("Deu velha");
				break;
			}
			
			int p = jogo.dado();
			
			while (!jogo.validar(p)) {
				p = jogo.dado();
			}
			
			jogo.jogadaPc(p);
			
			if (jogo.validarVencer('X')) {
				System.out.println(jogo.getTabuleiro());
				System.out.println("Você perdeu");
				break;
			}
			System.out.println(jogo.getTabuleiro());
			
		}
		
	}

}
