package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;

public class VentanaLogin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;

	
	public VentanaLogin() {
		setBounds(100, 100, 288, 441);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(SystemColor.textHighlight);
		panelLogin.setBounds(0, 0, 278, 403);
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
		lblImg.setIcon(new ImageIcon("C:\\Users\\leonardo\\Desktop\\Programas\\Archivos de programas\\WorkSpace JAVA\\VentanaLogin\\src\\imagenes\\candado.png"));
		lblImg.setBounds(71, 107, 130, 131);
		panelLogin.add(lblImg);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsuario.setBounds(10, 270, 54, 22);
		panelLogin.add(lblUsuario);
		
		JLabel lblPass = new JLabel("pass");
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblPass.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPass.setBounds(10, 316, 46, 14);
		panelLogin.add(lblPass);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(162, 369, 89, 23);
		panelLogin.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Administrador", "Usuario"}));
		comboBox.setBounds(71, 272, 140, 20);
		panelLogin.add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(71, 314, 140, 20);
		panelLogin.add(passwordField);
	}
}
