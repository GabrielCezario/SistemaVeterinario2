package view.atendente;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controller.impl.ControlladorRelatorio;
import model.Atendente;
import model.Relatorio;
import view.Main;
import view.PainelUsuarioJPanel;
import view.administrador.CadastrarRelatorioAdministradorJPanel;

import javax.swing.JTable;

public class RelatorioAtendenteJPanel extends JPanel {
	private JTextField txtTitulo;
	
	protected Atendente atendenteTela;
	protected Relatorio relatorioTela;
	private JTable tblRelatorio;
	

	/**
	 * Create the panel.
	 */
	public RelatorioAtendenteJPanel() {
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
		btnConsultas.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new ConsultasAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnConsultas.setBounds(0, 0, 200, 41);
		panelMenu.add(btnConsultas);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new ClientesAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnClientes.setBounds(0, 41, 200, 41);
		panelMenu.add(btnClientes);
		
		JButton btnRelatorios = new JButton("Relat\u00F3rios");
		btnRelatorios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new RelatorioAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnRelatorios.setBounds(0, 121, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDados = new JButton("Dados Atendente");
		btnDados.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new DadosAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnDados.setBounds(0, 162, 200, 41);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 170, 580, 419);
		add(scrollPane);
		
		DefaultTableModel modelRelatorio = new DefaultTableModel();
		tblRelatorio = new JTable();
		tblRelatorio.setModel(modelRelatorio);
		
		modelRelatorio.addColumn("Id");
		modelRelatorio.addColumn("Titulo");
		modelRelatorio.addColumn("Autor");
		
		ControlladorRelatorio controlladorRelatorio = new ControlladorRelatorio();
		List<Relatorio> listaRelatorio = controlladorRelatorio.listarRelatorios();
		
		for (Relatorio relatorio : listaRelatorio) {
			
			modelRelatorio.addRow(new Object[] {
					
					relatorio.getId(),
					relatorio.getTitulo(),
					relatorio.getAutor()
					
			});
			
		}
		
		scrollPane.setViewportView(tblRelatorio);
		
		txtTitulo = new JTextField();
		txtTitulo.setColumns(10);
		txtTitulo.setBounds(210, 132, 337, 26);
		add(txtTitulo);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblTitulo.setBounds(210, 97, 58, 24);
		add(lblTitulo);
		
		JLabel lblRelatorios = new JLabel("Relatorios");
		lblRelatorios.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelatorios.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblRelatorios.setBounds(456, 51, 118, 14);
		add(lblRelatorios);
		
		Button btnCadastrar = new Button("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastrarRelatorioAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCadastrar.setBackground(new Color(0, 153, 204));
		btnCadastrar.setBounds(715, 132, 75, 26);
		add(btnCadastrar);
		
		Button btnVisualizar = new Button("Visualizar");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVisualizar.setForeground(Color.WHITE);
		btnVisualizar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVisualizar.setBackground(new Color(0, 153, 204));
		btnVisualizar.setBounds(634, 132, 75, 26);
		add(btnVisualizar);
		
		Button btnBuscar = new Button("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomeRelatorio = txtTitulo.getText();
				
				ControlladorRelatorio controlladorRelatorio = new ControlladorRelatorio();
				List<Relatorio> listaRelatorio = controlladorRelatorio.listarRelatoriosPorNome(nomeRelatorio);
				
				for (Relatorio relatorio : listaRelatorio) {
					
					modelRelatorio.addRow(new Object[] {
							
							relatorio.getId(),
							relatorio.getTitulo(),
							relatorio.getAutor()
							
					});
					
				}
				
			}
		});
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnBuscar.setBackground(new Color(0, 153, 204));
		btnBuscar.setBounds(553, 132, 75, 26);
		add(btnBuscar);

	}

}
