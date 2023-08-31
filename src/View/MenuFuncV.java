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


public class MenuFuncV extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static ConfigViews config = new ConfigViews();
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
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(34, 154, 485, 35);
		panel.add(textField);
		
		JButton btnSair = new JButton("Sair");
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
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(34, 267, 72, 35);
		panel.add(textField_1);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Arial", Font.PLAIN, 15));
		lblIdade.setBounds(34, 235, 72, 22);
		panel.add(lblIdade);
		
		JLabel lblAdmin = new JLabel("Admin?");
		lblAdmin.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAdmin.setBounds(34, 342, 72, 22);
		panel.add(lblAdmin);
		
		JLabel textRespt = new JLabel("respt");
		textRespt.setFont(new Font("Arial", Font.PLAIN, 15));
		textRespt.setBounds(111, 342, 72, 22);
		panel.add(textRespt);
		
		JLabel lblAtivo = new JLabel("Ativo?");
		lblAtivo.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAtivo.setBounds(34, 393, 72, 22);
		panel.add(lblAtivo);
		
		JLabel textRespt_1 = new JLabel("respt");
		textRespt_1.setFont(new Font("Arial", Font.PLAIN, 15));
		textRespt_1.setBounds(111, 393, 72, 22);
		panel.add(textRespt_1);
	}
}
