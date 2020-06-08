package view.administrador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.impl.ControlladorDonoPet;
import controller.impl.ControlladorPet;
import controller.impl.ControlladorTipoAnimal;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.DonoPet;
import model.Pet;
import model.TipoAnimal;
import view.Main;
import view.PainelUsuarioJPanel;

public class CadastrarPetAdministradorJPanel extends JPanel {
	private JTextField txtCliente;
	private JTextField txtNomePet;
	private JTextField txtDataNascimento;
	private JTextField txtPeso;

	/**
	 * Create the panel.
	 */
	public CadastrarPetAdministradorJPanel() {
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
		btnRelatorios.setBounds(0, 327, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDadosAdministrador = new JButton("Dados Administrador");
		btnDadosAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDadosAdministrador.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDadosAdministrador.setBounds(0, 368, 200, 41);
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
		btnAdministradores.setBounds(0, 286, 200, 41);
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
		btnTipoAnimal.setBounds(0, 121, 200, 41);
		panelMenu.add(btnTipoAnimal);
		
		JLabel lblDonoPet = new JLabel("Cliente");
		lblDonoPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDonoPet.setBounds(210, 98, 71, 14);
		add(lblDonoPet);
		
		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		txtCliente.setBounds(210, 123, 248, 20);
		add(txtCliente);
		
		txtNomePet = new JTextField();
		txtNomePet.setColumns(10);
		txtNomePet.setBounds(549, 147, 167, 20);
		add(txtNomePet);
		
		JLabel lblNomePet = new JLabel("Nome Pet");
		lblNomePet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNomePet.setBounds(549, 123, 107, 14);
		add(lblNomePet);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento");
		lblDataNascimento.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDataNascimento.setBounds(549, 178, 167, 14);
		add(lblDataNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(549, 202, 167, 20);
		add(txtDataNascimento);
		
		JLabel lblPesoPet = new JLabel("Peso");
		lblPesoPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblPesoPet.setBounds(549, 233, 71, 14);
		add(lblPesoPet);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(549, 257, 167, 20);
		add(txtPeso);
		
		ControlladorTipoAnimal controlladorTipoAnimal = new ControlladorTipoAnimal();
		List<TipoAnimal> listTipoAnimal = controlladorTipoAnimal.listarTipoAnimais();
		
		JComboBox cboTipo = new JComboBox(listTipoAnimal.toArray());
		cboTipo.setBounds(549, 313, 167, 20);
		add(cboTipo);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblTipo.setBounds(549, 288, 71, 14);
		add(lblTipo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 154, 248, 408);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
		List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPets();
		list.setListData(listaDonoPet.toArray());
		
		JButton btnLimpar = new JButton("Limpar campos");
		btnLimpar.setBounds(549, 431, 167, 30);
		add(btnLimpar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtCliente.getText();
				
				ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
				List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPetsPorNome(nome);
				list.setListData(listaDonoPet.toArray());
				
			}
		});
		btnBuscar.setBounds(369, 95, 89, 23);
		add(btnBuscar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonoPet donoPet = (DonoPet) list.getSelectedValue();
				List<Pet> listPetDeDonoPet = donoPet.getListPet();
				
				String nomePet = txtNomePet.getText();
				double pesoPet = Double.parseDouble(txtPeso.getText());
				TipoAnimal tipoAnimal = (TipoAnimal) cboTipo.getSelectedItem();
				
				Pet pet = new Pet();
				pet.setDonoPet(donoPet);
				pet.setNome(nomePet);
				pet.setPeso(pesoPet);
				pet.setTipoAnimal(tipoAnimal);
				
				try {
					
					ControlladorPet controlladorPet = new ControlladorPet();
					Pet petCadastrado = controlladorPet.cadastrarPet(pet);
					
					listPetDeDonoPet.add(petCadastrado);
					donoPet.setListPet(listPetDeDonoPet);
					
					ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
					controlladorDonoPet.atualizarDonoPet(donoPet);
					
				} catch (ObjetoNulo | CamposCadastroVazios e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnCadastrar.setBounds(549, 390, 167, 30);
		add(btnCadastrar);

	}
}
