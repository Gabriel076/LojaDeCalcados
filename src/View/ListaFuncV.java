package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import Controller.ListaFuncController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaFuncV extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static ConfigViews config = new ConfigViews();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaFuncV frame = new ListaFuncV();
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
	public ListaFuncV() {
		ListaFuncController lf = new ListaFuncController(this);
		setTitle("Listar Funcionários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 39, 537, 648);
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setFont(new Font("Arial Black", Font.PLAIN, 10));
		scrollPane_2.setBounds(10, 88, 514, 277);
		panel.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CPF", "Nome", "Idade", "Login", "Senha"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(115);
		lf.listarFuncionario();
		table.setRowHeight(25);
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setViewportView(table);
		
		JLabel lblCliente = new JLabel("Funcionário");
		lblCliente.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblCliente.setBounds(22, 10, 228, 22);
		panel.add(lblCliente);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lf.voltar(config);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(10, 604, 120, 32);
		panel.add(btnVoltar);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}
