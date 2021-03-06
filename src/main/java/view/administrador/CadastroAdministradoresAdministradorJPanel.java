package view.administrador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.impl.ControlladorAdministrador;
import controller.impl.ControlladorEndereco;
import controller.impl.ControlladorLogin;
import exception.CamposCadastroEnderecoVazios;
import exception.CamposCadastroVazios;
import exception.EnderecoNulo;
import exception.LoginInvalidoException;
import exception.LoginJaCadastrado;
import exception.ObjetoNulo;
import model.Administrador;
import model.Endereco;
import model.Login;
import view.Main;
import view.PainelUsuarioJPanel;

public class CadastroAdministradoresAdministradorJPanel extends JPanel {
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtCpf;
	private JTextField txtDataNascimento;
	private JTextField txtTelefone;
	private JTextField txtEstado;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtLogin;
	private JTextField txtComplemento;
	private JPasswordField txtSenha;
	
	protected static Administrador administradorTela;

	/**
	 * Create the panel.
	 */
	public CadastroAdministradoresAdministradorJPanel() {
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
		btnRelatorios.setBounds(0, 325, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDadosAdministrador = new JButton("Dados Administrador");
		btnDadosAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDadosAdministrador.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDadosAdministrador.setBounds(0, 366, 200, 41);
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
		btnAdministradores.setBounds(0, 284, 200, 41);
		panelMenu.add(btnAdministradores);
		
		JButton btnPet = new JButton("Pet");
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new PetAdministradorJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnPet.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnPet.setBounds(0, 80, 200, 41);
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
		
		JLabel lblCadastroAdm = new JLabel("Cadastrar administrador");
		lblCadastroAdm.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroAdm.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCadastroAdm.setBounds(362, 51, 294, 20);
		add(lblCadastroAdm);
		
		JLabel lblNome = new JLabel("Nome*");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(210, 133, 46, 14);
		add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome*");
		lblSobrenome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSobrenome.setBounds(408, 133, 86, 14);
		add(lblSobrenome);
		
		JLabel lblCpf = new JLabel("CPF*");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCpf.setBounds(606, 134, 46, 14);
		add(lblCpf);
		
		txtNome = new JTextField();
		txtNome.setBounds(210, 157, 188, 20);
		add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Endereco endereco = new Endereco();
				endereco.setBairro(txtBairro.getText());
				endereco.setCidade(txtCidade.getText());
				endereco.setComplemento(txtComplemento.getText());
				endereco.setEstado(txtEstado.getText());
				endereco.setNumero(txtNumero.getText());
				endereco.setRua(txtRua.getText());
				
				Administrador administrador = new Administrador();
				administrador.setCpf(txtCpf.getText());
				administrador.setNome(txtNome.getText());
				administrador.setSobrenome(txtSobrenome.getText());
				administrador.setTelefone(txtTelefone.getText());
				
				Login login = new Login();
				login.setLogin(txtLogin.getText());
				login.setSenha(txtSenha.getText());
				
				administrador.setEndereco(endereco);
				administrador.setLogin(login);
				login.setPessoa(administrador);
				
				ControlladorEndereco controlladorEndereco = new ControlladorEndereco();
				ControlladorAdministrador controlladorAdministrador = new ControlladorAdministrador();
				ControlladorLogin controlladorLogin = new ControlladorLogin();
				
				try {
					controlladorEndereco.cadastrarEndereco(endereco);
					controlladorAdministrador.cadastrarAdministrador(administrador);
					controlladorLogin.cadastrarLogin(login);
				} catch (EnderecoNulo | CamposCadastroEnderecoVazios | CamposCadastroVazios | ObjetoNulo| LoginInvalidoException | LoginJaCadastrado e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(681, 557, 109, 32);
		add(btnNewButton);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(408, 157, 188, 20);
		add(txtSobrenome);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(606, 157, 188, 20);
		add(txtCpf);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento*");
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDataNascimento.setBounds(210, 188, 146, 14);
		add(lblDataNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(210, 212, 188, 20);
		add(txtDataNascimento);
		
		JLabel lblTelefone = new JLabel("Telefone*");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(408, 188, 86, 14);
		add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(408, 212, 188, 20);
		add(txtTelefone);
		
		JLabel lblEstado = new JLabel("Estado*");
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEstado.setBounds(210, 280, 58, 14);
		add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(210, 304, 188, 20);
		add(txtEstado);
		
		JLabel lblRua = new JLabel("Rua*");
		lblRua.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRua.setBounds(210, 335, 58, 14);
		add(lblRua);
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		txtRua.setBounds(210, 359, 188, 20);
		add(txtRua);
		
		JLabel lblNumero = new JLabel("Numero*");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumero.setBounds(408, 335, 86, 14);
		add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(408, 359, 188, 20);
		add(txtNumero);
		
		JLabel lblCidade = new JLabel("Cidade*");
		lblCidade.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCidade.setBounds(408, 280, 86, 14);
		add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(408, 304, 188, 20);
		add(txtCidade);
		
		JLabel lblBairro = new JLabel("Bairro*");
		lblBairro.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBairro.setBounds(606, 281, 46, 14);
		add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(606, 304, 188, 20);
		add(txtBairro);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(266, 441, 188, 20);
		add(txtLogin);
		
		JLabel lblLogin = new JLabel("Login*");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLogin.setBounds(210, 443, 46, 14);
		add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha*");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(464, 443, 46, 14);
		add(lblSenha);
		
		JLabel lblComplemento = new JLabel("Complemento*");
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblComplemento.setBounds(606, 336, 103, 14);
		add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(606, 359, 188, 20);
		add(txtComplemento);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(520, 441, 188, 20);
		add(txtSenha);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBairro.setText("");
				txtCidade.setText("");
				txtComplemento.setText("");
				txtCpf.setText("");
				txtDataNascimento.setText("");
				txtEstado.setText("");
				txtLogin.setText("");
				txtNome.setText("");
				txtNumero.setText("");
				txtRua.setText("");
				txtSenha.setText("");
				txtSobrenome.setText("");
				txtTelefone.setText("");
				
			}
		});
		btnLimpar.setBounds(562, 557, 109, 32);
		add(btnLimpar);

	}
}
