package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.Color;

public class VentanaLogin extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	private Coordinador miCoordinador;
	private JButton btnAceptar;
	private JComboBox<Object> comboBox;
	private JLabel lblPass;

	public VentanaLogin(JFrame parent, boolean modal) {
		super(parent, modal);
		setBounds(100, 100, 288, 441);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(Color.GRAY);
		panelLogin.setBounds(0, 0, 290, 413);
		contentPanel.add(panelLogin);
		panelLogin.setLayout(null);

		JLabel lblTitulo = new JLabel("Ventana Login");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblTitulo.setFont(new Font("Decker", Font.BOLD, 14));
		lblTitulo.setBounds(71, 22, 130, 44);
		panelLogin.add(lblTitulo);

		JLabel lblImg = new JLabel("");
		lblImg.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblImg.setIcon(new ImageIcon(
				"C:\\Users\\leonardo\\Desktop\\Programas\\Archivos de programas\\GIT\\Aplicacion-Login\\VentanaLogin\\src\\imagenes\\candado.png"));
		lblImg.setBounds(71, 107, 130, 131);
		panelLogin.add(lblImg);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsuario.setBounds(10, 270, 54, 22);
		panelLogin.add(lblUsuario);

		lblPass = new JLabel("pass");
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblPass.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPass.setBounds(10, 316, 46, 14);
		panelLogin.add(lblPass);
		lblPass.setVisible(false);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(162, 369, 89, 23);
		panelLogin.add(btnAceptar);
		btnAceptar.addActionListener(this);

		comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] { "Seleccione", "Administrador", "Usuario" }));
		comboBox.setBounds(71, 272, 140, 20);
		panelLogin.add(comboBox);
		comboBox.addActionListener(this);

		passwordField = new JPasswordField();
		passwordField.setBounds(71, 314, 140, 20);
		panelLogin.add(passwordField);
		passwordField.setVisible(false);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String seleccion = (String) comboBox.getSelectedItem();

		int index = comboBox.getSelectedIndex();

		if (e.getSource() == comboBox) {
			if (index == 0) {
				lblPass.setVisible(false);
				passwordField.setVisible(false);
			} else {
				lblPass.setVisible(true);
				passwordField.setVisible(true);
			}
		}

		if (e.getSource() == btnAceptar) {
			String resp = miCoordinador.validarUsuario(comboBox.getSelectedIndex(),
					(String.valueOf((passwordField.getPassword()))));

			if (resp.equals("Error")) {
				JOptionPane.showMessageDialog(null, "No ha seleccionado un usuario");
			} else {

				JOptionPane.showMessageDialog(null, "Bienvenido: " + resp);
				miCoordinador.asignarPrivilegios(resp);
				miCoordinador.cerrarVentanaLogin();
			}

		}
	}
}
