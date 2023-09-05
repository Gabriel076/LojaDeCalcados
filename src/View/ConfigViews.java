package View;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;

public class ConfigViews {
	public void desativarMaximacao(JFrame frame) {
		frame.setResizable(false);
	}

	public void centralizarJanela(JFrame frame) {
           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	       int x = (screenSize.width - frame.getWidth()) / 2;
	       int y = (screenSize.height - frame.getHeight()) / 2;
	       frame.setLocation(x, y);
	}

	public void ativarConfigPadrao(JFrame frame) {
		centralizarJanela(frame);
		desativarMaximacao(frame);
	}
	public JFormattedTextField mascara(String formato,JFormattedTextField jFormattedTextField) {
		MaskFormatter mascara;
		try {
			mascara = new MaskFormatter(formato);
			return new JFormattedTextField(mascara);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}

	}
	public void inserirImagem() {
		
	}

}
