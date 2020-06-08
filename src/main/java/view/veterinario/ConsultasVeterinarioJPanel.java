package view.veterinario;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.impl.ControlladorConsulta;
import model.Consulta;
import view.Main;
import view.PainelUsuarioJPanel;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultasVeterinarioJPanel extends JPanel {
	private JTextField txtNomePet;
	private JTable tblConsultas;

	/**
	 * Create the panel.
	 */
	public ConsultasVeterinarioJPanel() {
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
		scrollPane.setBounds(210, 158, 437, 431);
		add(scrollPane);
		
		DefaultTableModel modelConsultas = new DefaultTableModel();
		tblConsultas = new JTable();
		tblConsultas.setModel(modelConsultas);
		
		modelConsultas.addColumn("Id");
		modelConsultas.addColumn("Pet");
		modelConsultas.addColumn("Dono");
		modelConsultas.addColumn("Veterinario");
		modelConsultas.addColumn("Data");
		modelConsultas.addColumn("Hora");
		
		tblConsultas.getColumnModel().getColumn(0).setResizable(false);
		tblConsultas.getColumnModel().getColumn(1).setResizable(false);
		tblConsultas.getColumnModel().getColumn(2).setResizable(false);
		tblConsultas.getColumnModel().getColumn(3).setResizable(false);
		tblConsultas.getColumnModel().getColumn(4).setResizable(false);
		tblConsultas.getColumnModel().getColumn(5).setResizable(false);
		
		tblConsultas.getColumnModel().getColumn(0).setMinWidth(50);
		tblConsultas.getColumnModel().getColumn(0).setMaxWidth(50);
		
		ControlladorConsulta ControlladorConsulta = new ControlladorConsulta();
		List<Consulta> listaConsulta = ControlladorConsulta.listarConsultas();
		
		for (Consulta consulta : listaConsulta) {
			
			modelConsultas.addRow(new Object[] {
					
					consulta.getId(),
					consulta.getPet().getNome(),
					consulta.getPet().getDonoPet().getNome(),
					consulta.getVeterinario().getNome()
					
			});
			
		}
		
		scrollPane.setViewportView(tblConsultas);
		
		JButton btnRealizarConsulta = new JButton("Realizar Consulta");
		btnRealizarConsulta.setBounds(657, 158, 133, 32);
		add(btnRealizarConsulta);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomePet = txtNomePet.getText();
				
				ControlladorConsulta ControlladorConsulta = new ControlladorConsulta();
				List<Consulta> listaConsulta = ControlladorConsulta.listarConsultasPorNomePet(nomePet);
				
				modelConsultas.setRowCount(0);
				
				for (Consulta consulta : listaConsulta) {
					
					modelConsultas.addRow(new Object[] {
							
							consulta.getId(),
							consulta.getPet().getNome(),
							consulta.getPet().getDonoPet().getNome(),
							consulta.getVeterinario().getNome()
							
					});
					
				}
				
			}
		});
		btnBuscar.setBounds(558, 124, 89, 23);
		add(btnBuscar);
		
		txtNomePet = new JTextField();
		txtNomePet.setBounds(333, 124, 215, 23);
		add(txtNomePet);
		txtNomePet.setColumns(10);
		
		JLabel lblNomePet = new JLabel("Nome do Pet");
		lblNomePet.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNomePet.setBounds(210, 126, 113, 14);
		add(lblNomePet);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setBounds(657, 201, 133, 32);
		add(btnVisualizar);

	}
}
