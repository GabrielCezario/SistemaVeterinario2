package view.atendente;

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
import model.Atendente;
import model.DonoPet;
import view.Main;
import view.PainelUsuarioJPanel;

public class ClientesAtendenteJPanel extends JPanel {
	private JTextField txtNomeCliente;
	
	protected Atendente atendenteTela;
	protected DonoPet donoPetTela;

	/**
	 * Create the panel.
	 */
	public ClientesAtendenteJPanel() {
		setLayout(null);
		
		JPanel panelPerfil = new JPanel();
		panelPerfil.setLayout(null);
		panelPerfil.setBackground(new Color(30, 144, 255));
		panelPerfil.setBounds(0, 0, 800, 40);
		add(panelPerfil);
		
		JLabel lblNomeAtendente = new JLabel("Ol\u00E1, Atendente");
		lblNomeAtendente.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNomeAtendente.setBounds(10, 11, 488, 20);
		panelPerfil.add(lblNomeAtendente);
		
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
		btnConsultas.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new ConsultasAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnConsultas.setBounds(0, 0, 200, 41);
		panelMenu.add(btnConsultas);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new ClientesAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnClientes.setBounds(0, 41, 200, 41);
		panelMenu.add(btnClientes);
		
		JButton btnRelatorios = new JButton("Relat\u00F3rios");
		btnRelatorios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new RelatorioAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnRelatorios.setBounds(0, 121, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDados = new JButton("Dados Atendente");
		btnDados.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new DadosAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnDados.setBounds(0, 162, 200, 41);
		panelMenu.add(btnDados);
		
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
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblClientes.setBounds(210, 51, 68, 20);
		add(lblClientes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 133, 367, 456);
		add(scrollPane);
		
		JList listDonoPet = new JList();
		scrollPane.setViewportView(listDonoPet);
		
		ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
		List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPets();
		listDonoPet.setListData(listaDonoPet.toArray());
		
		JButton btnCadastrarCliente = new JButton("Cadastrar");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastroClientesAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnCadastrarCliente.setForeground(Color.WHITE);
		btnCadastrarCliente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCadastrarCliente.setBackground(new Color(0, 153, 204));
		btnCadastrarCliente.setBounds(587, 133, 203, 40);
		add(btnCadastrarCliente);
		
		JLabel lblNomeCliente = new JLabel("Nome:");
		lblNomeCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeCliente.setBounds(210, 108, 46, 14);
		add(lblNomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(266, 105, 212, 20);
		add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		JButton btnBuscarCliente = new JButton("Buscar");
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNomeCliente.getText();
				
				ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
				List<DonoPet> listaDonoPet = controlladorDonoPet.listarDonoPetsPorNome(nome);
				listDonoPet.setListData(listaDonoPet.toArray());
				
			}
		});
		btnBuscarCliente.setBounds(488, 104, 89, 23);
		add(btnBuscarCliente);
		
		JButton btnAlterarCliente = new JButton("Alterar");
		btnAlterarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new CadastroClientesAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnAlterarCliente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAlterarCliente.setForeground(Color.WHITE);
		btnAlterarCliente.setBackground(new Color(0, 153, 204));
		btnAlterarCliente.setBounds(587, 184, 203, 40);
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
		btnDeletarCliente.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDeletarCliente.setForeground(Color.WHITE);
		btnDeletarCliente.setBackground(new Color(0, 153, 204));
		btnDeletarCliente.setBounds(587, 235, 203, 40);
		add(btnDeletarCliente);

	}
}
