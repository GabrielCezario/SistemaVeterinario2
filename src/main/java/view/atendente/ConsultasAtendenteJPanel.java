package view.atendente;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import view.Main;
import view.PainelJPanel;

import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultasAtendenteJPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTable tblConsultas;

	/**
	 * Create the panel.
	 */
	public ConsultasAtendenteJPanel() {
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
				Main.getFrame().setContentPane(new PainelJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnSair.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnSair.setBounds(670, 7, 120, 30);
		panelPerfil.add(btnSair);
		
		JLabel lblConsultas = new JLabel("Consultas");
		lblConsultas.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblConsultas.setBounds(210, 51, 99, 22);
		add(lblConsultas);
		
		textField = new JTextField();
		textField.setBounds(293, 97, 254, 25);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNomePet = new JLabel("Pet:");
		lblNomePet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomePet.setBounds(251, 102, 32, 14);
		add(lblNomePet);
		
		JLabel lblVeterinario = new JLabel("Veterinario:");
		lblVeterinario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVeterinario.setBounds(210, 138, 75, 14);
		add(lblVeterinario);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(293, 133, 254, 25);
		add(textField_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 170, 580, 419);
		add(scrollPane);
		
		DefaultTableModel modelConsultas = new DefaultTableModel();
		tblConsultas = new JTable();
		tblConsultas.setModel(modelConsultas);
		
		modelConsultas.addColumn("Id");
		modelConsultas.addColumn("Pet");
		modelConsultas.addColumn("Dono");
		modelConsultas.addColumn("Veterinario");
		modelConsultas.addColumn("Data");
		modelConsultas.addColumn("Hora");
		
		tblConsultas.getColumnModel().getColumn(0).setResizable(false);
		tblConsultas.getColumnModel().getColumn(1).setResizable(false);
		tblConsultas.getColumnModel().getColumn(2).setResizable(false);
		tblConsultas.getColumnModel().getColumn(3).setResizable(false);
		tblConsultas.getColumnModel().getColumn(4).setResizable(false);
		tblConsultas.getColumnModel().getColumn(5).setResizable(false);
		
		tblConsultas.getColumnModel().getColumn(0).setMinWidth(50);
		tblConsultas.getColumnModel().getColumn(0).setMaxWidth(50);
		
		scrollPane.setViewportView(tblConsultas);
		
		Button btnBuscar = new Button("Buscar");
		btnBuscar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBackground(new Color(0, 153, 204));
		btnBuscar.setBounds(553, 97, 75, 61);
		add(btnBuscar);
		
		Button btnCadastrar = new Button("Cadastrar");
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(new Color(0, 153, 204));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setBounds(715, 97, 75, 61);
		add(btnCadastrar);
		
		Button btnVisualizar = new Button("Visualizar");
		btnVisualizar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnVisualizar.setForeground(Color.WHITE);
		btnVisualizar.setBackground(new Color(0, 153, 204));
		btnVisualizar.setBounds(634, 97, 75, 61);
		add(btnVisualizar);
		
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
		btnRelatorios.setBounds(0, 82, 200, 41);
		panelMenu.add(btnRelatorios);
		
		JButton btnDados = new JButton("Dados Atendente");
		btnDados.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new DadosAtendenteJPanel());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnDados.setBounds(0, 123, 200, 41);
		panelMenu.add(btnDados);
		
		
		

	}
}
