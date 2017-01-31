package beans;

public class Editoriales {
	private String editorial;
	private int id_editorial;
	
	public Editoriales(){
		
	}

	public Editoriales(String editorial, int id_editorial) {
		super();
		this.editorial = editorial;
		this.id_editorial = id_editorial;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(int id_editorial) {
		this.id_editorial = id_editorial;
	}

	@Override
	public String toString() {
		return "Editoriales [editorial=" + editorial + ", id_editorial=" + id_editorial + "]";
	}
	
}
