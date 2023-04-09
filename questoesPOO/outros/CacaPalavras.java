package outros;

import java.util.Arrays;

public class CacaPalavras {
	
	private char[] letras;
	private char[] tabela;
	
	public CacaPalavras() {
		letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		tabela = new char[64];
		Arrays.fill(tabela, '.');
	}
	
//	public static String trocar(String palavra, int l1, int l2) {
//		
//		char[] letras = palavra.toCharArray();
//		
//		char aux = letras[l1];
//		letras[l1] = letras[l2];
//		letras[l2] = aux;
//		
//		return String.valueOf(letras);
//		
//	}
	
	public char dado() {
		
		int pos = (int) (Math.random() * letras.length);
		return letras[pos];
		
	}
	
	private String inverterPalavra(String palavra) {
		return new StringBuilder(palavra).reverse().toString();
	}
	
	public void adicionarLinha(String palavra, int inicio, boolean inverter) {
		
		if (inverter) {
			palavra = inverterPalavra(palavra);
		}
		
		palavra = palavra.toUpperCase();
		
		
		int f = inicio + palavra.length();
		
		for (int i = inicio;i < f; i++) {
			tabela[i] = palavra.charAt(i - inicio);
		}
		
	}
	
	public void adicionarColuna(String palavra, int inicio, boolean inverter) {
		
		if (inverter) {
			palavra = inverterPalavra(palavra);
		}
		
		palavra = palavra.toUpperCase();
		
		for (int i = 0; i < palavra.length(); i++) {
			tabela[inicio] = palavra.charAt(i);
			inicio += 8;
			
		}
	}
	
	public String gerarTabela() {
		
		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i] == '.') tabela[i] = dado();
			
			if (i % 8 == 0) System.out.println();
			System.out.print(" " + tabela[i]);
		}
		
		return String.valueOf(tabela);
	}
	
	public static void main(String[] args) {
		
		CacaPalavras cacaPalavras = new CacaPalavras();
		cacaPalavras.adicionarLinha("acerola", 16, false);
		cacaPalavras.adicionarColuna("banana", 8, false);
		
		cacaPalavras.adicionarColuna("caju", 6, true);
		cacaPalavras.adicionarLinha("melancia", 48, true);
		cacaPalavras.gerarTabela();
		
	}

}