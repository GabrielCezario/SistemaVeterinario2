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

import controller.impl.ControlladorAdministrador;
import controller.impl.ControlladorAtendente;
import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.Administrador;
import model.Atendente;
import model.Endereco;
import model.Login;
import view.Main;
import view.PainelUsuarioJPanel;

public class DadosAtendenteJPanel extends JPanel {
	private JTextField txtNome;
	private JTextField txtDataNascimento;
	private JTextField txtSobrenome;
	private JTextField txtTelefone;
	private JTextField txtCpf;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	
	protected Atendente atendenteTela;

	/**
	 * Create the panel.
	 */
	public DadosAtendenteJPanel() {
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
		btnRelatorios.setBounds(0, 122, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDados = new JButton("Dados Atendente");
		btnDados.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new ConsultasAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
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
		btnPet.setBounds(0, 81, 200, 41);
		panelMenu.add(btnPet);
		
		JLabel lblDadosAtendente = new JLabel("Dados Atendente");
		lblDadosAtendente.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblDadosAtendente.setBounds(420, 51, 165, 22);
		add(lblDadosAtendente);
		
		JLabel lblNome = new JLabel("Nome*");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(210, 109, 46, 14);
		add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(210, 133, 188, 20);
		add(txtNome);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento*");
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDataNascimento.setBounds(210, 164, 146, 14);
		add(lblDataNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(210, 188, 188, 20);
		add(txtDataNascimento);
		
		JLabel lblSobrenome = new JLabel("Sobrenome*");
		lblSobrenome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSobrenome.setBounds(408, 109, 86, 14);
		add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(408, 133, 188, 20);
		add(txtSobrenome);
		
		JLabel lblTelefone = new JLabel("Telefone*");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(408, 164, 86, 14);
		add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(408, 188, 188, 20);
		add(txtTelefone);
		
		JLabel lblCpf = new JLabel("CPF*");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCpf.setBounds(606, 110, 46, 14);
		add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(606, 133, 188, 20);
		add(txtCpf);
		
		JLabel lblEstado = new JLabel("Estado*");
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEstado.setBounds(210, 256, 58, 14);
		add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(210, 280, 188, 20);
		add(txtEstado);
		
		JLabel lblCidade = new JLabel("Cidade*");
		lblCidade.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCidade.setBounds(408, 256, 86, 14);
		add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(408, 280, 188, 20);
		add(txtCidade);
		
		JLabel lblBairro = new JLabel("Bairro*");
		lblBairro.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBairro.setBounds(606, 257, 46, 14);
		add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(606, 280, 188, 20);
		add(txtBairro);
		
		JLabel lblRua = new JLabel("Rua*");
		lblRua.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRua.setBounds(210, 311, 58, 14);
		add(lblRua);
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		txtRua.setBounds(210, 335, 188, 20);
		add(txtRua);
		
		JLabel lblNumero = new JLabel("Numero*");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumero.setBounds(408, 311, 86, 14);
		add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(408, 335, 188, 20);
		add(txtNumero);
		
		JLabel lblComplemento = new JLabel("Complemento*");
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblComplemento.setBounds(606, 312, 103, 14);
		add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(606, 335, 188, 20);
		add(txtComplemento);
		
		JLabel lblLogin = new JLabel("Login*");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLogin.setBounds(210, 419, 58, 14);
		add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(278, 417, 188, 20);
		add(txtLogin);
		
		JLabel lblSenha = new JLabel("Senha*");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(476, 419, 46, 14);
		add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(532, 417, 188, 20);
		add(txtSenha);
		
		txtBairro.setText(atendenteTela.getEndereco().getBairro());
		txtCidade.setText(atendenteTela.getEndereco().getCidade());
		txtComplemento.setText(atendenteTela.getEndereco().getComplemento());
		txtCpf.setText(atendenteTela.getCpf());
		//txtDataNascimento.setCaret((Caret) administradorTela.getDataNascimento());
		txtEstado.setText(atendenteTela.getEndereco().getEstado());
		txtLogin.setText(atendenteTela.getLogin().getLogin());
		txtNome.setText(atendenteTela.getNome());
		txtNumero.setText(atendenteTela.getEndereco().getNumero());
		txtRua.setText(atendenteTela.getEndereco().getRua());
		txtSenha.setText(atendenteTela.getLogin().getSenha());
		txtSobrenome.setText(atendenteTela.getSobrenome());
		txtTelefone.setText(atendenteTela.getTelefone());
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				atendenteTela.setCpf(txtCpf.getText());
				//administradorTela.setDataNascimento(txtDataNascimento.getText());
				atendenteTela.setNome(txtNome.getText());
				atendenteTela.setSobrenome(txtSobrenome.getText());
				atendenteTela.setTelefone(txtTelefone.getText());
				
				atendenteTela.setEndereco(new Endereco(txtEstado.getText(), txtCidade.getText(), txtBairro.getText(),
						txtRua.getText(), txtNumero.getText(), txtComplemento.getText()));
				
				atendenteTela.setLogin(new Login(txtLogin.getText(), txtSenha.getText()));
				
				ControlladorAtendente controlladorAtendente = new ControlladorAtendente();
				Atendente at = null;
				
				try {
					at = controlladorAtendente.atualizarAtendente(atendenteTela);
				} catch (CamposCadastroVazios | ObjetoNulo e1) {
					e1.printStackTrace();
				}
				
				atendenteTela = at;
				
				txtBairro.setText(atendenteTela.getEndereco().getBairro());
				txtCidade.setText(atendenteTela.getEndereco().getCidade());
				txtComplemento.setText(atendenteTela.getEndereco().getComplemento());
				txtCpf.setText(atendenteTela.getCpf());
				//txtDataNascimento.setCaret((Caret) administradorTela.getDataNascimento());
				txtEstado.setText(atendenteTela.getEndereco().getEstado());
				txtLogin.setText(atendenteTela.getLogin().getLogin());
				txtNome.setText(atendenteTela.getNome());
				txtNumero.setText(atendenteTela.getEndereco().getNumero());
				txtRua.setText(atendenteTela.getEndereco().getRua());
				txtSenha.setText(atendenteTela.getLogin().getSenha());
				txtSobrenome.setText(atendenteTela.getSobrenome());
				txtTelefone.setText(atendenteTela.getTelefone());
				
			}
		});
		btnSalvar.setBounds(681, 557, 109, 32);
		add(btnSalvar);

	}

}
