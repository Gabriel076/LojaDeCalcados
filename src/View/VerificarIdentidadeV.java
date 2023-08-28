package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VerificarIdentidadeV extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificarIdentidadeV frame = new VerificarIdentidadeV();
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
	public VerificarIdentidadeV() {
		setTitle("Verificar identidade");
		setBounds(100, 100, 425, 282);
		getContentPane().setLayout(null);
		
		JLabel lblVerifiqueSuaIdentidade = new JLabel("Verifique sua identidade:");
		lblVerifiqueSuaIdentidade.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblVerifiqueSuaIdentidade.setBounds(93, 10, 228, 22);
		getContentPane().add(lblVerifiqueSuaIdentidade);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnConfirmar.setBounds(26, 211, 120, 32);
		getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCancelar.setBounds(266, 211, 120, 32);
		getContentPane().add(btnCancelar);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(26, 86, 202, 24);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(26, 153, 202, 24);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(26, 120, 210, 23);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Login:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(26, 53, 210, 23);
		getContentPane().add(lblNewLabel_1_1_1);

	}
}
