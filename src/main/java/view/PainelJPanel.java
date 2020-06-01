package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelJPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PainelJPanel() {
		setLayout(null);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBackground(new Color(128, 0, 128));
		panelCliente.setBounds(104, 97, 200, 200);
		add(panelCliente);
		
		JPanel panelUsuario = new JPanel();
		panelUsuario.setBackground(new Color(128, 0, 128));
		panelUsuario.setBounds(480, 97, 200, 200);
		add(panelUsuario);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnCliente.setBounds(102, 308, 202, 39);
		add(btnCliente);
		
		JButton btnUsuario = new JButton("Usuario");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new PainelUsuarioJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnUsuario.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnUsuario.setBounds(480, 308, 202, 39);
		add(btnUsuario);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new InicioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnVoltar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVoltar.setBounds(10, 557, 150, 32);
		add(btnVoltar);

	}

}
