package excecao;


public class Usuario {
	
	private String nome;
	private String senha;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean equals(Usuario obj) {
		if (nome.equals(obj.getNome())) return true;
		return false;
	}

}
