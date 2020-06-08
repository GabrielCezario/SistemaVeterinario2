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
import javax.swing.SwingConstants;

import controller.impl.ControlladorDonoPet;
import exception.ObjetoNulo;
import model.DonoPet;
import view.Main;
import view.PainelUsuarioJPanel;

public class ClientesAdministradorJPanel extends JPanel {
	private JTextField txtNome;

	/**
	 * Create the panel.
	 */
	public ClientesAdministradorJPanel() {
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
		btnTipoAnimal.setBounds(0, 122, 200, 41);
		panelMenu.add(btnTipoAnimal);
		
		JLabel lblNomeCliente = new JLabel("Nome:");
		lblNomeCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeCliente.setBounds(210, 90, 46, 14);
		add(lblNomeCliente);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(266, 87, 212, 20);
		add(txtNome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 115, 366, 474);
		add(scrollPane);
		
		JList listDonoPet = new JList();
		scrollPane.setViewportView(listDonoPet);
		
		ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
		List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPets();
		listDonoPet.setListData(listaDonoPet.toArray());
		
		JButton btnBuscarCliente = new JButton("Buscar");
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				
				ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
				List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPetsPorNome(nome);
				listDonoPet.setListData(listaDonoPet.toArray());
				
			}
		});
		btnBuscarCliente.setBounds(488, 86, 89, 23);
		add(btnBuscarCliente);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastroClientesAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnCadastrarCliente.setForeground(Color.WHITE);
		btnCadastrarCliente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCadastrarCliente.setBackground(new Color(0, 153, 204));
		btnCadastrarCliente.setBounds(587, 115, 203, 40);
		add(btnCadastrarCliente);
		
		JButton btnAlterarCliente = new JButton("Alterar");
		btnAlterarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastroClientesAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnAlterarCliente.setForeground(Color.WHITE);
		btnAlterarCliente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAlterarCliente.setBackground(new Color(0, 153, 204));
		btnAlterarCliente.setBounds(587, 166, 203, 40);
		add(btnAlterarCliente);
		
		JButton btnDeletarCliente = new JButton("Deletar");
		btnDeletarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonoPet donoPet = (DonoPet) listDonoPet.getSelectedValue();
				
				try {
					ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
					controlladorDonoPet.deletarDonoPet(donoPet);
					
					List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPets();
					listDonoPet.setListData(listaDonoPet.toArray());
				} catch (ObjetoNulo e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnDeletarCliente.setForeground(Color.WHITE);
		btnDeletarCliente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDeletarCliente.setBackground(new Color(0, 153, 204));
		btnDeletarCliente.setBounds(587, 217, 203, 40);
		add(btnDeletarCliente);

	}

}
