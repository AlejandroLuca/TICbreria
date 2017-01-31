package beans;

public class Ventas {
	private int idLibro;
	private int cantVendida;
	private int totalVendido;
	
	public Ventas(){
		
	}

	public Ventas(int idLibro, int cantVendida, int totalVendido) {
		super();
		this.idLibro = idLibro;
		this.cantVendida = cantVendida;
		this.totalVendido = totalVendido;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public int getCantVendida() {
		return cantVendida;
	}

	public void setCantVendida(int cantVendida) {
		this.cantVendida = cantVendida;
	}

	public int getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(int totalVendido) {
		this.totalVendido = totalVendido;
	}

	@Override
	public String toString() {
		return "Ventas [idLibro=" + idLibro + ", cantVendida=" + cantVendida + ", totalVendido=" + totalVendido + "]";
	}
	
	
}
