package controlador;

import modelo.Logica;
import modelo.dao.UsuarioDao;
import modelo.vo.UsuarioVo;
import vista.VentanaConsultaIndividual;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

public class Aplicacion {

	public void iniciarSistema() {

		// INSTANCIAMOS LAS CLASES UNICAS
		VentanaPrincipal miVentana = new VentanaPrincipal();
		VentanaLogin miLogin = new VentanaLogin(miVentana, true);
		VentanaRegistro miVentanaRegistro = new VentanaRegistro();
		VentanaConsultaIndividual miVentanaConsulta = new VentanaConsultaIndividual();
		Coordinador miCoordinador = new Coordinador();
		Logica miLogica = new Logica();
		UsuarioDao miUsuarioDao = new UsuarioDao();
		UsuarioVo miUsuarioVo = new UsuarioVo();

		// RELACIONAMOS LAS CLASES CON EL COORDINADOR
		miVentana.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		miVentanaConsulta.setCoordinador(miCoordinador);
		miLogin.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		miUsuarioDao.setCoordinador(miCoordinador);
		miUsuarioVo.setCoordinador(miCoordinador);

		// RELACIONAMOS EL COORDINADOR CON LAS CLASES
		miCoordinador.setVentanaPrincipal(miVentana);
		miCoordinador.setVentanaLogin(miLogin);
		miCoordinador.setLogica(miLogica);
		miCoordinador.setVentanaRegistro(miVentanaRegistro);
		miCoordinador.setVentanaConsultaIndividual(miVentanaConsulta);
		miCoordinador.setUsuarioDao(miUsuarioDao);
		miCoordinador.setUsuarioVo(miUsuarioVo);

		miVentana.setVisible(true);
		miLogin.setVisible(true);
	}
}
