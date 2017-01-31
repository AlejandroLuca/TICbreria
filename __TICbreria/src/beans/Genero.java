package beans;


public class Genero {
	private int id_genero;
	private String genero;
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Genero(){
		
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
