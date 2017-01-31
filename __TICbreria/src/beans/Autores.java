package beans;

public class Autores {
	private String nombre;
	private int id_nombre;
	
	public Autores(){
		
	}

	public Autores(String nombre, int id_nombre) {
		super();
		this.nombre = nombre;
		this.id_nombre = id_nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_nombre() {
		return id_nombre;
	}

	public void setId_nombre(int id_nombre) {
		this.id_nombre = id_nombre;
	}

	@Override
	public String toString() {
		return "Autores [nombre=" + nombre + ", id_nombre=" + id_nombre + "]";
	}
	
	
	
}
