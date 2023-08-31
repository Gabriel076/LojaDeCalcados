package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

public class ListaClientesV extends JFrame {

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
					ListaClientesV frame = new ListaClientesV();
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
	public ListaClientesV() {
		setTitle("Listar Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(38, 30, 537, 648);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setFont(new Font("Arial Black", Font.PLAIN, 10));
		scrollPane_2.setBounds(10, 88, 514, 277);
		panel.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"CPF", "Nome", "Email"
			}
		));
		table.setRowHeight(25);
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setViewportView(table);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblCliente.setBounds(22, 10, 228, 22);
		panel.add(lblCliente);
	}
}
