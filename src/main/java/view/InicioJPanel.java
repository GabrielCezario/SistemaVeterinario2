package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioJPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public InicioJPanel() {
		setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new PainelUsuarioJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnIniciar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnIniciar.setBounds(236, 485, 350, 51);
		add(btnIniciar);

	}

}
