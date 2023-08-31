package Controller;
import View.MenuAdminV;
import View.ConfigViews;
import View.CadastrarProdutoV;
import DAO.ProdutoDAO;
import Model.Produto;
public class CadastrarProdutoController {
	private CadastrarProdutoV view;
	
	public CadastrarProdutoController(CadastrarProdutoV view) {
		this.view = view;
	}

	public void voltar(ConfigViews conf) {
		MenuAdminV mn = new MenuAdminV();
		mn.setVisible(true);
		conf.ativarConfigPadrao(mn);
		view.dispose();
	}
	public void cadastrar() {
		String tipo;
		if(view.getRdbtnAcessrios().isSelected()) {
			tipo = "Acessorio";
		}else if(view.getRdbtnMeia().isSelected()) {
			tipo = "Meias";
		}else if(view.getBntRadioCalcado().isSelected()) {
			tipo = "Calçado";
		}else {
			tipo = "Não Atribuido";
		}
		String nome = view.getCaixaNomeProduto().getText();
		double valor = Double.parseDouble(view.getCaixaPrecoProduto().getText());
		String numeracao = view.getCaixaNumeracao().getText();
		Produto p1 = new Produto(tipo, nome, valor, numeracao);
	}
}
