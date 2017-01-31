package beans;

public class Facturas {
	private int idFactura;
	private int idCliente;
	private int idLibro;
	
	public Facturas(){
		
	}

	public Facturas(int idFactura, int idCliente, int idLibro) {
		super();
		this.idFactura = idFactura;
		this.idCliente = idCliente;
		this.idLibro = idLibro;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	@Override
	public String toString() {
		return "Facturas [idFactura=" + idFactura + ", idCliente=" + idCliente + ", idLibro=" + idLibro + "]";
	}
	
	
}
