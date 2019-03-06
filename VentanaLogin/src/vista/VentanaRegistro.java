package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import controlador.Coordinador;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;

public class VentanaRegistro extends JDialog implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private Coordinador miCoordinador;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaRegistro dialog = new VentanaRegistro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaRegistro() {
		setBounds(100, 100, 740, 345);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 724, 314);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Registrar Usuario");
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Decker", Font.BOLD, 20));
		lblNewLabel.setBounds(66, 11, 576, 61);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(101, 154, 213, 20);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 185, 213, 20);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 216, 213, 20);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(446, 154, 213, 20);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(446, 185, 213, 20);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(446, 216, 213, 20);
		panel.add(textField_5);

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 154, 81, 20);
		panel.add(lblNewLabel_1);

		JLabel lblProfesion = new JLabel("Profesion:");
		lblProfesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfesion.setBounds(10, 188, 81, 20);
		panel.add(lblProfesion);

		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setBounds(10, 219, 81, 20);
		panel.add(lblDireccion);

		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocumento.setBounds(355, 154, 81, 20);
		panel.add(lblDocumento);

		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdad.setBounds(355, 188, 81, 20);
		panel.add(lblEdad);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setBounds(355, 219, 81, 20);
		panel.add(lblTelefono);

		JSeparator separator = new JSeparator();
		separator.setBounds(66, 141, 583, 2);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(66, 247, 583, 2);
		panel.add(separator_1);

		JLabel lblDiligencieElFormulario = new JLabel(
				"Diligencie el formulario para registrar el usuario en el sistema ");
		lblDiligencieElFormulario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiligencieElFormulario.setBounds(66, 110, 576, 20);
		panel.add(lblDiligencieElFormulario);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setOpaque(false);
		btnAceptar.setBounds(407, 267, 89, 23);
		panel.add(btnAceptar);
		btnAceptar.addActionListener(this);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setOpaque(false);
		btnCancelar.setBounds(553, 267, 89, 23);
		panel.add(btnCancelar);
		btnCancelar.addActionListener(this);

	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			miCoordinador.registrarUsuario();
		}
		if (e.getSource() == btnCancelar) {

		}

	}
}
