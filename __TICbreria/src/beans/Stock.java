package beans;

public class Stock {
	private int cantidad;
	private int id_libro;
	
	public Stock(){
		
	}

	public Stock(int cantidad, int id_libro) {
		super();
		this.cantidad = cantidad;
		this.id_libro = id_libro;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	@Override
	public String toString() {
		return "Stock [cantidad=" + cantidad + ", id_libro=" + id_libro + "]";
	}
	
}
