package beans;

import datos.enumerados.Generos;

public class Genero {
	private Generos genero;
	private int id_genero;
	
	public Genero(){
		
	}

	public Genero(Generos genero, int id_genero) {
		super();
		this.genero = genero;
		this.id_genero = id_genero;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	public int getId_genero() {
		return id_genero;
	}

	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}

	@Override
	public String toString() {
		return "Genero [genero=" + genero + ", id_genero=" + id_genero + "]";
	}
	
	
}
