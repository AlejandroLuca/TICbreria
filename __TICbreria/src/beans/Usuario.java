package beans;

public class Usuario {
	private int idUsuario;
	private String nick;
	private String contrasenia;
	
	public Usuario(){
		
	}

	public Usuario(int idUsuario, String nick, String contrasenia) {
		super();
		this.idUsuario = idUsuario;
		this.nick = nick;
		this.contrasenia = contrasenia;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nick=" + nick + ", contrasenia=" + contrasenia + "]";
	}
	
}
