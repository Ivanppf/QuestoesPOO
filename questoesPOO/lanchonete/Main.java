package lanchonete;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Item[] itens = new Item[4];
		
		String resp = "";
		
		for (int i = 0; i < itens.length; i++) {
			
			System.out.print("O que você deseja?"
					+ "\n1 - Suco"
					+ "\n2 - Pizza"
					+ "\nSua escolha: ");
			resp = input.nextLine();
			System.out.print("De que sabor? ");
			String sabor = input.nextLine();
			
			if (resp.equals("1")) {
				itens[i] = new Suco(sabor, 3.25f);
			}
			if (resp.equals("2")) {
				itens[i] = new Pizza(sabor, 25.60f);
			}
			
		}
		
		float totalComDesconto = 0;
		float totalSemDesconto = 0;
		
		System.out.println("\nPedidos:");
		
		for (Item i : itens) {
			
			System.out.println(i.getNome());
			
			totalSemDesconto += i.getPreco();
			
			if (i instanceof Bebida) 
				totalComDesconto += i.getPreco() * 95 / 100;
			
			if (i instanceof Comida)
				totalComDesconto += i.getPreco() * 90 / 100;
			
		}
		
		System.out.println("\nTotal sem desconto: R$ " + NumberFormat.getCurrencyInstance().format(totalSemDesconto));
		System.out.println("Total com desconto: R$ " + NumberFormat.getCurrencyInstance().format(totalComDesconto));
		
	}

}
