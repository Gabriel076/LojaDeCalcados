package Controller;
import View.ConfigViews;
import View.ListaProdtV;
import View.ListarItensV;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import DAO.ProdutoDAO;
import Model.Produto;

public class ListaProdtController {
	private ListaProdtV view;
	private ArrayList<Produto> produtos;

	public ListaProdtController(ListaProdtV view) {
		this.view = view;
	}
	public void listar() {
		ProdutoDAO p = new ProdutoDAO();
		produtos = p.listarProduto();
		DefaultTableModel tabela = (DefaultTableModel)view.getTable().getModel();
		for(int i=0;i<produtos.size();i++) {
			Object [] valores = {produtos.get(i).getIdProduto(), produtos.get(i).getNomeProduto(), produtos.get(i).getTipo(), produtos.get(i).getNumeracao(), produtos.get(i).getPreco()};		
			tabela.addRow(valores);
		}
	}
	public void voltar(ConfigViews config) {
		ListarItensV li = new ListarItensV();
		config.ativarConfigPadrao(li);
		li.setVisible(true);
		view.dispose();
		
	}
	
	
}
