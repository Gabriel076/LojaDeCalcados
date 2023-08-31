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

public class CadastrarFuncionarioV extends JFrame {

	private JPanel contentPane;
	private JTextField caixaCpf;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_3;
	private static ConfigViews config = new ConfigViews();
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
		
		JRadioButton bntRadioCalcado = new JRadioButton("Administrador");
		buttonGroup.add(bntRadioCalcado);
		bntRadioCalcado.setFont(new Font("Arial", Font.PLAIN, 13));
		bntRadioCalcado.setBackground(Color.LIGHT_GRAY);
		bntRadioCalcado.setBounds(73, 51, 110, 21);
		panel.add(bntRadioCalcado);
		
		JRadioButton rdbtnAcessrios = new JRadioButton("Operador");
		buttonGroup.add(rdbtnAcessrios);
		rdbtnAcessrios.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnAcessrios.setBackground(Color.LIGHT_GRAY);
		rdbtnAcessrios.setBounds(257, 51, 97, 21);
		panel.add(rdbtnAcessrios);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(26, 93, 51, 19);
		panel.add(lblNewLabel_1_1_1_1);
		
		caixaCpf = new JTextField();
		caixaCpf.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaCpf.setColumns(10);
		caixaCpf.setBounds(26, 122, 373, 38);
		panel.add(caixaCpf);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(26, 174, 51, 19);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(26, 203, 373, 38);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(26, 291, 77, 38);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Cadastrar");
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
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(26, 381, 174, 38);
		panel.add(textField);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(26, 460, 174, 38);
		panel.add(textField_3);
		
		JButton btnVoltar = new JButton("Menu");
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(896, 13, 198, 36);
		contentPane.add(btnVoltar);
	}
}
