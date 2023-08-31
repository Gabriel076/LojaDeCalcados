package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controller.MenuAdmController;
public class MenuAdminV extends JFrame {

	private JPanel contentPane;
	private static ConfigViews config = new ConfigViews();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdminV frame = new MenuAdminV();
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
	public MenuAdminV() {
		MenuAdmController mn = new MenuAdmController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1122, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setTitle("Sistema de Loja de Calçados");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuDoAdministrador = new JLabel("Menu do Administrador:");
		lblMenuDoAdministrador.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblMenuDoAdministrador.setBounds(21, 24, 222, 36);
		contentPane.add(lblMenuDoAdministrador);
		
		JLabel lblNewLabel_1_1 = new JLabel("Escolha qual operação deseja fazer...");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(21, 87, 330, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Cadastrar Funcionário");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mn.cadastrarFunc(config);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(65, 157, 432, 54);
		contentPane.add(btnNewButton);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mn.cadastrarProd(config);
			}
		});
		btnCadastrarProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCadastrarProduto.setBounds(65, 272, 432, 54);
		contentPane.add(btnCadastrarProduto);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mn.sair(config);
			}
		});
		btnSair.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSair.setBounds(900, 610, 198, 36);
		contentPane.add(btnSair);
		
		JButton btnLancarPromocao = new JButton("Lançar Promoção");
		btnLancarPromocao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mn.lancarProm(config);
			}
		});
		btnLancarPromocao.setFont(new Font("Arial", Font.PLAIN, 15));
		btnLancarPromocao.setBounds(625, 157, 432, 54);
		contentPane.add(btnLancarPromocao);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mn.listar(config);
			}
		});
		btnListar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnListar.setBounds(625, 272, 432, 54);
		contentPane.add(btnListar);
	}
	
}
