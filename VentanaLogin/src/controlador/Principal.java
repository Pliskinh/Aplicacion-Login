package controlador;

import javax.swing.JFrame;

import vista.VentanaLogin;
import vista.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		VentanaPrincipal miVentana = new VentanaPrincipal();
		miVentana.setVisible(true);

		VentanaLogin miLogin = new VentanaLogin(miVentana, true);
		miLogin.setVisible(true);
		
	}

}
