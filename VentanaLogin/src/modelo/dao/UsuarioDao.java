package modelo.dao;

import javax.swing.JOptionPane;

import controlador.Coordinador;

public class UsuarioDao {

	private Coordinador miCoordinador;

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}

	public void registrarUsuario() {
		JOptionPane.showMessageDialog(null, "Hola");
		
	}

}
