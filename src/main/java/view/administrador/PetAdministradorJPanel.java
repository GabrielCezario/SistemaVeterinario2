package view.administrador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.impl.ControlladorDonoPet;
import controller.impl.ControlladorPet;
import model.DonoPet;
import model.Pet;
import view.Main;
import view.PainelUsuarioJPanel;

public class PetAdministradorJPanel extends JPanel {
	private JTextField txtDonoPet;
	private JTextField txtPet;
	
	protected DonoPet donoPetTela;

	/**
	 * Create the panel.
	 */
	public PetAdministradorJPanel() {
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
		
		JButton btnTIpo = new JButton("Tipo Especialidade");
		btnTIpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new TipoEspecialidadeAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnTIpo.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnTIpo.setBounds(0, 244, 200, 41);
		panelMenu.add(btnTIpo);
		
		JButton btnTipoAnimal = new JButton("Tipo Animal");
		btnTipoAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new TipoAnimalAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnTipoAnimal.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnTipoAnimal.setBounds(0, 121, 200, 41);
		panelMenu.add(btnTipoAnimal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 243, 200, 346);
		add(scrollPane);
		
		JList listDonoPet = new JList();
		scrollPane.setViewportView(listDonoPet);
		
		ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
		List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPets();
		listDonoPet.setListData(listaDonoPet.toArray());
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(420, 243, 200, 346);
		add(scrollPane_1);
		
		JList listPet = new JList();
		scrollPane_1.setViewportView(listPet);
		
		ControlladorPet controlladorPet = new ControlladorPet();
		List<Pet> listaPet = controlladorPet.listarPets();
		listPet.setListData(listaPet.toArray());
		
		txtDonoPet = new JTextField();
		txtDonoPet.setColumns(10);
		txtDonoPet.setBounds(210, 175, 200, 23);
		add(txtDonoPet);
		
		txtPet = new JTextField();
		txtPet.setColumns(10);
		txtPet.setBounds(420, 175, 200, 23);
		add(txtPet);
		
		JLabel lblDonoPet = new JLabel("Cliente");
		lblDonoPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDonoPet.setBounds(210, 150, 59, 14);
		add(lblDonoPet);
		
		JLabel lblPet = new JLabel("Pet");
		lblPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblPet.setBounds(420, 151, 59, 14);
		add(lblPet);
		
		JButton btnCadastrarPet = new JButton("Cadastrar Pet");
		btnCadastrarPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastrarPetAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnCadastrarPet.setBounds(630, 178, 160, 40);
		add(btnCadastrarPet);
		
		JButton btnVisualizarPet = new JButton("Visualizar Pet");
		btnVisualizarPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVisualizarPet.setBounds(630, 229, 160, 40);
		add(btnVisualizarPet);
		
		JButton btnBuscarDonoPet = new JButton("Buscar");
		btnBuscarDonoPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtDonoPet.getText();
				
				ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
				List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPetsPorNome(nome);
				listDonoPet.setListData(listaDonoPet.toArray());
				
			}
		});
		btnBuscarDonoPet.setBounds(210, 209, 200, 23);
		add(btnBuscarDonoPet);
		
		JButton btnBuscarPet = new JButton("Buscar");
		btnBuscarPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonoPet donoPet = (DonoPet) listDonoPet.getSelectedValue();
				listPet.setListData(donoPet.getListPet().toArray());
				
			}
		});
		btnBuscarPet.setBounds(420, 209, 200, 23);
		add(btnBuscarPet);

	}

}
