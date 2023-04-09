package outros;

import java.util.HashMap;

public class TesteHashMap {
	
	private HashMap<Integer, String> mapa;
	
	public TesteHashMap() {
		mapa = new HashMap<>();
		gerarHashMap();
	}
	
	private void gerarHashMap() {
		
		String[] nomes = {"Um", "Dois", "Três", "Quatro", "Cinco",
				"Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze",
				"Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito",
				"Dezenove", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta",
				"Setenta", "Oitenta", "Noventa", "Cem"};
		
		int cont = 0;
		
		for (int i = 1; i <= 100; i++) {
			mapa.put(i, nomes[cont]);
			cont++;
			
			if (i >= 20)
				i += 9;
		}
		
	}
	
	public String numPorExtenso(int num) {
		
		String palavra = "";
		
		if (mapa.containsKey(num)) {
			return (String) mapa.get(num);
		}
		
		for (int i = 100; i > 1; i-=10) {
			if (num > i) {
				palavra = mapa.get(i) + " e ";
				num -= i;
				break;
			}
		}
		
		if (mapa.containsKey(num)) {
			palavra += mapa.get(num);
		}
		
		return palavra;
		
	}
	
	public HashMap<Integer, String> getMapa() {
		return mapa;
	}
	
	public static void main(String[] args) {
		
		TesteHashMap teste = new TesteHashMap();
		
		for (int i = 0; i < 20; i++) {
			int n = (int) (1+Math.random()*100);
			System.out.println(teste.numPorExtenso(n));
		}
		
		
		
		
	}

}
