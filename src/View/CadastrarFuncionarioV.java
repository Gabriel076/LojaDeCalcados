package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import Controller.CadastrarFuncController;
import java.awt.event.ActionListener;
import java.sql.SQLIntegrityConstraintViolationException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class CadastrarFuncionarioV extends JFrame {

	private JPanel contentPane;
	private JTextField caixaNome;
	private JFormattedTextField caixaIdade;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JFormattedTextField caixaLogin;
	private JFormattedTextField caixaSenha;
	private static ConfigViews config = new ConfigViews();
	private JRadioButton rdbtnOperador;
	private JRadioButton bntRadioAdm;
	private JLabel situacao;
	private JFormattedTextField cpf;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFuncionarioV frame = new CadastrarFuncionarioV();
					config.ativarConfigPadrao(frame);
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
	public CadastrarFuncionarioV() {
		CadastrarFuncController cd = new CadastrarFuncController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1118, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setTitle("Sistema de Loja de Calçados");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDoProduto = new JLabel("Cadastro do Funcionário:");
		lblCadastroDoProduto.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblCadastroDoProduto.setBounds(20, 10, 242, 22);
		contentPane.add(lblCadastroDoProduto);
		
		JLabel lblNewLabel_1_1 = new JLabel("Insira corretamento os dados necessários para cadastrar o Funcionário..");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(20, 42, 537, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(337, 75, 430, 591);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(26, 23, 46, 19);
		panel.add(lblNewLabel_1_1_1);
		
		bntRadioAdm = new JRadioButton("Administrador");
		buttonGroup.add(bntRadioAdm);
		bntRadioAdm.setFont(new Font("Arial", Font.PLAIN, 13));
		bntRadioAdm.setBackground(Color.LIGHT_GRAY);
		bntRadioAdm.setBounds(73, 51, 110, 21);
		panel.add(bntRadioAdm);
		
		rdbtnOperador = new JRadioButton("Operador");
		buttonGroup.add(rdbtnOperador);
		rdbtnOperador.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnOperador.setBackground(Color.LIGHT_GRAY);
		rdbtnOperador.setBounds(257, 51, 97, 21);
		panel.add(rdbtnOperador);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(26, 93, 51, 19);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(26, 174, 51, 19);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		caixaNome = new JTextField();
		caixaNome.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaNome.setColumns(10);
		caixaNome.setBounds(26, 203, 373, 38);
		panel.add(caixaNome);
		
		caixaIdade = null;
		caixaIdade = config.mascara("##", caixaIdade);
		caixaIdade.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaIdade.setColumns(10);
		caixaIdade.setBounds(26, 291, 77, 38);
		panel.add(caixaIdade);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						cd.cadastrar();
					} catch (SQLIntegrityConstraintViolationException e1) {
						System.out.println("Dados invalidos");
						e1.printStackTrace();
					}
			}
		});
		
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnNewButton.setBounds(128, 520, 174, 46);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Idade:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(26, 262, 51, 19);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Login:");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(26, 351, 51, 19);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Senha:");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1_2.setBounds(26, 429, 51, 19);
		panel.add(lblNewLabel_1_1_1_1_1_1_2);
		
		caixaLogin = null;
		caixaLogin = config.mascara("#####", caixaLogin);
		caixaLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaLogin.setColumns(10);
		caixaLogin.setBounds(26, 381, 174, 38);
		panel.add(caixaLogin);
		
		caixaSenha = null;
		caixaSenha = config.mascara("#####", caixaSenha);
		caixaSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaSenha.setColumns(10);
		caixaSenha.setBounds(26, 460, 174, 38);
		panel.add(caixaSenha);
		
		cpf = null;
		cpf = config.mascara("###.###.###-##", cpf);
		cpf.setBounds(26, 122, 373, 38);
		cpf.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(cpf);
			
		JButton btnVoltar = new JButton("Menu");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.voltar(config);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(896, 13, 198, 36);
		contentPane.add(btnVoltar);
		
		situacao = new JLabel("");
		situacao.setFont(new Font("Arial", Font.PLAIN, 16));
		situacao.setBounds(809, 330, 285, 19);
		contentPane.add(situacao);
	}

	
	public JFormattedTextField getCaixaCpf() {
		return cpf;
	}

	public void setCaixaCpf(JFormattedTextField caixaCpf) {
		this.cpf = caixaCpf;
	}

	public JTextField getCaixaNome() {
		return caixaNome;
	}

	public void setCaixaNome(JTextField caixaNome) {
		this.caixaNome = caixaNome;
	}

	public JLabel getSituacao() {
		return situacao;
	}

	public void setSituacao(JLabel situacao) {
		this.situacao = situacao;
	}

	public JTextField getCaixaIdade() {
		return caixaIdade;
	}

	public void setCaixaIdade(JFormattedTextField caixaIdade) {
		this.caixaIdade = caixaIdade;
	}

	public JTextField getCaixaLogin() {
		return caixaLogin;
	}

	public void setCaixaLogin(JFormattedTextField caixaLogin) {
		this.caixaLogin = caixaLogin;
	}

	public JTextField getCaixaSenha() {
		return caixaSenha;
	}

	public void setCaixaSenha(JFormattedTextField caixaSenha) {
		this.caixaSenha = caixaSenha;
	}

	public JRadioButton getRdbtnOperador() {
		return rdbtnOperador;
	}

	public void setRdbtnOperador(JRadioButton rdbtnOperador) {
		this.rdbtnOperador = rdbtnOperador;
	}

	public JRadioButton getBntRadioAdm() {
		return bntRadioAdm;
	}

	public void setBntRadioAdm(JRadioButton bntRadioAdm) {
		this.bntRadioAdm = bntRadioAdm;
	}
}
