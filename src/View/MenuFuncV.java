package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import Controller.MenuFuncController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MenuFuncV extends JFrame {

	private JPanel contentPane;
	private JTextField caixaNome;
	private JTextField caixaIdade;
	private JLabel textResptAdmin;
	private static ConfigViews config = new ConfigViews();
	private JTextField caixaCpf = new JTextField();;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFuncV frame = new MenuFuncV();
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
	public MenuFuncV() {
		MenuFuncController mf = new MenuFuncController(this);
		mf.pegarLogin();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1126, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(30, 28, 895, 660);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMenuDoFuncionrio = new JLabel("Menu do Funcionário");
		lblMenuDoFuncionrio.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblMenuDoFuncionrio.setBounds(34, 41, 228, 22);
		panel.add(lblMenuDoFuncionrio);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNome.setBounds(34, 122, 53, 22);
		panel.add(lblNome);
		
		caixaNome = new JTextField();
		caixaNome.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaNome.setColumns(10);
		caixaNome.setBounds(34, 154, 485, 35);
		caixaNome.setEditable(false);
		panel.add(caixaNome);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mf.sair(config);
			}
		});
		btnSair.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSair.setBounds(706, 618, 179, 32);
		panel.add(btnSair);
		
		JButton btnIniciarTrabalho = new JButton("Iniciar Trabalho");
		btnIniciarTrabalho.setFont(new Font("Arial", Font.PLAIN, 15));
		btnIniciarTrabalho.setBounds(706, 576, 179, 32);
		panel.add(btnIniciarTrabalho);
		
		JButton btnVirificarCargaHorria = new JButton("Virificar Carga Horária");
		btnVirificarCargaHorria.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVirificarCargaHorria.setBounds(706, 534, 179, 32);
		panel.add(btnVirificarCargaHorria);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(586, 68, 241, 243);
		panel.add(panel_1);
		
		caixaIdade = new JTextField();
		caixaIdade.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaIdade.setColumns(10);
		caixaIdade.setBounds(34, 267, 72, 35);
		caixaIdade.setEditable(false);
		panel.add(caixaIdade);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Arial", Font.PLAIN, 15));
		lblIdade.setBounds(34, 235, 72, 22);
		panel.add(lblIdade);
		
		mf.exibirDados();
		JLabel lblAdmin = new JLabel("Admin?");
		lblAdmin.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAdmin.setBounds(34, 516, 72, 22);
		panel.add(lblAdmin);
		
		textResptAdmin = new JLabel("Não");
		textResptAdmin.setFont(new Font("Arial", Font.PLAIN, 15));
		textResptAdmin.setBounds(111, 516, 72, 22);
		panel.add(textResptAdmin);
		
		JLabel lblAtivo = new JLabel("Ativo?");
		lblAtivo.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAtivo.setBounds(34, 567, 72, 22);
		panel.add(lblAtivo);
		
		JLabel textResptAtv = new JLabel("Sim");
		textResptAtv.setFont(new Font("Arial", Font.PLAIN, 15));
		textResptAtv.setBounds(111, 567, 72, 22);
		panel.add(textResptAtv);
		
		JLabel lblIdade_1 = new JLabel("CPF:");
		lblIdade_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblIdade_1.setBounds(34, 351, 72, 22);
		panel.add(lblIdade_1);
		
		caixaCpf.setFont(new Font("Arial", Font.PLAIN, 15));
		//caixaCpf.setEditable(false);
		caixaCpf.setColumns(10);
		caixaCpf.setBounds(34, 388, 310, 35);
		panel.add(caixaCpf);
	}

	
	public JTextField getCaixaCpf() {
		return caixaCpf;
	}

	public void setCaixaCpf(JTextField caixaCpf) {
		this.caixaCpf = caixaCpf;
	}

	public JLabel getTextResptAdmin() {
		return textResptAdmin;
	}

	public void setTextResptAdmin(JLabel textResptAdmin) {
		this.textResptAdmin = textResptAdmin;
	}

	public JTextField getCaixaNome() {
		return caixaNome;
	}

	public void setCaixaNome(JTextField caixaNome) {
		this.caixaNome = caixaNome;
	}

	public JTextField getCaixaIdade() {
		return caixaIdade;
	}

	public void setCaixaIdade(JTextField caixaIdade) {
		this.caixaIdade = caixaIdade;
	}
}
