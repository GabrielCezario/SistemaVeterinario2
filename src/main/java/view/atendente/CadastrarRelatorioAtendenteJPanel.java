package view.atendente;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import controller.impl.ControlladorRelatorio;
import model.Atendente;
import model.Relatorio;
import view.Main;
import view.PainelUsuarioJPanel;

public class CadastrarRelatorioAtendenteJPanel extends JPanel {
	private JTextField txtTitulo;
	private JTextField txtData;
	
	protected Atendente atendenteTela;
	protected Relatorio relatorioTela;

	/**
	 * Create the panel.
	 */
	public CadastrarRelatorioAtendenteJPanel() {
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
				
				Main.getFrame().setContentPane(new ConsultasAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnConsultas.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnConsultas.setBounds(0, 0, 200, 41);
		panelMenu.add(btnConsultas);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new ClientesAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnClientes.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnClientes.setBounds(0, 41, 200, 41);
		panelMenu.add(btnClientes);
		
		JButton btnRelatorios = new JButton("Relat\u00F3rios");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new RelatorioAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnRelatorios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnRelatorios.setBounds(0, 122, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDados = new JButton("Dados Atendente");
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDados.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDados.setBounds(0, 163, 200, 41);
		panelMenu.add(btnDados);
		
		JButton btnPet = new JButton("Pet");
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PetAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnPet.setBounds(0, 80, 200, 41);
		panelMenu.add(btnPet);
		
		JLabel lblRelatorios = new JLabel("Relatorios");
		lblRelatorios.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelatorios.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblRelatorios.setBounds(456, 51, 118, 14);
		add(lblRelatorios);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 132, 580, 414);
		add(scrollPane);
		
		JTextPane txtRelatorio = new JTextPane();
		scrollPane.setViewportView(txtRelatorio);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblTitulo.setBounds(242, 103, 46, 14);
		add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(298, 101, 200, 20);
		add(txtTitulo);
		txtTitulo.setColumns(10);
		
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
