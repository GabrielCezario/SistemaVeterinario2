package view.administrador;

import javax.swing.JPanel;

import view.Main;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.impl.ControlladorRelatorio;
import model.Consulta;
import model.Relatorio;

import javax.swing.JTable;

public class RelatoriosAdministradorJPanel extends JPanel {
	private JTextField txtTitulo;
	private JTable tblRelatorio;

	/**
	 * Create the panel.
	 */
	public RelatoriosAdministradorJPanel() {
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
				
				Main.getFrame().setContentPane(new ConsultasAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnConsultas.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnConsultas.setBounds(0, 0, 200, 41);
		panelMenu.add(btnConsultas);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new ClientesAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnClientes.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnClientes.setBounds(0, 41, 200, 41);
		panelMenu.add(btnClientes);
		
		JButton btnRelatorios = new JButton("Relat\u00F3rios");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new RelatoriosAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnRelatorios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnRelatorios.setBounds(0, 328, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDadosAdministrador = new JButton("Dados Administrador");
		btnDadosAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDadosAdministrador.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDadosAdministrador.setBounds(0, 369, 200, 41);
		panelMenu.add(btnDadosAdministrador);
		
		JButton btnAtendentes = new JButton("Atendentes");
		btnAtendentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new AtendenteAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnAtendentes.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAtendentes.setBounds(0, 164, 200, 41);
		panelMenu.add(btnAtendentes);
		
		JButton btnVeterinarios = new JButton("Veterinarios");
		btnVeterinarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new VeterinarioAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();				
				
			}
		});
		btnVeterinarios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVeterinarios.setBounds(0, 205, 200, 41);
		panelMenu.add(btnVeterinarios);
		
		JButton btnAdministradores = new JButton("Administradores");
		btnAdministradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new AdministradorAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnAdministradores.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAdministradores.setBounds(0, 287, 200, 41);
		panelMenu.add(btnAdministradores);
		
		JButton btnPet = new JButton("Pet");
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PetAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnPet.setBounds(0, 82, 200, 41);
		panelMenu.add(btnPet);
		
		JButton btnTipo = new JButton("Tipo Especialidade");
		btnTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new TipoEspecialidadeAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnTipo.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnTipo.setBounds(0, 245, 200, 41);
		panelMenu.add(btnTipo);
		
		JButton btnTipoAnimal = new JButton("Tipo Animal");
		btnTipoAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new TipoAnimalAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnTipoAnimal.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnTipoAnimal.setBounds(0, 123, 200, 41);
		panelMenu.add(btnTipoAnimal);
		
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
		
		Button btnVisualizar = new Button("Visualizar");
		btnVisualizar.setForeground(Color.WHITE);
		btnVisualizar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVisualizar.setBackground(new Color(0, 153, 204));
		btnVisualizar.setBounds(634, 132, 75, 26);
		add(btnVisualizar);
		
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

	}

}
