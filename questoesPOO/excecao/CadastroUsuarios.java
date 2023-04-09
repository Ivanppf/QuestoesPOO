package excecao;

public class CadastroUsuarios {
	
	private Usuario[] usuarios;

	public CadastroUsuarios(int tam) {
		usuarios = new Usuario[tam];
	}
	
	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	
	public void addUsuario(Usuario u) throws UsuarioJaExisteException {
		
		verificarUsuario(u);
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] == null) {
				usuarios[i] = u;
				break;
			}
		}
		
	}
	
	public void verificarUsuario(Usuario u) throws UsuarioJaExisteException {
		for (Usuario a : usuarios) {
			if (a == null)
				return;
			if (a.equals(u))
				throw new UsuarioJaExisteException();
		}
	}

}
