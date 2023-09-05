package Controller;
import View.ConfigViews;
import View.ListaClientesV;
import View.ListarItensV;

import javax.swing.table.DefaultTableModel;

import DAO.ClienteDAO;

public class ListaClientesController {
	private ListaClientesV view;

	public ListaClientesController(ListaClientesV view) {
		this.view = view;
	}
	
	public void listarClientes() {
		ClienteDAO cd = new ClienteDAO();
		DefaultTableModel tabela = (DefaultTableModel)view.getTable().getModel();
		for(int i=0;i<cd.listarClientes().size();i++) {
			Object [] valores = {cd.listarClientes().get(i).getCpfCliente(), cd.listarClientes().get(i).getNomeCliente(),cd.listarClientes().get(i).getEmailCliente()};			
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
