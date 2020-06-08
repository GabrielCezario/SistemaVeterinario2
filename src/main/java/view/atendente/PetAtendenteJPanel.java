package view.atendente;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.impl.ControlladorDonoPet;
import controller.impl.ControlladorPet;
import model.Atendente;
import model.DonoPet;
import model.Pet;
import view.Main;

import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PetAtendenteJPanel extends JPanel {
	private JTextField txtDonoPet;
	private JTextField txtPet;
	
	protected Atendente atendenteTela;
	protected DonoPet donoPetTela;
	protected Pet petTela;

	/**
	 * Create the panel.
	 */
	public PetAtendenteJPanel() {
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
		
		JButton btnDadosAtendente = new JButton("Dados Atendente");
		btnDadosAtendente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDadosAtendente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDadosAtendente.setBounds(0, 163, 200, 41);
		panelMenu.add(btnDadosAtendente);
		
		JButton btnPet = new JButton("Pet");
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PetAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnPet.setBounds(0, 82, 200, 41);
		panelMenu.add(btnPet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 216, 200, 346);
		add(scrollPane);
		
		JList listDonoPet = new JList();
		scrollPane.setViewportView(listDonoPet);
		
		ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
		List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPets();
		listDonoPet.setListData(listaDonoPet.toArray());
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(420, 216, 200, 346);
		add(scrollPane_1);
		
		JList listPet = new JList();
		scrollPane_1.setViewportView(listPet);
		
		ControlladorPet controlladorPet = new ControlladorPet();
		List<Pet> listaPet = controlladorPet.listarPets();
		listPet.setListData(listaPet.toArray());
		
		txtDonoPet = new JTextField();
		txtDonoPet.setBounds(210, 148, 200, 23);
		add(txtDonoPet);
		txtDonoPet.setColumns(10);
		
		txtPet = new JTextField();
		txtPet.setBounds(420, 148, 200, 23);
		add(txtPet);
		txtPet.setColumns(10);
		
		JLabel lblDonoPet = new JLabel("Cliente");
		lblDonoPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDonoPet.setBounds(210, 123, 59, 14);
		add(lblDonoPet);
		
		JLabel lblPet = new JLabel("Pet");
		lblPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblPet.setBounds(420, 124, 59, 14);
		add(lblPet);
		
		JButton btnCadastrarPet = new JButton("Cadastrar Pet");
		btnCadastrarPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastrarPetAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnCadastrarPet.setBounds(630, 151, 160, 40);
		add(btnCadastrarPet);
		
		JButton btnVisualizarPet = new JButton("Visualizar Pet");
		btnVisualizarPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVisualizarPet.setBounds(630, 202, 160, 40);
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
		btnBuscarDonoPet.setBounds(210, 182, 200, 23);
		add(btnBuscarDonoPet);
		
		JButton btnBuscarPet = new JButton("Buscar");
		btnBuscarPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonoPet donoPet = (DonoPet) listDonoPet.getSelectedValue();
				listPet.setListData(donoPet.getListPet().toArray());
				
			}
		});
		btnBuscarPet.setBounds(420, 182, 200, 23);
		add(btnBuscarPet);

	}

}
