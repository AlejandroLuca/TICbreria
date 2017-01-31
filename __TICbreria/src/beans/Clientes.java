package beans;

public class Clientes {
	private int idCliente;
	private String nombre;
	private String direccion;
	private String fechaNacimiento;
	
	public Clientes(){
		
	}

	public Clientes(int idCliente, String nombre, String direccion, String fechaNacimiento) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
