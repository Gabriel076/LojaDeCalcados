package Controller;
import View.MenuAdminV;
import View.ConfigViews;
import View.CadastrarProdutoV;

import javax.swing.JRadioButton;

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
		JRadioButton btnAcessorios = view.getRdbtnAcessrios();
		JRadioButton btnMeia = view.getRdbtnMeia();
		JRadioButton btnCalcado = view.getBntRadioCalcado();
		
		try {
			if(btnAcessorios.isSelected()) {
				tipo = "Acessorio";
			}else if(btnMeia.isSelected()) {
				tipo = "Meias";
			}else if(btnCalcado.isSelected()) {
				tipo = "Calçado";
			}else {
				tipo = "Não Atribuido";
			}
			String nome = view.getCaixaNomeProduto().getText();
			double valor = Double.parseDouble(view.getCaixaPrecoProduto().getText());
			String numeracao = view.getCaixaNumeracao().getText();
			Produto p1 = new Produto(tipo, nome, valor, numeracao);
			ProdutoDAO pd = new ProdutoDAO();
			pd.cadastrarProduto(p1);
			view.getTextResult().setText("Produto Cadastrado!");
		} catch (Exception e) {
			view.getTextResult().setText("Dados incorretos!");
		}
		
	}
}
