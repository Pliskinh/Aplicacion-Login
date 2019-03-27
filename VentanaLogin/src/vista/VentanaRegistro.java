package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import controlador.Coordinador;
import modelo.vo.UsuarioVo;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;

public class VentanaRegistro extends JDialog implements ActionListener {
	private JTextField txtNombre;
	private JTextField txtProfesion;
	private JTextField txtDireccion;
	private JTextField txtDocumento;
	private JTextField txtEdad;
	private JTextField txtTelefono;
	private Coordinador miCoordinador;
	private JButton btnAceptar;
	private JButton btnCancelar;

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

		txtNombre = new JTextField();
		txtNombre.setBounds(101, 154, 213, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		txtProfesion = new JTextField();
		txtProfesion.setColumns(10);
		txtProfesion.setBounds(101, 185, 213, 20);
		panel.add(txtProfesion);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(101, 216, 213, 20);
		panel.add(txtDireccion);

		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(446, 154, 213, 20);
		panel.add(txtDocumento);

		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(446, 185, 213, 20);
		panel.add(txtEdad);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(446, 216, 213, 20);
		panel.add(txtTelefono);

		JLabel lblNewLabel_1 = new JLabel("*Nombre:");
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

		JLabel lblDocumento = new JLabel("*Documento:");
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
			registrar();

		}
		if (e.getSource() == btnCancelar) {
			dispose();
		}

	}

	private void registrar() {
		UsuarioVo miUsuarioVo = new UsuarioVo();

		Integer edad = miCoordinador.validarEdad(txtEdad.getText().trim());

		if (edad != null) {
			miUsuarioVo.setDocumento(txtDocumento.getText().trim());
			miUsuarioVo.setDireccion(txtDireccion.getText().trim());
			miUsuarioVo.setNombre(txtNombre.getText().trim());
			miUsuarioVo.setEdad(edad);
			miUsuarioVo.setProfesion(txtProfesion.getText().trim());
			miUsuarioVo.setTelefono(txtTelefono.getText().trim());

			String retorno = "";
			if (miCoordinador.validarCampos(miUsuarioVo)) {

				retorno = miCoordinador.registrarUsuario(miUsuarioVo);
			} else {
				retorno = "mas_datos";
			}

			if (retorno.equals("ok")) {
				JOptionPane.showMessageDialog(null, "El usuario fue registrado con exito!!!");
			} else {

				if (retorno.equals("error")) {
					JOptionPane.showMessageDialog(null, "El usuario no fue registrado!!!");
				} else {
					JOptionPane.showMessageDialog(null, "Se necesitan completar los campos obligatorios (*)!!!",
							"Advertencia", JOptionPane.WARNING_MESSAGE);
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "Debe ingresar una edad valida!!!", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		}

	}
}
