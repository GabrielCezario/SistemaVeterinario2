package view.atendente;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Atendente;
import view.Main;
import view.PainelUsuarioJPanel;

public class LoginAtendenteJPanel extends JPanel {
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	
	protected Atendente atendenteTela;

	/**
	 * Create the panel.
	 */
	public LoginAtendenteJPanel() {
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
		
		txtLogin = new JTextField();
		txtLogin.setBounds(295, 308, 200, 28);
		add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSenha.setBounds(295, 347, 46, 14);
		add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(295, 363, 200, 28);
		add(txtSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new PerfilAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(295, 402, 200, 28);
		add(btnNewButton);
		
		JPanel panelErro = new JPanel();
		panelErro.setBackground(new Color(220, 20, 60));
		panelErro.setBounds(0, 37, 800, 40);
		add(panelErro);
		panelErro.setLayout(null);
		panelErro.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Os dados de Login e/ou Senha est\u00E3o incorretos");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(189, 11, 427, 18);
		panelErro.add(lblNewLabel);
		
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
