package view.administrador;

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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.transaction.Transactional.TxType;

import controller.impl.ControlladorConsulta;
import model.Consulta;
import view.Main;
import view.PainelUsuarioJPanel;

public class ConsultasAdministradorJPanel extends JPanel {
	private JTextField txtPet;
	private JTextField txtVet;
	private JTable tblConsultas;

	/**
	 * Create the panel.
	 */
	public ConsultasAdministradorJPanel() {
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
		btnRelatorios.setBounds(0, 326, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDadosAdministrador = new JButton("Dados Administrador");
		btnDadosAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDadosAdministrador.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDadosAdministrador.setBounds(0, 367, 200, 41);
		panelMenu.add(btnDadosAdministrador);
		
		JButton btnAtendentes = new JButton("Atendentes");
		btnAtendentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new AtendenteAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnAtendentes.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAtendentes.setBounds(0, 163, 200, 41);
		panelMenu.add(btnAtendentes);
		
		JButton btnVeterinarios = new JButton("Veterinarios");
		btnVeterinarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new VeterinarioAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnVeterinarios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVeterinarios.setBounds(0, 204, 200, 41);
		panelMenu.add(btnVeterinarios);
		
		JButton btnAdministradores = new JButton("Administradores");
		btnAdministradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new AdministradorAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnAdministradores.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAdministradores.setBounds(0, 285, 200, 41);
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
		btnTipo.setBounds(0, 244, 200, 41);
		panelMenu.add(btnTipo);
		
		JButton btnTipoAnimal = new JButton("Tipo Animal");
		btnTipoAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new TipoAnimalAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnTipoAnimal.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnTipoAnimal.setBounds(0, 122, 200, 41);
		panelMenu.add(btnTipoAnimal);
		
		JLabel lblNomePet = new JLabel("Pet:");
		lblNomePet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomePet.setBounds(251, 102, 32, 14);
		add(lblNomePet);
		
		txtPet = new JTextField();
		txtPet.setColumns(10);
		txtPet.setBounds(293, 97, 254, 25);
		add(txtPet);
		
		txtVet = new JTextField();
		txtVet.setColumns(10);
		txtVet.setBounds(293, 133, 254, 25);
		add(txtVet);
		
		JLabel lblVeterinario = new JLabel("Veterinario:");
		lblVeterinario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVeterinario.setBounds(210, 138, 75, 14);
		add(lblVeterinario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 170, 580, 419);
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
		
		Button btnBuscar = new Button("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomePet = txtPet.getText();
				
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
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnBuscar.setBackground(new Color(0, 153, 204));
		btnBuscar.setBounds(553, 97, 94, 61);
		add(btnBuscar);
		
		Button btnCadastrar = new Button("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastrarConsultasAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCadastrar.setBackground(new Color(0, 153, 204));
		btnCadastrar.setBounds(696, 97, 94, 61);
		add(btnCadastrar);

	}

}
