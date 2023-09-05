package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controller.CadastrarProdutoController;

public class CadastrarProdutoV extends JFrame {

	private JPanel contentPane;
	private JTextField caixaNomeProduto;
	private JFormattedTextField caixaPrecoProduto;
	private JFormattedTextField caixaNumeracao;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private static ConfigViews config = new ConfigViews();
	private JRadioButton bntRadioCalcado;
	private JRadioButton rdbtnMeia;
	private JRadioButton rdbtnAcessrios;
	private JLabel textResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarProdutoV frame = new CadastrarProdutoV();
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
	public CadastrarProdutoV() {
		CadastrarProdutoController cdp = new CadastrarProdutoController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setTitle("Sistema de Loja de Calçados");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDoProduto = new JLabel("Cadastro do Produto:");
		lblCadastroDoProduto.setBounds(31, 35, 198, 22);
		lblCadastroDoProduto.setFont(new Font("Arial Black", Font.PLAIN, 15));
		contentPane.add(lblCadastroDoProduto);
		
		JLabel lblNewLabel_1_1 = new JLabel("Insira corretamento os dados necessários para cadastrar o produto...");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(31, 105, 537, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(327, 173, 430, 518);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1_1.setBounds(26, 23, 46, 19);
		panel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		
		bntRadioCalcado = new JRadioButton("Calçado");
		buttonGroup.add(bntRadioCalcado);
		bntRadioCalcado.setBackground(new Color(192, 192, 192));
		bntRadioCalcado.setFont(new Font("Arial", Font.PLAIN, 13));
		bntRadioCalcado.setBounds(44, 62, 85, 21);
		panel.add(bntRadioCalcado);
		
		rdbtnMeia = new JRadioButton("Meia");
		buttonGroup.add(rdbtnMeia);
		rdbtnMeia.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnMeia.setBackground(Color.LIGHT_GRAY);
		rdbtnMeia.setBounds(173, 62, 72, 21);
		panel.add(rdbtnMeia);
		
		rdbtnAcessrios = new JRadioButton("Acessórios");
		buttonGroup.add(rdbtnAcessrios);
		rdbtnAcessrios.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnAcessrios.setBackground(Color.LIGHT_GRAY);
		rdbtnAcessrios.setBounds(289, 62, 97, 21);
		panel.add(rdbtnAcessrios);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(26, 119, 51, 19);
		panel.add(lblNewLabel_1_1_1_1);
		
		caixaNomeProduto = new JTextField();
		caixaNomeProduto.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaNomeProduto.setBounds(26, 148, 373, 38);
		panel.add(caixaNomeProduto);
		caixaNomeProduto.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Preço:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(26, 219, 51, 19);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		caixaPrecoProduto = new JFormattedTextField();
		caixaPrecoProduto.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaPrecoProduto.setColumns(10);
		caixaPrecoProduto.setBounds(26, 248, 147, 38);
		panel.add(caixaPrecoProduto);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Numeração:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(26, 316, 97, 19);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		caixaNumeracao = null;
		caixaNumeracao = config.mascara("##", caixaNumeracao);
		caixaNumeracao.setFont(new Font("Arial", Font.PLAIN, 13));
		caixaNumeracao.setColumns(10);
		caixaNumeracao.setBounds(26, 345, 77, 38);
		panel.add(caixaNumeracao);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cdp.cadastrar();
			}
		});
		btnCadastrar.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnCadastrar.setBounds(128, 428, 174, 46);
		panel.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Menu");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cdp.voltar(config);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(914, 10, 198, 36);
		contentPane.add(btnVoltar);
		
		textResult = new JLabel("");
		textResult.setFont(new Font("Arial", Font.PLAIN, 16));
		textResult.setBounds(847, 234, 265, 23);
		contentPane.add(textResult);
	}

	public JLabel getTextResult() {
		return textResult;
	}

	public void setTextResult(JLabel textResult) {
		this.textResult = textResult;
	}

	public JTextField getCaixaNomeProduto() {
		return caixaNomeProduto;
	}

	public void setCaixaNomeProduto(JTextField caixaNomeProduto) {
		this.caixaNomeProduto = caixaNomeProduto;
	}

	public JTextField getCaixaPrecoProduto() {
		return caixaPrecoProduto;
	}

	public void setCaixaPrecoProduto(JFormattedTextField caixaPrecoProduto) {
		this.caixaPrecoProduto = caixaPrecoProduto;
	}

	public JTextField getCaixaNumeracao() {
		return caixaNumeracao;
	}

	public void setCaixaNumeracao(JFormattedTextField caixaNumeracao) {
		this.caixaNumeracao = caixaNumeracao;
	}

	public JRadioButton getBntRadioCalcado() {
		return bntRadioCalcado;
	}

	public void setBntRadioCalcado(JRadioButton bntRadioCalcado) {
		this.bntRadioCalcado = bntRadioCalcado;
	}

	public JRadioButton getRdbtnMeia() {
		return rdbtnMeia;
	}

	public void setRdbtnMeia(JRadioButton rdbtnMeia) {
		this.rdbtnMeia = rdbtnMeia;
	}

	public JRadioButton getRdbtnAcessrios() {
		return rdbtnAcessrios;
	}

	public void setRdbtnAcessrios(JRadioButton rdbtnAcessrios) {
		this.rdbtnAcessrios = rdbtnAcessrios;
	}
}
