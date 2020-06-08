package view.veterinario;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.impl.ControlladorRelatorio;
import model.Relatorio;
import view.Main;
import view.PainelUsuarioJPanel;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarRelatoriosVeterinarioJPanel extends JPanel {
	private JTextField txtTitulo;
	private JTextField txtData;

	/**
	 * Create the panel.
	 */
	public CadastrarRelatoriosVeterinarioJPanel() {
		setLayout(null);
		
		JPanel panelPerfil = new JPanel();
		panelPerfil.setLayout(null);
		panelPerfil.setBackground(new Color(30, 144, 255));
		panelPerfil.setBounds(0, 0, 800, 40);
		add(panelPerfil);
		
		JLabel btnNomeAtendente = new JLabel("Ol\u00E1, Atendente");
		btnNomeAtendente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNomeAtendente.setBounds(10, 11, 488, 20);
		panelPerfil.add(btnNomeAtendente);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PainelUsuarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnSair.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnSair.setBounds(670, 7, 120, 30);
		panelPerfil.add(btnSair);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setLayout(null);
		panelMenu.setBackground(new Color(51, 153, 102));
		panelMenu.setBounds(0, 39, 200, 561);
		add(panelMenu);
		
		JButton btnConsultas = new JButton("Consultas");
		btnConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new ConsultasVeterinarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnConsultas.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnConsultas.setBounds(0, 0, 200, 41);
		panelMenu.add(btnConsultas);
		
		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new RelatoriosVeterinarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnRelatorios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnRelatorios.setBounds(0, 41, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDadosVeterinarios = new JButton("Dados Veterinario");
		btnDadosVeterinarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosVeterinarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDadosVeterinarios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDadosVeterinarios.setBounds(0, 82, 200, 41);
		panelMenu.add(btnDadosVeterinarios);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 132, 580, 414);
		add(scrollPane);
		
		JTextArea txtRelatorio = new JTextArea();
		scrollPane.setViewportView(txtRelatorio);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblTitulo.setBounds(242, 103, 46, 14);
		add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setColumns(10);
		txtTitulo.setBounds(298, 101, 200, 20);
		add(txtTitulo);
		
		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblData.setBounds(508, 103, 40, 14);
		add(lblData);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(558, 101, 200, 20);
		add(txtData);
		
		JButton btnCadastrarConsulta = new JButton("Cadastrar");
		btnCadastrarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String titulo = txtTitulo.getText();
				String descricao = txtRelatorio.getText();
				
				Relatorio relatorio = new Relatorio(titulo, descricao);
				
				ControlladorRelatorio controlladorRelatorio = new ControlladorRelatorio();
				controlladorRelatorio.cadastrarRelatorio(relatorio);
				
			}
		});
		btnCadastrarConsulta.setBounds(681, 557, 109, 32);
		add(btnCadastrarConsulta);

	}
}
