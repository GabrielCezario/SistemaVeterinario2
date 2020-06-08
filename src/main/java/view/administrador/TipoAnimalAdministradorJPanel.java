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

import controller.impl.ControlladorTipoAnimal;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.TipoAnimal;
import model.TipoEspecialidade;
import view.Main;

public class TipoAnimalAdministradorJPanel extends JPanel {
	private JTextField txtTipoAnimal;
	private JTextField txtTipo;

	/**
	 * Create the panel.
	 */
	public TipoAnimalAdministradorJPanel() {
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
				
				Main.getFrame().setContentPane(new TipoAnimalAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnTipo.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnTipo.setBounds(0, 246, 200, 41);
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
		
		JLabel lblTipoAnimal = new JLabel("Tipo animal");
		lblTipoAnimal.setBounds(210, 102, 62, 14);
		add(lblTipoAnimal);
		
		txtTipoAnimal = new JTextField();
		txtTipoAnimal.setColumns(10);
		txtTipoAnimal.setBounds(210, 127, 247, 26);
		add(txtTipoAnimal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 166, 247, 380);
		add(scrollPane);
		
		JList jListTipoAnimal = new JList();
		scrollPane.setViewportView(jListTipoAnimal);
		
		ControlladorTipoAnimal controlladorTipoAnimal = new ControlladorTipoAnimal();
		List<TipoAnimal> listTipoAnimal = controlladorTipoAnimal.listarTipoAnimais();
		jListTipoAnimal.setListData(listTipoAnimal.toArray());
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtTipoAnimal.getText();
				
				ControlladorTipoAnimal controlladorTipoAnimal = new ControlladorTipoAnimal();
				List<TipoAnimal> listTipoAnimal = controlladorTipoAnimal.listarTipoAnimaisPorNome(nome);
				jListTipoAnimal.setListData(listTipoAnimal.toArray());
				
			}
		});
		btnBuscar.setBounds(525, 124, 209, 32);
		add(btnBuscar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TipoAnimal tipoAnimal = (TipoAnimal) jListTipoAnimal.getSelectedValue();
				
				ControlladorTipoAnimal controlladorTipoAnimal = new ControlladorTipoAnimal();
				try {
					controlladorTipoAnimal.deletarTipoAnimal(tipoAnimal);
				} catch (ObjetoNulo e1) {
					e1.printStackTrace();
				}
				
				List<TipoAnimal> listTipoAnimal = controlladorTipoAnimal.listarTipoAnimais();
				jListTipoAnimal.setListData(listTipoAnimal.toArray());
				
			}
		});
		btnDeletar.setBounds(525, 166, 209, 32);
		add(btnDeletar);
		
		JLabel lblNovoTipo = new JLabel("Novo tipo");
		lblNovoTipo.setBounds(525, 245, 131, 14);
		add(lblNovoTipo);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(525, 270, 209, 20);
		add(txtTipo);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String descricao = txtTipo.getText();
				
				ControlladorTipoAnimal controlladorTipoAnimal = new ControlladorTipoAnimal();
				try {
					controlladorTipoAnimal.cadastrarTipoAnimal(new TipoAnimal(descricao));
				} catch (ObjetoNulo | CamposCadastroVazios e1) {
					e1.printStackTrace();
				}
				
				List<TipoAnimal> listTipoAnimal = controlladorTipoAnimal.listarTipoAnimais();
				jListTipoAnimal.setListData(listTipoAnimal.toArray());
				
			}
		});
		btnCadastrar.setBounds(525, 301, 209, 32);
		add(btnCadastrar);

	}

}
