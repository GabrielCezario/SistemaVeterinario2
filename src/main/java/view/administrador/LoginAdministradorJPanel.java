package view.administrador;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import view.Main;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAdministradorJPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public LoginAdministradorJPanel() {
		setLayout(null);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBackground(new Color(128, 0, 128));
		panelCliente.setBounds(316, 99, 150, 150);
		add(panelCliente);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 800, 40);
		add(panel);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblLogin.setBounds(295, 291, 46, 14);
		add(lblLogin);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(295, 308, 200, 28);
		add(textField);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSenha.setBounds(295, 347, 46, 14);
		add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(295, 363, 200, 28);
		add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PerfilAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(295, 402, 200, 28);
		add(btnNewButton);
		
		JPanel panelErro = new JPanel();
		panelErro.setLayout(null);
		panelErro.setBackground(new Color(220, 20, 60));
		panelErro.setBounds(0, 37, 800, 40);
		add(panelErro);
		
		JLabel lblNewLabel = new JLabel("Os dados de Login e/ou Senha est\u00E3o incorretos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(189, 11, 427, 18);
		panelErro.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVoltar.setBounds(10, 557, 150, 32);
		add(btnVoltar);

	}

}
