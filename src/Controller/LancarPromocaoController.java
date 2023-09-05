package Controller;
import View.ConfigViews;
import View.LancarPromocaoV;
import Model.Produto;
import View.MenuAdminV;

import javax.swing.table.DefaultTableModel;

import DAO.ProdutoDAO;

public class LancarPromocaoController {
	private LancarPromocaoV view;
	private ProdutoDAO pd;
	private Produto p1;
	public LancarPromocaoController(LancarPromocaoV view) {
		this.view = view;
	}

	public Produto buscarProduto() {
		try {
			pd = new ProdutoDAO();
			String id = view.getCaixaIdProduto().getText();
			p1 = pd.buscarProduto(id);
			view.getRespost().setText("");
			view.getCaixaNome().setText(p1.getNomeProduto());
			view.getCaixaPreco().setText(String.valueOf(p1.getPreco()));
			return p1;
		} catch (Exception e) {
			view.getRespost().setText("Produto não encontrado!");
			return null;
		
		}
	}
	public void adicionarProduto() {
		Object[] dados = {buscarProduto().getIdProduto(), buscarProduto().getNomeProduto(), buscarProduto().getTipo(), buscarProduto().getPreco(), view.getValorDesc().getText()};
		DefaultTableModel tabela = (DefaultTableModel)view.getTable().getModel();
		tabela.addRow(dados);
	
	}
	public void voltar(ConfigViews config) {
		MenuAdminV md = new MenuAdminV();
		config.ativarConfigPadrao(md);
		md.setVisible(true);
		view.dispose();
	}
}
