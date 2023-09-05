package Controller;
import View.ConfigViews;
import View.ListaClientesV;
import View.ListarItensV;
import View.ListaProdtV;
import View.ListaFuncV;
import View.MenuAdminV;

public class ListarItensController {
	private ListarItensV view;
	
	public ListarItensController(ListarItensV view) {
		this.view = view;
	}


	public void listarCliente(ConfigViews config) {
		ListaClientesV lc = new ListaClientesV();
		config.ativarConfigPadrao(lc);
		lc.setVisible(true);
		view.dispose();
		
	}
	
	public void listarProduto(ConfigViews config) {
		ListaProdtV lp  = new ListaProdtV();
		config.ativarConfigPadrao(lp);
		lp.setVisible(true);
		view.dispose();
	}
	
	public void listarFuncionario(ConfigViews config) {
		ListaFuncV lf = new ListaFuncV();
		config.ativarConfigPadrao(lf);
		lf.setVisible(true);
		view.dispose();
	}
	public void voltar(ConfigViews config) {
		MenuAdminV md = new MenuAdminV();
		config.ativarConfigPadrao(md);
		md.setVisible(true);
		view.dispose();
	}
}
