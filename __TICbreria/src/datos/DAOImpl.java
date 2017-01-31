package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Libro;
import beans.Ventas;
import utilidades.Conexion;
import utilidades.LecturaDatos;

public class DAOImpl implements IDAO {

	private List<Libro> libro = new ArrayList<>();
	private List<Ventas> ventas = new ArrayList<>();

	public void insertar() {

		Connection con;
		PreparedStatement ps, ps1;
		Statement st, st1;
		ResultSet rs;
		String genero = "pruebas to flamas";
		String nombre = "libropruebas";
		try {
			con = Conexion.obtenerConexion();
			st1 = con.createStatement();
			String consulta = "select * from libro where nombre like'" + nombre + "%';";
			rs = st1.executeQuery(consulta);
			if (rs.next()) {
				System.out.println("Existe el libro");
			} else {
				ps = con.prepareStatement(
						"insert into libro(nombre,autor,genero,editorial,ISBN,precio)values(?,?,?,?,?,?) ");
				ps.setString(1, "libropruebas");
				ps.setString(2, "pruebancio martinez");
				ps.setString(3, "pruebas to flamas");
				ps.setString(4, "prueberias sl");
				ps.setString(5, "1321654");
				ps.setDouble(6, 25);

				ps.executeUpdate();
				st = con.createStatement();
				String query = "select * from genero where genero like'" + genero + "%';";
				rs = st.executeQuery(query);
				if (!rs.next()) {
					ps1 = con.prepareStatement("insert into genero(genero)values(?)");
					ps1.setString(1, genero);
					ps1.executeUpdate();
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public void eliminarUsuario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mostrarAutor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarLibrosAutor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarLibrosGenero() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarLibro() {
		// TODO Auto-generated method stub
		String title = LecturaDatos.recogeString("Introduce el titulo a eliminar: ");
		Libro aux = new Libro(title);
		this.eliminarLibro(aux);
	}
	public void eliminarLibro(Libro l){
		int pos = encontrarLibro(l);
		if(pos == -1){
			System.out.println("No encontrado");
		}else{
			System.out.println("Encontrado y eliminado");
			libro.remove(pos);
		}
	}

	@Override
	public void listarLibro() {
		// TODO Auto-generated method stub
		for(Libro l: libro){
			System.out.println(l.toString());
		}
	}

	@Override
	public void modificarLibro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertarLibro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void existeLibro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarUnLibro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertarUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertarCliente() {
		// TODO Auto-generated method stub
		
	}
	public int encontrarLibro(Libro l){
		int encontrado = -1;
        for (int i = 0; i < libro.size(); i++) {
           Libro aux = libro.get(i);
            System.out.println(aux.getNombre());
            if (aux.equals(l)) {
                System.out.println("encontrado!!"); // encontrado
                encontrado = i;
            }
        }
        return encontrado;
	}
}


