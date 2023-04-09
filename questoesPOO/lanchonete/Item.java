package lanchonete;

public abstract class Item {
	
	private String nome;
	private float preco;
	
	public Item(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public float getPreco() {
		return preco;
	}
		
}
