package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;


	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel miPanelPrincipal = new JPanel();
		miPanelPrincipal.setBackground(SystemColor.textHighlight);
		miPanelPrincipal.setBounds(-1, 0, 779, 449);
		contentPane.add(miPanelPrincipal);
		miPanelPrincipal.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Bienvenido al Sistema");
		lblTitulo.setFont(new Font("Decker", Font.BOLD, 20));
		lblTitulo.setBounds(32, 12, 668, 49);
		miPanelPrincipal.add(lblTitulo);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setOpaque(false);
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistrar.setBounds(33, 119, 138, 41);
		miPanelPrincipal.add(btnRegistrar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setOpaque(false);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(37, 204, 131, 40);
		miPanelPrincipal.add(btnConsultar);
	}

}
