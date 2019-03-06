package controlador;

import modelo.Logica;
import modelo.dao.UsuarioDao;
import modelo.vo.UsuarioVo;
import vista.VentanaConsultaIndividual;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

public class Coordinador {

	private VentanaPrincipal miVentana;
	private VentanaLogin miLogin;
	private Logica miLogica;
	private VentanaRegistro miVentanaRegistro;
	private VentanaConsultaIndividual miVentanaConsulta;
	private UsuarioDao miUsuarioDao;
	private UsuarioVo miUsuarioVo;

	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		this.miVentana = miVentana;

	}

	public void setVentanaLogin(VentanaLogin miLogin) {
		this.miLogin = miLogin;
	}

	public void setLogica(Logica miLogica) {
		this.miLogica = miLogica;

	}

	public void setVentanaRegistro(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro = miVentanaRegistro;

	}

	public void setVentanaConsultaIndividual(VentanaConsultaIndividual miVentanaConsulta) {
		this.miVentanaConsulta = miVentanaConsulta;

	}

	public void setUsuarioDao(UsuarioDao miUsuarioDao) {
		this.miUsuarioDao = miUsuarioDao;

	}

	public void setUsuarioVo(UsuarioVo miUsuarioVo) {
		this.miUsuarioVo = miUsuarioVo;
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

	public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);

	}

	public void mostrarVentanaConsulta() {
		miVentanaConsulta.setVisible(true);

	}

	public void registrarUsuario() {
		miUsuarioDao.registrarUsuario();
		
	}

}
