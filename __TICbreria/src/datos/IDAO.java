package datos;

public interface IDAO {

	public void eliminarLibro();
	public void listarLibro();
	public void modificarLibro();
	public void insertarLibro();
	public void existeLibro();
	public void listarUnLibro();
	public void insertarUsuario();
	public void insertarCliente();
	public void eliminarUsuario(); // DELETE ON CASCADE se lleva tambien al de cliente
	public void mostrarAutor();
	public void listarLibrosAutor();
	public void listarLibrosGenero();
	
}
