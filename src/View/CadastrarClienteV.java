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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarClienteV extends JFrame {

	private JPanel contentPane;
	private JTextField caixaNomeClient;
	private JTextField cpfClient;
	private JTextField emailClient;
	private static ConfigViews config = new ConfigViews();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarClienteV frame = new CadastrarClienteV();
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
	public CadastrarClienteV() {
		setTitle("Cadastrar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeClientes = new JLabel("Cadastro de Clientes:");
		lblCadastroDeClientes.setBounds(138, 33, 198, 22);
		lblCadastroDeClientes.setFont(new Font("Arial Black", Font.PLAIN, 15));
		contentPane.add(lblCadastroDeClientes);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(130, 135, 144)), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(30, 127, 415, 495);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(23, 59, 83, 23);
		panel.add(lblNewLabel_1_1);
		
		caixaNomeClient = new JTextField();
		caixaNomeClient.setFont(new Font("Arial", Font.PLAIN, 18));
		caixaNomeClient.setColumns(10);
		caixaNomeClient.setBounds(23, 87, 352, 39);
		panel.add(caixaNomeClient);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(23, 150, 83, 23);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel textSituacao = new JLabel("Situação: ");
		textSituacao.setFont(new Font("Arial", Font.PLAIN, 16));
		textSituacao.setBounds(6, 672, 330, 23);
		contentPane.add(textSituacao);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(true) {
					textSituacao.setText("Situação: Cadastro realizado com sucesso");
				//}else {
					//textSituacao.setText("Situação: Dados inseridos incorretamente");
				//}
			}
		});
		btnCadastrar.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnCadastrar.setBounds(127, 391, 160, 39);
		panel.add(btnCadastrar);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(23, 257, 83, 23);
		panel.add(lblNewLabel_1_1_1_1);
		
		cpfClient = new JTextField();
		cpfClient.setFont(new Font("Arial", Font.PLAIN, 18));
		cpfClient.setColumns(10);
		cpfClient.setBounds(23, 185, 352, 39);
		panel.add(cpfClient);
		
		emailClient = new JTextField();
		emailClient.setFont(new Font("Arial", Font.PLAIN, 18));
		emailClient.setColumns(10);
		emailClient.setBounds(23, 304, 352, 39);
		panel.add(emailClient);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AreaDeTrabalhoV a = new AreaDeTrabalhoV();
				//a.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(359, 10, 106, 36);
		contentPane.add(btnVoltar);
		
	}
}
