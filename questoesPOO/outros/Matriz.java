package outros;

public class Matriz {

	public static void main(String[] args) {
		
		Object[][] matriz = new Object[5][4];
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][0] = new Aluno("aluno" + (i+1));
			for (int j = 1; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 101);
			}
		}
		
		int media;
		String situacao;
		
		for (Object[] o : matriz) {
			media = ((int) o[1] + (int) o[2])/2;
			System.out.println("\nNome: " + o[0]);
			System.out.println("Media: " + media);
			
			if (media >= 70)
				situacao = "APROVADO";
			else if (media >= 50)
				situacao = "RECUPERAÇÃO";
			else
				situacao = "REPROVADO";
			
			System.out.println("Situação: " + situacao);
				
		}

	}

}
