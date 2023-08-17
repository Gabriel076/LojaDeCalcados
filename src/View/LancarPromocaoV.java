package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;

public class LancarPromocaoV extends JFrame {

	private JPanel contentPane;
	private JTextField caixaIdProduto;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LancarPromocaoV frame = new LancarPromocaoV();
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
	public LancarPromocaoV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 718);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		this.setTitle("Sistema de Loja de Calçados");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLanarPromoo = new JLabel("Lançar Promoção:");
		lblLanarPromoo.setBounds(31, 54, 198, 22);
		lblLanarPromoo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		contentPane.add(lblLanarPromoo);
		
		caixaIdProduto = new JTextField();
		caixaIdProduto.setBounds(31, 127, 241, 32);
		contentPane.add(caixaIdProduto);
		caixaIdProduto.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Insira Id do produto");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(31, 94, 330, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAdicionar.setBounds(31, 169, 120, 32);
		contentPane.add(btnAdicionar);
		
		JLabel lblProdutosAdicionados = new JLabel("Produtos Adicionados:");
		lblProdutosAdicionados.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblProdutosAdicionados.setBounds(605, 116, 198, 22);
		contentPane.add(lblProdutosAdicionados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(605, 157, 491, 108);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(993, 639, 120, 32);
		contentPane.add(btnVoltar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(31, 265, 241, 32);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(31, 237, 61, 23);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(32, 349, 120, 32);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Preço:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(32, 324, 61, 23);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(31, 430, 120, 32);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Valor desconto:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(31, 405, 135, 23);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(UIManager.getBorder("PasswordField.border"));
		editorPane.setFont(new Font("Arial", Font.PLAIN, 16));
		editorPane.setBounds(31, 499, 330, 141);
		contentPane.add(editorPane);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Text(algo do tipo)");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(31, 472, 135, 23);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JButton btnPostar = new JButton("Postar");
		btnPostar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnPostar.setBounds(605, 295, 120, 32);
		contentPane.add(btnPostar);
	}
}
