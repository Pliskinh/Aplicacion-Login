package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.Coordinador;
import modelo.conexion.Conexion;
import modelo.vo.UsuarioVo;

public class UsuarioDao {

	private Coordinador miCoordinador;

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;

	}

	public String registrarUsuario(UsuarioVo datosUsuario) {
		String resultado = "";

		Connection connection = null;
		Conexion conexion = new Conexion();
		PreparedStatement preStatement = null;

		connection = conexion.getConnection();
		String consulta = "INSERT INTO usuario(documento,nombre,profesion,edad,direccion,telefono) VALUE (?,?,?,?,?,?) ";

		try {
			preStatement = connection.prepareStatement(consulta);
			preStatement.setString(1, datosUsuario.getDocumento());
			preStatement.setString(2, datosUsuario.getNombre());
			preStatement.setString(3, datosUsuario.getProfesion());
			preStatement.setInt(4, datosUsuario.getEdad());
			preStatement.setString(5, datosUsuario.getDireccion());
			preStatement.setString(6, datosUsuario.getTelefono());
			preStatement.execute();

			resultado = "ok";

		} catch (SQLException e) {
			System.out.println("No se puede registrar el dato: " + e.getMessage());
			resultado = "error";
		}

		return resultado;
	}

}
