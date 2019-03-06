package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Dimension tamPantalla;
	private Rectangle pantalla;
	private Coordinador miCoordinador;
	private JLabel lblTitulo;
	private JButton btnRegistrar;
	private JButton btnConsultar;
	private JMenuBar barraMenu;
	private JMenu menu;
	private JMenuItem itemOpciones;

	public VentanaPrincipal() {
		setTitle("Ventana Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		pantalla = new Rectangle(tamPantalla);
		setBounds(pantalla);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel miPanelPrincipal = new JPanel();
		miPanelPrincipal.setBackground(SystemColor.textHighlight);
		miPanelPrincipal.setBounds(pantalla);
		contentPane.add(miPanelPrincipal);
		miPanelPrincipal.setLayout(null);

		lblTitulo = new JLabel("Bienvenido:");
		lblTitulo.setFont(new Font("Decker", Font.BOLD, 20));
		lblTitulo.setBounds(32, 12, 668, 49);
		miPanelPrincipal.add(lblTitulo);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setOpaque(false);
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistrar.setBounds(33, 119, 138, 41);
		miPanelPrincipal.add(btnRegistrar);
		btnRegistrar.addActionListener(this);

		barraMenu = new JMenuBar();
		menu = new JMenu();
		itemOpciones = new JMenuItem();

		menu.setText("Opciones");
		itemOpciones.setText("Cambiar Usuario");
		menu.add(itemOpciones);
		itemOpciones.addActionListener(this);
		barraMenu.add(menu);
		setJMenuBar(barraMenu);

		btnConsultar = new JButton("Consultar");
		btnConsultar.setOpaque(false);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(37, 204, 131, 40);
		miPanelPrincipal.add(btnConsultar);
		btnConsultar.addActionListener(this);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;

	}

	public void asignarPrivilegios(String user) {
		lblTitulo.setText("Bienvenido: " + user);

		if (user.equals("Administrador")) {
			btnConsultar.setVisible(true);
			btnRegistrar.setVisible(true);
		} else {
			btnConsultar.setVisible(false);
			btnRegistrar.setVisible(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == itemOpciones) {
			miCoordinador.mostrarLogin();
		}

		if (e.getSource() == btnRegistrar) {
			miCoordinador.mostrarVentanaRegistro();
		}
		if (e.getSource() == btnConsultar) {
			miCoordinador.mostrarVentanaConsulta();
		}

	}
}
