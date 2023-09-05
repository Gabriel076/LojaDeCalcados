package Controller;
import View.ConfigViews;
import View.ListaFuncV;
import View.ListarItensV;
import javax.swing.table.DefaultTableModel;
import DAO.FuncionarioDAO;

public class ListaFuncController {
	private ListaFuncV view;

	public ListaFuncController(ListaFuncV view) {
		this.view = view;
	}
	
	public void listarFuncionario() {
		FuncionarioDAO f = new FuncionarioDAO();
		DefaultTableModel tabela = (DefaultTableModel)view.getTable().getModel();
		for(int i=0;i<f.listarFuncionarios().size();i++) {
			Object [] valores = {f.listarFuncionarios().get(i).getCpfFuncionario(),f.listarFuncionarios().get(i).getNomeFuncionario(),f.listarFuncionarios().get(i).getIdade(),f.listarFuncionarios().get(i).getLogin(),f.listarFuncionarios().get(i).getSenha() };	
			tabela.addRow(valores);
		}
		
	}
	
	public void voltar(ConfigViews config) {
		ListarItensV md = new ListarItensV();
		config.ativarConfigPadrao(md);
		md.setVisible(true);
		view.dispose();
	}
	
	
}
