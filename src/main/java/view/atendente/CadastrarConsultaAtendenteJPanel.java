package view.atendente;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.impl.ControlladorConsulta;
import controller.impl.ControlladorPet;
import controller.impl.ControlladorVeterinario;
import model.Atendente;
import model.Consulta;
import model.Pet;
import model.Veterinario;
import view.Main;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class CadastrarConsultaAtendenteJPanel extends JPanel {
	private JTextField txtNomePet;
	private JTextField txtVeterinario;
	private JTextField txtData;
	
	protected Atendente atendenteTela;
	protected Consulta contultaTela;

	/**
	 * Create the panel.
	 */
	public CadastrarConsultaAtendenteJPanel() {
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
		btnConsultas.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnConsultas.setBounds(0, 0, 200, 41);
		panelMenu.add(btnConsultas);
		
		JButton btnPet = new JButton("Pet");
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PetAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnPet.setBounds(0, 81, 200, 41);
		panelMenu.add(btnPet);
		
		JButton btnRelatorios = new JButton("Relat\u00F3rios");
		btnRelatorios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnRelatorios.setBounds(0, 122, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDados = new JButton("Dados Atendente");
		btnDados.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDados.setBounds(0, 163, 200, 41);
		panelMenu.add(btnDados);
		
		JButton btnClientes_1 = new JButton("Clientes");
		btnClientes_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnClientes_1.setBounds(0, 41, 200, 41);
		panelMenu.add(btnClientes_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 144, 280, 127);
		add(scrollPane);
		
		JList listPet = new JList();
		scrollPane.setViewportView(listPet);
		
		txtNomePet = new JTextField();
		txtNomePet.setBounds(210, 112, 194, 23);
		add(txtNomePet);
		txtNomePet.setColumns(10);
		
		JLabel lblNomePet = new JLabel("Pet");
		lblNomePet.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNomePet.setBounds(210, 85, 46, 14);
		add(lblNomePet);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(210, 341, 280, 127);
		add(scrollPane_1);
		
		JList listVeterinario = new JList();
		scrollPane_1.setViewportView(listVeterinario);
		
		txtVeterinario = new JTextField();
		txtVeterinario.setColumns(10);
		txtVeterinario.setBounds(210, 309, 194, 23);
		add(txtVeterinario);
		
		JLabel lblVeterinario = new JLabel("Veterinario");
		lblVeterinario.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblVeterinario.setBounds(210, 282, 97, 14);
		add(lblVeterinario);
		
		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblData.setBounds(500, 85, 46, 14);
		add(lblData);
		
		txtData = new JTextField();
		txtData.setBounds(500, 113, 290, 20);
		add(txtData);
		txtData.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(500, 171, 290, 297);
		add(scrollPane_2);
		
		JTextArea txtDescricao = new JTextArea();
		scrollPane_2.setViewportView(txtDescricao);
		
		JLabel lblDescricao = new JLabel("Descricao");
		lblDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDescricao.setBounds(500, 144, 97, 14);
		add(lblDescricao);
		
		JLabel lblCadastroConsulta = new JLabel("Cadastro de Consultas");
		lblCadastroConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroConsulta.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblCadastroConsulta.setBounds(345, 51, 313, 23);
		add(lblCadastroConsulta);
		
		JButton btnCadastrarConsulta = new JButton("Cadastrar");
		btnCadastrarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pet pet = (Pet) listPet.getSelectedValue();
				Veterinario veterinario = (Veterinario) listVeterinario.getSelectedValue();
				String descricaoConsulta = txtDescricao.getText();
				
				Consulta consulta = new Consulta();
				consulta.setPet(pet);
				consulta.setVeterinario(veterinario);
				consulta.setDescricaoConsulta(descricaoConsulta);
				
				try {
					ControlladorConsulta controlladorConsulta = new ControlladorConsulta();
					controlladorConsulta.cadastrarConsulta(consulta);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnCadastrarConsulta.setBounds(681, 557, 109, 32);
		add(btnCadastrarConsulta);
		
		JButton btnBuscarPet = new JButton("Buscar");
		btnBuscarPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomePet = txtNomePet.getText();
				
				ControlladorPet controlladorPet = new ControlladorPet();
				List<Pet> listaPet = controlladorPet.listarPetsPorNome(nomePet);
				listPet.setListData(listaPet.toArray());
				
			}
		});
		btnBuscarPet.setBounds(414, 112, 76, 23);
		add(btnBuscarPet);
		
		JButton btnBuscarVeterinario = new JButton("Buscar");
		btnBuscarVeterinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomeVeterinario = txtVeterinario.getText();
				
				ControlladorVeterinario controlladorVeterinario = new ControlladorVeterinario();
				List<Veterinario> listaVeterinario = controlladorVeterinario.listarVeterinariosPorNome(nomeVeterinario);
				listVeterinario.setListData(listaVeterinario.toArray());
				
			}
		});
		btnBuscarVeterinario.setBounds(414, 309, 76, 23);
		add(btnBuscarVeterinario);

	}
}
