package Controller;
import View.CadastrarFuncionarioV;
import View.MenuAdminV;
import View.ConfigViews;
import java.sql.SQLIntegrityConstraintViolationException;
import DAO.FuncionarioDAO;
import Model.Funcionario;

public class CadastrarFuncController {
	private CadastrarFuncionarioV view;
	private boolean adm;
	private static ConfigViews config = new ConfigViews();

	public CadastrarFuncController(CadastrarFuncionarioV view) {
		this.view = view;
	}
	
	public void voltar(ConfigViews conf) {
		MenuAdminV mn = new MenuAdminV();
		conf.ativarConfigPadrao(mn);
		mn.setVisible(true);
		view.dispose();
	}
	public void cadastrar() throws SQLIntegrityConstraintViolationException{
		try {
			String cpf = view.getCaixaCpf().getText();
			String nome = view.getCaixaNome().getText();
			int idade = Integer.parseInt(view.getCaixaIdade().getText());
			String login = view.getCaixaLogin().getText();
			String senha = view.getCaixaSenha().getText();
			
			if(view.getBntRadioAdm().isSelected()) {
				adm=true;
			}else if(view.getRdbtnOperador().isSelected()) {
				adm=false;
			}
			
			Funcionario f1 = new Funcionario(cpf, nome, idade, login, senha, adm);
			FuncionarioDAO fd = new FuncionarioDAO();
			fd.cadastrarFuncionario(f1);
			view.getSituacao().setText("Funcionario Cadastrado!");	
			
		} catch (Exception e) {
			view.getSituacao().setText("Dados incorretos!");	
		}
		}
		
	
}
