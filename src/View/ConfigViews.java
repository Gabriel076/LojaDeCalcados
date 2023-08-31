package View;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
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
	public void mascaraCpf() {
		
	}

}
