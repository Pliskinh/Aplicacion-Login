package controlador;

import modelo.Logica;
import vista.VentanaLogin;
import vista.VentanaPrincipal;

public class Coordinador {

	private VentanaPrincipal miVentana;
	private VentanaLogin miLogin;
	private Logica miLogica;

	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		this.miVentana = miVentana;

	}

	public void setVentanaLogin(VentanaLogin miLogin) {
		this.miLogin = miLogin;
	}

	public void setLogica(Logica miLogica) {
		this.miLogica = miLogica;

	}

	public String validarUsuario(int index, String pass) {
		return miLogica.validarIngreso(index, pass);
	}

	public void cerrarVentanaLogin() {
		miLogin.dispose();

	}

	public void asignarPrivilegios(String user) {
		miVentana.asignarPrivilegios(user);

	}

	public void mostrarLogin() {
		miLogin.setVisible(true);
		
		
	}

}
