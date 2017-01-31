package beans;

import datos.enumerados.Generos;

public class Libro {
	private String autor;
	private String editorial;
	private int id_libro;
	private Generos genero;
	private String nombre;
	private String ISBN;
	private double precio;
	
	public Libro(){
		
	}

	public Libro(String autor, String editorial, int id_libro, Generos genero, String nombre, String iSBN,
			double precio) {
		super();
		this.autor = autor;
		this.editorial = editorial;
		this.id_libro = id_libro;
		this.genero = genero;
		this.nombre = nombre;
		ISBN = iSBN;
		this.precio = precio;
	}





	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Autores [autor=" + autor + ", editorial=" + editorial + ", id_libro=" + id_libro + ", genero=" + genero
				+ ", nombre=" + nombre + ", ISBN=" + ISBN + ", precio=" + precio + "]";
	}
	
}
