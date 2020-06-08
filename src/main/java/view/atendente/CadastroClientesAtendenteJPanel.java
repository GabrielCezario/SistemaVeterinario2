package view.atendente;

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

import controller.impl.ControlladorDonoPet;
import controller.impl.ControlladorEndereco;
import controller.impl.ControlladorLogin;
import exception.CamposCadastroEnderecoVazios;
import exception.CamposCadastroVazios;
import exception.EnderecoNulo;
import exception.LoginInvalidoException;
import exception.LoginJaCadastrado;
import exception.ObjetoNulo;
import model.Atendente;
import model.DonoPet;
import model.Endereco;
import model.Login;
import view.Main;

public class CadastroClientesAtendenteJPanel extends JPanel {
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JTextField txtDataNascimento;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtComplemento;
	private JTextField txtNumero;
	private JTextField txtRua;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	
	protected Atendente atendenteTela;
	protected DonoPet donoPetTela;

	/**
	 * Create the panel.
	 */
	public CadastroClientesAtendenteJPanel() {
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
		
		JButton btnDados = new JButton("Dados Atendente");
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDados.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDados.setBounds(0, 163, 200, 41);
		panelMenu.add(btnDados);
		
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
		
		JLabel lblCadastrarCliente = new JLabel("Cadastrar cliente");
		lblCadastrarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarCliente.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCadastrarCliente.setBounds(362, 51, 294, 20);
		add(lblCadastrarCliente);
		
		JLabel lblNome = new JLabel("Nome*");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(210, 133, 46, 14);
		add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(210, 157, 188, 20);
		add(txtNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome*");
		lblSobrenome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSobrenome.setBounds(408, 133, 86, 14);
		add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(408, 157, 188, 20);
		add(txtSobrenome);
		
		JLabel lblCpf = new JLabel("CPF*");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCpf.setBounds(606, 134, 46, 14);
		add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(606, 157, 188, 20);
		add(txtCpf);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(408, 212, 188, 20);
		add(txtTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone*");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(408, 188, 86, 14);
		add(lblTelefone);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(210, 212, 188, 20);
		add(txtDataNascimento);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento*");
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDataNascimento.setBounds(210, 188, 146, 14);
		add(lblDataNascimento);
		
		JLabel lblEstado = new JLabel("Estado*");
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEstado.setBounds(210, 280, 58, 14);
		add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(210, 304, 188, 20);
		add(txtEstado);
		
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
		
		JLabel lblComplemento = new JLabel("Complemento*");
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblComplemento.setBounds(606, 336, 103, 14);
		add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(606, 359, 188, 20);
		add(txtComplemento);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(408, 359, 188, 20);
		add(txtNumero);
		
		JLabel lblNumero = new JLabel("Numero*");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumero.setBounds(408, 335, 86, 14);
		add(lblNumero);
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		txtRua.setBounds(210, 359, 188, 20);
		add(txtRua);
		
		JLabel lblRua = new JLabel("Rua*");
		lblRua.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRua.setBounds(210, 335, 58, 14);
		add(lblRua);
		
		JLabel lblLogin = new JLabel("Login*");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLogin.setBounds(210, 443, 58, 14);
		add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(278, 441, 188, 20);
		add(txtLogin);
		
		JLabel lblSenha = new JLabel("Senha*");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(476, 443, 46, 14);
		add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(532, 441, 188, 20);
		add(txtSenha);
		
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
				
				DonoPet donoPet = new DonoPet();
				donoPet.setCpf(txtCpf.getText());
				donoPet.setNome(txtNome.getText());
				donoPet.setSobrenome(txtSobrenome.getText());
				donoPet.setTelefone(txtTelefone.getText());
				
				Login login = new Login();
				login.setLogin(txtLogin.getText());
				login.setSenha(txtSenha.getText());
				
				donoPet.setEndereco(endereco);
				donoPet.setLogin(login);
				login.setPessoa(donoPet);
				
				ControlladorEndereco controlladorEndereco = new ControlladorEndereco();
				ControlladorDonoPet controlladorDonoPet = new ControlladorDonoPet();
				ControlladorLogin controlladorLogin = new ControlladorLogin();
				
				try {
					controlladorEndereco.cadastrarEndereco(endereco);
					controlladorDonoPet.cadastrarDonoPet(donoPet);
					controlladorLogin.cadastrarLogin(login);
					
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
				} catch (EnderecoNulo | CamposCadastroEnderecoVazios | CamposCadastroVazios | ObjetoNulo| LoginInvalidoException | LoginJaCadastrado e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(681, 557, 109, 32);
		add(btnNewButton);
		
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
