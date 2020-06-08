package view.veterinario;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.impl.ControlladorRelatorio;
import model.Relatorio;
import view.Main;
import view.PainelUsuarioJPanel;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class RelatoriosVeterinarioJPanel extends JPanel {
	private JTextField textField;
	private JTable tblRelatorio;

	/**
	 * Create the panel.
	 */
	public RelatoriosVeterinarioJPanel() {
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
		
		Button btnCadastrar = new Button("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastrarRelatoriosVeterinarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCadastrar.setBackground(new Color(0, 153, 204));
		btnCadastrar.setBounds(715, 132, 75, 26);
		add(btnCadastrar);
		
		Button btnVisualizar = new Button("Visualizar");
		btnVisualizar.setForeground(Color.WHITE);
		btnVisualizar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVisualizar.setBackground(new Color(0, 153, 204));
		btnVisualizar.setBounds(634, 132, 75, 26);
		add(btnVisualizar);
		
		Button btnBuscar = new Button("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnBuscar.setBackground(new Color(0, 153, 204));
		btnBuscar.setBounds(553, 132, 75, 26);
		add(btnBuscar);
		
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(210, 132, 337, 26);
		add(textField);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblTitulo.setBounds(210, 97, 58, 24);
		add(lblTitulo);

	}

}
