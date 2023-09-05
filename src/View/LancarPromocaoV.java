package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JEditorPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;
import Controller.LancarPromocaoController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LancarPromocaoV extends JFrame {

	private JPanel contentPane;
	private JTextField caixaIdProduto;
	private JTable table;
	private JTextField CaixaNome;
	private JTextField CaixaPreco;
	private JTextField ValorDesc;
	private static ConfigViews config = new ConfigViews();
	private JLabel respost;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LancarPromocaoV frame = new LancarPromocaoV();
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
	public LancarPromocaoV() {
		LancarPromocaoController lp = new LancarPromocaoController(this);
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
		caixaIdProduto.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaIdProduto.setBounds(31, 127, 241, 32);
		contentPane.add(caixaIdProduto);
		caixaIdProduto.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Insira Id do produto");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(31, 94, 330, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lp.adicionarProduto();
			}
		});
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
		table.setRowHeight(18);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"ID", "Nome", "Tipo", "Preço", "Novo Valor"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lp.voltar(config);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(993, 639, 120, 32);
		contentPane.add(btnVoltar);
		
		CaixaNome = new JTextField();
		CaixaNome.setBackground(new Color(255, 255, 255));
		CaixaNome.setFont(new Font("Arial", Font.PLAIN, 14));
		CaixaNome.setColumns(10);
		CaixaNome.setBounds(31, 265, 241, 32);
		CaixaNome.setEditable(false);
		contentPane.add(CaixaNome);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(31, 237, 61, 23);
		contentPane.add(lblNewLabel_1_1_1);
		
		CaixaPreco = new JTextField();
		CaixaPreco.setBackground(new Color(255, 255, 255));
		CaixaPreco.setFont(new Font("Arial", Font.PLAIN, 14));
		CaixaPreco.setColumns(10);
		CaixaPreco.setBounds(32, 349, 120, 32);
		CaixaPreco.setEditable(false);
		contentPane.add(CaixaPreco);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Preço:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(32, 324, 61, 23);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		ValorDesc = new JTextField();
		ValorDesc.setFont(new Font("Arial", Font.PLAIN, 14));
		ValorDesc.setColumns(10);
		ValorDesc.setBounds(31, 430, 120, 32);
		contentPane.add(ValorDesc);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Valor desconto:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(31, 405, 135, 23);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JEditorPane Msg = new JEditorPane();
		Msg.setBorder(UIManager.getBorder("PasswordField.border"));
		Msg.setFont(new Font("Arial", Font.PLAIN, 16));
		Msg.setBounds(31, 499, 330, 141);
		contentPane.add(Msg);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Text(algo do tipo)");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(31, 472, 135, 23);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JButton btnPostar = new JButton("Postar");
		btnPostar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnPostar.setBounds(605, 295, 120, 32);
		contentPane.add(btnPostar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lp.buscarProduto();
			}
		});
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnBuscar.setBounds(152, 169, 120, 32);
		contentPane.add(btnBuscar);
		
		respost = new JLabel("");
		respost.setFont(new Font("Arial Black", Font.PLAIN, 22));
		respost.setBounds(605, 440, 330, 23);
		contentPane.add(respost);
	}

	
	public JLabel getRespost() {
		return respost;
	}

	public void setRespost(JLabel respost) {
		this.respost = respost;
	}

	public JTextField getCaixaIdProduto() {
		return caixaIdProduto;
	}

	public void setCaixaIdProduto(JTextField caixaIdProduto) {
		this.caixaIdProduto = caixaIdProduto;
	}

	public JTextField getCaixaNome() {
		return CaixaNome;
	}

	public void setCaixaNome(JTextField caixaNome) {
		CaixaNome = caixaNome;
	}

	public JTextField getCaixaPreco() {
		return CaixaPreco;
	}

	public void setCaixaPreco(JTextField caixaPreco) {
		CaixaPreco = caixaPreco;
	}

	public JTextField getValorDesc() {
		return ValorDesc;
	}

	public void setValorDesc(JTextField valorDesc) {
		ValorDesc = valorDesc;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	
}
