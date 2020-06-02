package view;

import javax.swing.JPanel;

import view.administrador.LoginAdministradorJPanel;
import view.atendente.LoginAtendenteJPanel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelUsuarioJPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PainelUsuarioJPanel() {
		setLayout(null);
		
		JPanel panelAtendente = new JPanel();
		panelAtendente.setBackground(new Color(128, 128, 0));
		panelAtendente.setBounds(97, 130, 150, 150);
		add(panelAtendente);
		
		JPanel panelVeterinario = new JPanel();
		panelVeterinario.setBackground(new Color(128, 128, 0));
		panelVeterinario.setBounds(333, 130, 150, 150);
		add(panelVeterinario);
		
		JPanel panelAdministrador = new JPanel();
		panelAdministrador.setBackground(new Color(128, 128, 0));
		panelAdministrador.setBounds(558, 130, 150, 150);
		add(panelAdministrador);
		
		JButton btnAtendente = new JButton("Atendente");
		btnAtendente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new LoginAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnAtendente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAtendente.setBounds(97, 291, 150, 32);
		add(btnAtendente);
		
		JButton btnVeterinario = new JButton("Veterinario");
		btnVeterinario.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVeterinario.setBounds(333, 291, 150, 32);
		add(btnVeterinario);
		
		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new LoginAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnAdministrador.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAdministrador.setBounds(558, 291, 150, 32);
		add(btnAdministrador);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new PainelJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnVoltar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVoltar.setBounds(10, 557, 150, 32);
		add(btnVoltar);

	}

}
