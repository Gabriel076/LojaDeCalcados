package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controller.ListarItensController;

public class ListarItensV extends JFrame {

	private JPanel contentPane;
	private static ConfigViews config = new ConfigViews();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarItensV frame = new ListarItensV();
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
	public ListarItensV() {
		ListarItensController lc = new ListarItensController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(54, 27, 554, 672);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblInformeOQue = new JLabel("Informe o que deseja listar:");
		lblInformeOQue.setBounds(26, 27, 228, 22);
		lblInformeOQue.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panel.add(lblInformeOQue);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(43, 78, 468, 507);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(219, 219, 219));
		panel_2.setBounds(31, 32, 405, 64);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnListarClient = new JButton("Listar");
		btnListarClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lc.listarCliente(config);
			}
		});
		btnListarClient.setBounds(235, 12, 160, 39);
		panel_2.add(btnListarClient);
		btnListarClient.setFont(new Font("Arial Black", Font.PLAIN, 13));
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setBounds(10, 21, 75, 22);
		panel_2.add(lblClientes);
		lblClientes.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(219, 219, 219));
		panel_2_1.setBounds(31, 132, 405, 64);
		panel_1.add(panel_2_1);
		
		JButton btnListarFunc = new JButton("Listar");
		btnListarFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lc.listarFuncionario(config);
			}
		});
		btnListarFunc.setBounds(235, 12, 160, 39);
		panel_2_1.add(btnListarFunc);
		btnListarFunc.setFont(new Font("Arial Black", Font.PLAIN, 13));
		
		JLabel lblFuncionrios = new JLabel("Funcionários");
		lblFuncionrios.setBounds(10, 21, 109, 22);
		panel_2_1.add(lblFuncionrios);
		lblFuncionrios.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(219, 219, 219));
		panel_2_1_1.setBounds(31, 223, 405, 64);
		panel_1.add(panel_2_1_1);
		
		JButton btnListarProdt = new JButton("Listar");
		btnListarProdt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lc.listarProduto(config);
			}
		});
		btnListarProdt.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnListarProdt.setBounds(235, 12, 160, 39);
		panel_2_1_1.add(btnListarProdt);
		
		JLabel lblProdutos = new JLabel("Produtos");
		lblProdutos.setBounds(10, 21, 80, 22);
		panel_2_1_1.add(lblProdutos);
		lblProdutos.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lc.voltar(config);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(438, 626, 106, 36);
		panel.add(btnVoltar);
	}
}
