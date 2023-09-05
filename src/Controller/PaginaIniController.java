package Controller;
import View.PaginaInicialV;
import View.AvisoV;
import View.ConfigViews;
import View.MenuFuncV;
import View.MenuAdminV;
import javax.swing.JRadioButton;
import DAO.FuncionarioDAO;
import Model.Funcionario;

public class PaginaIniController {
	private PaginaInicialV view;
	private FuncionarioDAO funcDao;
	private Funcionario func;
	private AvisoV aviso;
	private boolean isAdm;
	private static Funcionario f;
	public PaginaIniController(PaginaInicialV view) {
		this.view = view;
	}
	public void validarUsuario(ConfigViews cf) {
		String login = view.getCaixalogin().getText();
		String senha = String.valueOf(view.getCaixaSenha().getPassword());
		JRadioButton buttonFunc = view.getBtnRadioFunc();
		JRadioButton buttonAdm = view.getBtnRadioAdmin();
		
		if(buttonFunc.isSelected()) {
			isAdm = false;
		}else if(buttonAdm.isSelected()) {
			isAdm = true;
		}
		funcDao = new FuncionarioDAO();
		try {
		if(login.equals(funcDao.validarFuncionario(login, senha, isAdm).getLogin())&&senha.equals(funcDao.validarFuncionario(login, senha, isAdm).getSenha())&&isAdm==false) {
			f = funcDao.validarFuncionario(login, senha, isAdm);
			MenuFuncV mn = new MenuFuncV();
			mn.setVisible(true);
			cf.ativarConfigPadrao(mn);
			this.view.dispose();
			
		}else if(login.equals(funcDao.validarFuncionario(login, senha, isAdm).getLogin())&&senha.equals(funcDao.validarFuncionario(login, senha, isAdm).getSenha())&&isAdm==true) {
			MenuAdminV mnAdm = new MenuAdminV();
			mnAdm.setVisible(true);
			cf.ativarConfigPadrao(mnAdm);
		}
		}catch (Exception e) {
			aviso = new AvisoV();
			aviso.setVisible(true);
			cf.ativarConfigPadrao(aviso);
		}
		
	}
	public Funcionario getF() {
		return f;
	}
	public void setF(Funcionario f) {
		PaginaIniController.f = f;
	}

	
}
