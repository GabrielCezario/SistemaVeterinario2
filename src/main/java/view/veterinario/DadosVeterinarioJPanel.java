package view.veterinario;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import view.Main;
import view.PainelUsuarioJPanel;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DadosVeterinarioJPanel extends JPanel {
	private JTextField txtNome;
	private JTextField txtDataNascimento;
	private JTextField txtTelefone;
	private JTextField txtSobrenome;
	private JTextField txtCpf;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Create the panel.
	 */
	public DadosVeterinarioJPanel() {
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
				
				Main.getFrame().setContentPane(new ConsultasVeterinarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnConsultas.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnConsultas.setBounds(0, 0, 200, 41);
		panelMenu.add(btnConsultas);
		
		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new ConsultasVeterinarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnRelatorios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnRelatorios.setBounds(0, 41, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDadosVeterinarios = new JButton("Dados Veterinario");
		btnDadosVeterinarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new DadosVeterinarioJPanel());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnDadosVeterinarios.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDadosVeterinarios.setBounds(0, 82, 200, 41);
		panelMenu.add(btnDadosVeterinarios);
		
		JLabel lblNome = new JLabel("Nome*");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(210, 51, 46, 14);
		add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(210, 75, 188, 20);
		add(txtNome);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento*");
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDataNascimento.setBounds(210, 106, 146, 14);
		add(lblDataNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(210, 130, 188, 20);
		add(txtDataNascimento);
		
		JLabel lblTelefone = new JLabel("Telefone*");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(408, 106, 86, 14);
		add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(408, 130, 188, 20);
		add(txtTelefone);
		
		JLabel lblSobrenome = new JLabel("Sobrenome*");
		lblSobrenome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSobrenome.setBounds(408, 51, 86, 14);
		add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(408, 75, 188, 20);
		add(txtSobrenome);
		
		JLabel lblCpf = new JLabel("CPF*");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCpf.setBounds(606, 52, 46, 14);
		add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(606, 75, 188, 20);
		add(txtCpf);
		
		JLabel lblEstado = new JLabel("Estado*");
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEstado.setBounds(210, 198, 58, 14);
		add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(210, 222, 188, 20);
		add(txtEstado);
		
		JLabel lblCidade = new JLabel("Cidade*");
		lblCidade.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCidade.setBounds(408, 198, 86, 14);
		add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(408, 222, 188, 20);
		add(txtCidade);
		
		JLabel lblBairro = new JLabel("Bairro*");
		lblBairro.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBairro.setBounds(606, 199, 46, 14);
		add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(606, 222, 188, 20);
		add(txtBairro);
		
		JLabel lblRua = new JLabel("Rua*");
		lblRua.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRua.setBounds(210, 253, 58, 14);
		add(lblRua);
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		txtRua.setBounds(210, 277, 188, 20);
		add(txtRua);
		
		JLabel lblNumero = new JLabel("Numero*");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumero.setBounds(408, 253, 86, 14);
		add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(408, 277, 188, 20);
		add(txtNumero);
		
		JLabel lblComplemento = new JLabel("Complemento*");
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblComplemento.setBounds(606, 254, 103, 14);
		add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(606, 277, 188, 20);
		add(txtComplemento);
		
		JLabel lblLogin = new JLabel("Login*");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLogin.setBounds(222, 348, 58, 14);
		add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(278, 346, 188, 20);
		add(txtLogin);
		
		JLabel lblSenha = new JLabel("Senha*");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(222, 375, 46, 14);
		add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(278, 373, 188, 20);
		add(txtSenha);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(659, 566, 131, 23);
		add(btnSalvar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(554, 374, 188, 142);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblEspecialidade = new JLabel("Especialidade");
		lblEspecialidade.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEspecialidade.setBounds(558, 348, 103, 14);
		add(lblEspecialidade);

	}
}
