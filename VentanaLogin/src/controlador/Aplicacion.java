package controlador;

import modelo.Logica;
import vista.VentanaLogin;
import vista.VentanaPrincipal;

public class Aplicacion {

	public void iniciarSistema() {

		// INSTANCIAMOS LAS CLASES UNICAS
		VentanaPrincipal miVentana = new VentanaPrincipal();
		VentanaLogin miLogin = new VentanaLogin(miVentana, true);
		Coordinador miCoordinador = new Coordinador();
		Logica miLogica = new Logica();

		// RELACIONAMOS LAS CLASES CON EL COORDINADOR
		miVentana.setCoordinador(miCoordinador);
		miLogin.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		
		//RELACIONAMOS EL COORDINADOR CON LAS CLASES
		miCoordinador.setVentanaPrincipal(miVentana);
		miCoordinador.setVentanaLogin(miLogin);
		miCoordinador.setLogica(miLogica);

		miVentana.setVisible(true);
		miLogin.setVisible(true);
	}
}
