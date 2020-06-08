package view.atendente;

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
import model.Atendente;
import model.DonoPet;
import model.Pet;
import model.TipoAnimal;
import view.Main;

public class CadastrarPetAtendenteJPanel extends JPanel {
	private JTextField txtDonoPet;
	private JTextField txtNomePet;
	private JTextField txtDataNascimento;
	private JTextField txtPesoPet;
	
	protected Atendente atendenteTela;
	protected DonoPet donoPetTela;
	protected Pet petTela;

	/**
	 * Create the panel.
	 */
	public CadastrarPetAtendenteJPanel() {
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
		
		JLabel lblDonoPet = new JLabel("Cliente");
		lblDonoPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDonoPet.setBounds(210, 125, 71, 14);
		add(lblDonoPet);
		
		txtDonoPet = new JTextField();
		txtDonoPet.setBounds(210, 150, 248, 20);
		add(txtDonoPet);
		txtDonoPet.setColumns(10);
		
		txtNomePet = new JTextField();
		txtNomePet.setColumns(10);
		txtNomePet.setBounds(549, 174, 167, 20);
		add(txtNomePet);
		
		JLabel lblNomePet = new JLabel("Nome Pet");
		lblNomePet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNomePet.setBounds(549, 150, 107, 14);
		add(lblNomePet);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento");
		lblDataNascimento.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDataNascimento.setBounds(549, 205, 167, 14);
		add(lblDataNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(549, 229, 167, 20);
		add(txtDataNascimento);
		
		JLabel lblPesoPet = new JLabel("Peso");
		lblPesoPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblPesoPet.setBounds(549, 260, 71, 14);
		add(lblPesoPet);
		
		txtPesoPet = new JTextField();
		txtPesoPet.setColumns(10);
		txtPesoPet.setBounds(549, 284, 167, 20);
		add(txtPesoPet);
		
		ControlladorTipoAnimal controlladorTipoAnimal = new ControlladorTipoAnimal();
		List<TipoAnimal> listTipoAnimal = controlladorTipoAnimal.listarTipoAnimais();
		
		JComboBox cboTipo = new JComboBox(listTipoAnimal.toArray());
		cboTipo.setBounds(549, 340, 167, 20);
		add(cboTipo);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblTipo.setBounds(549, 315, 71, 14);
		add(lblTipo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 181, 248, 408);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonoPet donoPet = (DonoPet) list.getSelectedValue();
				List<Pet> listPetDeDonoPet = donoPet.getListPet();
				
				String nomePet = txtNomePet.getText();
				double pesoPet = Double.parseDouble(txtPesoPet.getText());
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
		btnCadastrar.setBounds(549, 417, 167, 30);
		add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar campos");
		btnLimpar.setBounds(549, 458, 167, 30);
		add(btnLimpar);
		
		JButton btnBuscar = new JButton("Pesquisar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtDonoPet.getText();
				
				ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
				List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPetsPorNome(nome);
				list.setListData(listaDonoPet.toArray());
				
			}
		});
		btnBuscar.setBounds(369, 122, 89, 23);
		add(btnBuscar);

	}
}
