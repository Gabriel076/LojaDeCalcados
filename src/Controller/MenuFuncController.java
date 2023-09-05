package Controller;
import Model.Funcionario;
import View.MenuFuncV;
import View.PaginaInicialV;
import View.ConfigViews;
public class MenuFuncController {
	private MenuFuncV view;
	private PaginaIniController dados = new PaginaIniController(null);
	private ConfigViews confg;
	private Funcionario f;
	public MenuFuncController(MenuFuncV view) {
		this.view = view;
	}
	
	public Funcionario pegarLogin() {
		try {
			f = dados.getF();
			return f;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	public void exibirDados() {
		try {
			view.getCaixaNome().setText(pegarLogin().getNomeFuncionario());
			view.getCaixaIdade().setText(String.valueOf(pegarLogin().getIdade()));
			view.getCaixaCpf().setText(pegarLogin().getCpfFuncionario());
		} catch (Exception e) {
			view.getCaixaNome().setText("null");
			view.getCaixaIdade().setText("null");
			view.getCaixaCpf().setText("null");
		}
		
	}
	public void sair(ConfigViews config) {
		PaginaInicialV p = new PaginaInicialV();
		config.ativarConfigPadrao(p);
		p.setVisible(true);
		view.dispose();
	}
	public void iniciarJornada() {
		//fazer depois
	}
	public void verificar() {
		//fazer depois
	}
	
	
}
