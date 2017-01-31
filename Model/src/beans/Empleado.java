package beans;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import utilidades.Datos;

/**
 *
 * @author Antonio
 */
public class Empleado {

    private String nombre;
    private double salario;
    private Date fecha_nac;

    public Empleado() {
    }

    public Empleado(String nombre, double salario, Date fecha_nac) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha_nac = fecha_nac;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void crearEmpleado() {
        this.nombre = Datos.recogeString("Introduzca el nombre:");
        this.salario = Datos.recogeDouble("Insalario:");
        this.fecha_nac = new Date();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            //System.out.println("-- [equals] Objeto nulo");
            return false;
        }
        if (getClass() != obj.getClass()) {
            //¿Y si es una herencia?
            if (!(obj instanceof Empleado)) {
                return false;
            }

            //System.out.println(this.getClass());
            //System.out.println(obj.getClass());
            //System.out.println("-- [equals] Clases distintas");
        }
        final Empleado other = (Empleado) obj;

        if (!Objects.equals(this.nombre, other.nombre)) {
            //System.out.println("-- [equals] Nombres distintos");
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", fecha_nac=" + fecha_nac + '}';
    }
}
