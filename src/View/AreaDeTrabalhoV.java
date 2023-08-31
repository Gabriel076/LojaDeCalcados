package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.UIManager;
import javax.swing.JInternalFrame;

public class AreaDeTrabalhoV extends JFrame {
	private JPanel contentPane;
	private JTextField caixaIdCompra;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField caixaCodigoDeBarras;
	private JTextField caixaPreco;
	private JTextField caixaQuantidade;
	private JTextField caixaTotalVenda;
	private JTextField caixaNomeCliente;
	private JTextField caixaNomeOperador;
	private JTextField caixaDesconto;
	private JTextField caixaNomeProduto;
	private Date horaAtual = new Date();
	private static ConfigViews configuracao = new ConfigViews();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaDeTrabalhoV frame = new AreaDeTrabalhoV();
					
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
	public AreaDeTrabalhoV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 740);
		this.setTitle("Sistema de Loja de Calçados");
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial Black", Font.PLAIN, 12));
		contentPane.setBorder(UIManager.getBorder("Button.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 72, 286, 47);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Id Compra:");
		scrollPane.setColumnHeaderView(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 64, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		caixaIdCompra = new JTextField();
		scrollPane.setViewportView(caixaIdCompra);
		caixaIdCompra.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaIdCompra.setColumns(10);
		
		JLabel lblNomeDaLoja = new JLabel("Nome da Loja");
		lblNomeDaLoja.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNomeDaLoja.setBounds(26, 26, 222, 36);
		contentPane.add(lblNomeDaLoja);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 290, 286, 61);
		contentPane.add(scrollPane_1);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblTipo.setBackground(new Color(0, 64, 0));
		scrollPane_1.setColumnHeaderView(lblTipo);
		
		//RadiosButtons
		boolean isDevolucao;
		boolean isVenda;
		
		JRadioButton radioButtonDevolucao = new JRadioButton("Devolução   ");
		radioButtonDevolucao.setBackground(new Color(255, 255, 255));
		buttonGroup.add(radioButtonDevolucao);
		radioButtonDevolucao.setFont(new Font("Arial", Font.PLAIN, 14));
		scrollPane_1.setRowHeaderView(radioButtonDevolucao);
		
		JRadioButton radioButtonVenda = new JRadioButton("Venda");
		radioButtonVenda.setBackground(new Color(255, 255, 255));
		buttonGroup.add(radioButtonVenda);
		radioButtonVenda.setFont(new Font("Arial", Font.PLAIN, 14));
		scrollPane_1.setViewportView(radioButtonVenda);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(24, 142, 286, 47);
		contentPane.add(scrollPane_1_1);
		
		JLabel lblCdigoDeBarras = new JLabel("Código de Barras:");
		lblCdigoDeBarras.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblCdigoDeBarras.setBackground(new Color(0, 64, 0));
		scrollPane_1_1.setColumnHeaderView(lblCdigoDeBarras);
		
		caixaCodigoDeBarras = new JTextField();
		caixaCodigoDeBarras.setBackground(new Color(255, 255, 255));
		caixaCodigoDeBarras.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaCodigoDeBarras.setColumns(10);
		scrollPane_1_1.setViewportView(caixaCodigoDeBarras);
		
		JScrollPane scrollPane_1_1_1 = new JScrollPane();
		scrollPane_1_1_1.setBounds(24, 372, 138, 47);
		contentPane.add(scrollPane_1_1_1);
		
		JLabel lblPreo = new JLabel("Preço R$:");
		lblPreo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblPreo.setBackground(new Color(0, 64, 0));
		scrollPane_1_1_1.setColumnHeaderView(lblPreo);
		
		caixaPreco = new JTextField();
		caixaPreco.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaPreco.setColumns(10);
		scrollPane_1_1_1.setViewportView(caixaPreco);
		
		JScrollPane scrollPane_1_1_1_1 = new JScrollPane();
		scrollPane_1_1_1_1.setBounds(24, 434, 286, 47);
		contentPane.add(scrollPane_1_1_1_1);
		
		JLabel lblQuantidade = new JLabel("Quantidade(Itens):");
		lblQuantidade.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblQuantidade.setBackground(new Color(0, 64, 0));
		scrollPane_1_1_1_1.setColumnHeaderView(lblQuantidade);
		
		caixaQuantidade = new JTextField();
		caixaQuantidade.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaQuantidade.setColumns(10);
		scrollPane_1_1_1_1.setViewportView(caixaQuantidade);
		
		JScrollPane scrollPane_1_1_1_1_1 = new JScrollPane();
		scrollPane_1_1_1_1_1.setBounds(24, 504, 286, 68);
		contentPane.add(scrollPane_1_1_1_1_1);
		
		JLabel lblTotalVendaR = new JLabel("Total Venda R$:");
		lblTotalVendaR.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblTotalVendaR.setBackground(new Color(0, 64, 0));
		scrollPane_1_1_1_1_1.setColumnHeaderView(lblTotalVendaR);
		
		caixaTotalVenda = new JTextField();
		caixaTotalVenda.setFont(new Font("Arial", Font.PLAIN, 25));
		caixaTotalVenda.setColumns(10);
		scrollPane_1_1_1_1_1.setViewportView(caixaTotalVenda);
		
		JScrollPane scrollPane_1_1_1_1_2 = new JScrollPane();
		scrollPane_1_1_1_1_2.setBounds(552, 604, 521, 47);
		contentPane.add(scrollPane_1_1_1_1_2);
		
		caixaNomeCliente = new JTextField();
		caixaNomeCliente.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaNomeCliente.setColumns(10);
		scrollPane_1_1_1_1_2.setViewportView(caixaNomeCliente);
		
		JLabel lblDescontoR = new JLabel("Nome do Cliente");
		scrollPane_1_1_1_1_2.setColumnHeaderView(lblDescontoR);
		lblDescontoR.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblDescontoR.setBackground(new Color(0, 64, 0));
		
		JScrollPane scrollPane_1_1_1_1_3 = new JScrollPane();
		scrollPane_1_1_1_1_3.setBounds(24, 604, 511, 47);
		contentPane.add(scrollPane_1_1_1_1_3);
		
		JLabel lblOperador = new JLabel("Operador:");
		lblOperador.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblOperador.setBackground(new Color(0, 64, 0));
		scrollPane_1_1_1_1_3.setColumnHeaderView(lblOperador);
		
		caixaNomeOperador = new JTextField();
		caixaNomeOperador.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaNomeOperador.setColumns(10);
		scrollPane_1_1_1_1_3.setViewportView(caixaNomeOperador);
		
		JScrollPane scrollPane_1_1_1_1_3_1 = new JScrollPane();
		scrollPane_1_1_1_1_3_1.setBounds(172, 372, 138, 47);
		contentPane.add(scrollPane_1_1_1_1_3_1);
		
		JLabel lblDescontoR_1 = new JLabel("Desconto R$:");
		lblDescontoR_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblDescontoR_1.setBackground(new Color(0, 64, 0));
		scrollPane_1_1_1_1_3_1.setColumnHeaderView(lblDescontoR_1);
		
		caixaDesconto = new JTextField();
		caixaDesconto.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaDesconto.setColumns(10);
		scrollPane_1_1_1_1_3_1.setViewportView(caixaDesconto);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame popUpSair = new JInternalFrame("Sair?");
				popUpSair.setBounds(436, 428, 316, 166);
				contentPane.add(popUpSair);
				popUpSair.getContentPane().setLayout(null);
				popUpSair.setVisible(true);
				JLabel lblDesejaRealmenteSair = new JLabel("Deseja realmente Sair?");
				lblDesejaRealmenteSair.setBounds(48, 10, 208, 22);
				lblDesejaRealmenteSair.setFont(new Font("Arial Black", Font.PLAIN, 15));
				popUpSair.getContentPane().add(lblDesejaRealmenteSair);
				
				JButton btnNo = new JButton("Não");
				btnNo.setFont(new Font("Arial", Font.PLAIN, 15));
				btnNo.setBounds(174, 95, 120, 32);
				popUpSair.getContentPane().add(btnNo);
				btnNo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						popUpSair.setVisible(false);
						
					}
				});
				
				JButton btnSim = new JButton("Sim");
				btnSim.setFont(new Font("Arial", Font.PLAIN, 15));
				btnSim.setBounds(10, 95, 120, 32);
				popUpSair.getContentPane().add(btnSim);
				btnSim.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//Adicionar metodo do controller
						
					}
				});
				
				
			}
		});
		btnSair.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSair.setBounds(964, 661, 120, 32);
		contentPane.add(btnSair);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBorder(UIManager.getBorder("Button.border"));
		btnAdicionar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAdicionar.setBounds(24, 661, 120, 32);
		contentPane.add(btnAdicionar);
		
		JButton btnRemove = new JButton("Remover");
		btnRemove.setFont(new Font("Arial", Font.PLAIN, 15));
		btnRemove.setBounds(162, 661, 120, 32);
		contentPane.add(btnRemove);
	
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("teste");
				
			}
		});
		btnFinalizar.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					btnFinalizar.doClick();

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}	
		});
		btnFinalizar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnFinalizar.setBounds(307, 661, 120, 32);
		contentPane.add(btnFinalizar);
	
		JButton btnBtn_5 = new JButton("Cadastrar Cliente");
		btnBtn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarClienteV c = new CadastrarClienteV();
				c.setVisible(true);
			}
		});
		btnBtn_5.setFont(new Font("Arial", Font.PLAIN, 15));
		btnBtn_5.setBounds(720, 661, 157, 32);
		contentPane.add(btnBtn_5);
		
		JScrollPane scrollPane_1_1_2 = new JScrollPane();
		scrollPane_1_1_2.setBounds(24, 213, 286, 47);
		contentPane.add(scrollPane_1_1_2);
		
		JLabel lblNomeProduto = new JLabel("Nome Produto:");
		lblNomeProduto.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNomeProduto.setBackground(new Color(0, 64, 0));
		scrollPane_1_1_2.setColumnHeaderView(lblNomeProduto);
		
		caixaNomeProduto = new JTextField();
		caixaNomeProduto.setFont(new Font("Arial", Font.PLAIN, 15));
		caixaNomeProduto.setColumns(10);
		scrollPane_1_1_2.setViewportView(caixaNomeProduto);

		long ano = horaAtual.getYear()+1900;
		String data =  checarDia()+"/"+checarMes()+"/"+ano;
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(946, 26, 138, 80);
		contentPane.add(panel);
		
		JLabel Horario = new JLabel("00:00:00");
		Horario.setFont(new Font("Arial", Font.PLAIN, 21));
		
		JLabel DataAtual = new JLabel("Data");
		DataAtual.setFont(new Font("Arial", Font.PLAIN, 21));
		DataAtual.setText(data);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(Horario, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(DataAtual, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(Horario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(DataAtual, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setFont(new Font("Arial Black", Font.PLAIN, 10));
		scrollPane_2.setBounds(364, 142, 568, 277);
		contentPane.add(scrollPane_2);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setRowHeight(25);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Nome", "Valor"
			}
		));
		scrollPane_2.setViewportView(table);
		
		JButton btnInserirTest = new JButton("Inserir Cliente");
		btnInserirTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame internalFrame = new JInternalFrame("Inserir Cliente");
				internalFrame.setVisible(false);
				contentPane.add(internalFrame);
				internalFrame.setBounds(713, 434, 360, 160);
				internalFrame.getContentPane().setLayout(null);
				
				JButton btnNewButton = new JButton("Sair");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						internalFrame.setVisible(false);
					}
				});
				btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
				btnNewButton.setBounds(253, 100, 85, 21);
				internalFrame.getContentPane().add(btnNewButton);
				
				JLabel lblInsiraCpf = new JLabel("Insira CPF:");
				lblInsiraCpf.setFont(new Font("Arial Black", Font.PLAIN, 14));
				lblInsiraCpf.setBackground(new Color(0, 64, 0));
				lblInsiraCpf.setBounds(10, 10, 136, 21);
				internalFrame.getContentPane().add(lblInsiraCpf);
				
				textField_1 = new JTextField();
				textField_1.setBounds(10, 41, 257, 30);
				textField_1.setFont(new Font("Arial", Font.PLAIN,15));
				internalFrame.getContentPane().add(textField_1);
				textField_1.setColumns(10);
				
				JButton btnBtn_4_1 = new JButton("Inserir");
				btnBtn_4_1.setFont(new Font("Arial", Font.PLAIN, 15));
				btnBtn_4_1.setBounds(10, 89, 142, 32);
				internalFrame.getContentPane().add(btnBtn_4_1);
				internalFrame.setVisible(true);
			}
			
		});
		btnInserirTest.setFont(new Font("Arial", Font.PLAIN, 15));
		btnInserirTest.setBounds(552, 661, 138, 32);
		contentPane.add(btnInserirTest);
		
		
		
		
		Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                String formattedDate = dateFormat.format(new Date());
                Horario.setText(formattedDate);
            }
        });
        timer.start();
	}
	long dia = horaAtual.getDate();
	String diaAtual = dia+"";
	
	long mes = horaAtual.getMonth()+1;
	String mesAtual = mes+"";
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	
	public String checarDia() {
		if(diaAtual.length()==1) {
			String diaAtual1 = "0"+diaAtual;
			return diaAtual1;
		}else {
			return diaAtual;
		}
	}
	
	public String checarMes() {
		if(mesAtual.length()==1) {
			 String mesAtual1 = "0"+mesAtual;
			 return mesAtual1;
		}else {
			return mesAtual;
		}
	}
}
