package view.veterinario;

import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import view.Main;
import view.PainelUsuarioJPanel;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginVeterinarioJPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public LoginVeterinarioJPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 800, 40);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 39, 800, 40);
		add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Os dados de Login e/ou Senha est\u00E3o incorretos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		panel_1.add(lblNewLabel);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBackground(new Color(128, 0, 128));
		panelCliente.setBounds(312, 90, 150, 150);
		add(panelCliente);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblLogin.setBounds(291, 282, 46, 14);
		add(lblLogin);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(291, 299, 200, 28);
		add(textField);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSenha.setBounds(291, 338, 46, 14);
		add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(291, 354, 200, 28);
		add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PerfilVeterinarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(291, 393, 200, 28);
		add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PainelUsuarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnVoltar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVoltar.setBounds(10, 557, 150, 32);
		add(btnVoltar);

	}

}
