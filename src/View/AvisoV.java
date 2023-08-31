package View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.SpringLayout;

public class AvisoV extends JFrame {

	private JPanel contentPane;
	private static ConfigViews config = new ConfigViews();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvisoV frame = new AvisoV();
					frame.setVisible(true);
					config.ativarConfigPadrao(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AvisoV() {
		setLocation(new Point(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDadosInseridosIncorretamente = new JLabel("Dados inseridos incorretamente,");
		lblDadosInseridosIncorretamente.setBounds(62, 35, 292, 28);
		lblDadosInseridosIncorretamente.setFont(new Font("Arial Black", Font.PLAIN, 15));
		contentPane.add(lblDadosInseridosIncorretamente);
		
		JLabel lblInformeOsDados = new JLabel("informe os dados novamente");
		lblInformeOsDados.setBounds(84, 65, 247, 28);
		lblInformeOsDados.setFont(new Font("Arial Black", Font.PLAIN, 15));
		contentPane.add(lblInformeOsDados);
		
		JLabel lblOuSaiaDo = new JLabel("ou saia do Sistema:");
		lblOuSaiaDo.setBounds(100, 91, 215, 28);
		lblOuSaiaDo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		contentPane.add(lblOuSaiaDo);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(169, 143, 78, 32);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(btnOk);
	}
}
