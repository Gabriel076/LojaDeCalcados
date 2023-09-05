package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import Controller.PaginaIniController;
import Model.Funcionario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaginaInicialV extends JFrame {

	private JPanel contentPane;
	private JTextField Caixalogin;
	private JPasswordField caixaSenha;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton btnRadioFunc;
	private JRadioButton btnRadioAdmin;
	private static ConfigViews configuracao = new ConfigViews();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicialV frame = new PaginaInicialV();
					configuracao.ativarConfigPadrao(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaginaInicialV() {
		PaginaIniController p = new PaginaIniController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setTitle("Sistema de Loja de Calçados");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem vindo(a) ao Sistema ");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(129, 27, 222, 36);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(130, 135, 144)), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(33, 110, 415, 495);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha como quer entrar:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(23, 10, 210, 23);
		panel.add(lblNewLabel_1);
		
		btnRadioFunc = new JRadioButton("Funcionário");
		buttonGroup.add(btnRadioFunc);
		btnRadioFunc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRadioFunc.setBackground(new Color(192, 192, 192));
		btnRadioFunc.setBounds(33, 39, 103, 21);
		panel.add(btnRadioFunc);
		
		btnRadioAdmin = new JRadioButton("Admin");
		buttonGroup.add(btnRadioAdmin);
		btnRadioAdmin.setFont(new Font("Arial", Font.PLAIN, 13));
		btnRadioAdmin.setBackground(new Color(192, 192, 192));
		btnRadioAdmin.setBounds(246, 41, 103, 21);
		panel.add(btnRadioAdmin);
		
		JLabel lblNewLabel_1_1 = new JLabel("Login:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(23, 93, 210, 23);
		panel.add(lblNewLabel_1_1);
		
		Caixalogin = new JTextField();
		Caixalogin.setFont(new Font("Arial", Font.PLAIN, 18));
		Caixalogin.setBounds(23, 126, 352, 39);
		panel.add(Caixalogin);
		Caixalogin.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(23, 228, 210, 23);
		panel.add(lblNewLabel_1_1_1);
		
		caixaSenha = new JPasswordField();
		caixaSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		caixaSenha.setBounds(23, 268, 352, 39);
		panel.add(caixaSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.validarUsuario(configuracao);
			}
		});
		btnEntrar.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnEntrar.setBounds(127, 391, 160, 39);
		panel.add(btnEntrar);
	}

	public static ConfigViews getConfiguracao() {
		return configuracao;
	}

	public static void setConfiguracao(ConfigViews configuracao) {
		PaginaInicialV.configuracao = configuracao;
	}

	public JRadioButton getBtnRadioFunc() {
		return btnRadioFunc;
	}

	public void setBtnRadioFunc(JRadioButton btnRadioFunc) {
		this.btnRadioFunc = btnRadioFunc;
	}

	public JRadioButton getBtnRadioAdmin() {
		return btnRadioAdmin;
	}

	public void setBtnRadioAdmin(JRadioButton btnRadioAdmin) {
		this.btnRadioAdmin = btnRadioAdmin;
	}

	public JTextField getCaixalogin() {
		return Caixalogin;
	}

	public void setCaixalogin(JTextField caixalogin) {
		Caixalogin = caixalogin;
	}

	public JPasswordField getCaixaSenha() {
		return caixaSenha;
	}

	public void setCaixaSenha(JPasswordField caixaSenha) {
		this.caixaSenha = caixaSenha;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}



	
}
