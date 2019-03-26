package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private String nombreBd = "usuario_bd";
	private String usuario = "root";
	private String password = "";
	private String url = "jdbc:mysql://localhost:34340/" + nombreBd;

	Connection conn = null;

	public Conexion() {
		try {
			conn = DriverManager.getConnection(url, usuario, password);

			if (conn != null) {
				System.out.println("Conexion exitosa a la BD: " + nombreBd);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return conn;
	}

	public void desconectar() {
		conn = null;
	}

}
