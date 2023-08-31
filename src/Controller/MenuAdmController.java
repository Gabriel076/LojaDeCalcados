package Controller;
import View.ConfigViews;
import View.PaginaInicialV;
import View.MenuAdminV;
import View.CadastrarProdutoV;
import View.CadastrarFuncionarioV;
import View.LancarPromocaoV;
import View.ListarItensV;

public class MenuAdmController {
	private MenuAdminV view;

	public MenuAdmController(MenuAdminV view) {
		this.view = view;
	}
	
	
	public void sair(ConfigViews conf) {
		 PaginaInicialV pgInit =new PaginaInicialV();
		 pgInit.setVisible(true);
		 conf.ativarConfigPadrao(pgInit);
		 view.dispose();
	}
	public void cadastrarFunc(ConfigViews conf) {
		CadastrarFuncionarioV cadsFunc = new CadastrarFuncionarioV();
		cadsFunc.setVisible(true);
		conf.ativarConfigPadrao(cadsFunc);
		view.dispose();
	}
	public void cadastrarProd(ConfigViews conf) {
		CadastrarProdutoV cadsProd = new CadastrarProdutoV();
		cadsProd.setVisible(true);
		conf.ativarConfigPadrao(cadsProd);
		view.dispose();
	}
	public void lancarProm(ConfigViews conf) {
		LancarPromocaoV lancar = new LancarPromocaoV();
		lancar.setVisible(true);
		conf.ativarConfigPadrao(lancar);
		view.dispose();
	}
	public void listar(ConfigViews conf) {
		ListarItensV listar = new ListarItensV();
		listar.setVisible(true);
		conf.ativarConfigPadrao(listar);
		view.dispose();
	}
}
