package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import controlador.Coordinador;

import javax.swing.JTextField;
import javax.swing.JSeparator;

public class VentanaConsultaIndividual extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblPrefesion;
	private JLabel lblDireccion;
	private JLabel lblEdad;
	private JLabel lblEdad_1;
	private JLabel lblTelefono;
	private JSeparator separator_1;
	private JButton btnCancelar;
	private Coordinador miCoordinador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaConsultaIndividual dialog = new VentanaConsultaIndividual();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaConsultaIndividual() {
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.GRAY);
			panel.setBounds(0, 0, 640, 269);
			getContentPane().add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Consultar Usuario");
				lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Decker", Font.BOLD, 20));
				lblNewLabel.setBounds(69, 11, 493, 34);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblIngreseElDocumento = new JLabel("Ingrese el documento del usuario a consultar");
				lblIngreseElDocumento.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblIngreseElDocumento.setBounds(69, 56, 284, 27);
				panel.add(lblIngreseElDocumento);
			}
			{
				textField = new JTextField();
				textField.setBounds(364, 60, 97, 20);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JButton btnBuscar = new JButton("Buscar");
				btnBuscar.setOpaque(false);
				btnBuscar.setBounds(473, 59, 89, 23);
				panel.add(btnBuscar);
			}
			{
				JSeparator separator = new JSeparator();
				separator.setBounds(57, 94, 521, 2);
				panel.add(separator);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(92, 114, 164, 20);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(92, 145, 164, 20);
				panel.add(textField_2);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(92, 177, 164, 20);
				panel.add(textField_3);
			}
			{
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(398, 114, 164, 20);
				panel.add(textField_4);
			}
			{
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(398, 145, 164, 20);
				panel.add(textField_5);
			}
			{
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(398, 177, 164, 20);
				panel.add(textField_6);
			}
			{
				JLabel lblAsdsad = new JLabel("Nombre:");
				lblAsdsad.setHorizontalAlignment(SwingConstants.CENTER);
				lblAsdsad.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblAsdsad.setBounds(20, 117, 67, 14);
				panel.add(lblAsdsad);
			}
			{
				lblPrefesion = new JLabel("Prefesion:");
				lblPrefesion.setHorizontalAlignment(SwingConstants.CENTER);
				lblPrefesion.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblPrefesion.setBounds(20, 148, 67, 14);
				panel.add(lblPrefesion);
			}
			{
				lblDireccion = new JLabel("Direccion:");
				lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
				lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblDireccion.setBounds(20, 180, 67, 14);
				panel.add(lblDireccion);
			}
			{
				lblEdad = new JLabel("Documento:");
				lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
				lblEdad.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblEdad.setBounds(307, 117, 81, 14);
				panel.add(lblEdad);
			}
			{
				lblEdad_1 = new JLabel("Edad:");
				lblEdad_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblEdad_1.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblEdad_1.setBounds(321, 148, 67, 14);
				panel.add(lblEdad_1);
			}
			{
				lblTelefono = new JLabel("Telefono:");
				lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
				lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblTelefono.setBounds(321, 180, 67, 14);
				panel.add(lblTelefono);
			}
			{
				separator_1 = new JSeparator();
				separator_1.setBounds(58, 217, 520, 2);
				panel.add(separator_1);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.setOpaque(false);
				btnCancelar.setBounds(473, 228, 89, 23);
				panel.add(btnCancelar);
			}
		}
		setBounds(100, 100, 656, 307);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}

}
