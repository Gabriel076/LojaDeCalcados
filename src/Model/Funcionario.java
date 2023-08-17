package Model;

public class Funcionario {
	private String cpfFuncionario;
	private String nomeFuncionario;
	private int idade;
	private String login;
	private String senha;
	private boolean admin;
	
	public Funcionario(String cpfFuncionario, String nomeFuncionario, int idade, String login, String senha,boolean admin) {
		this.cpfFuncionario = cpfFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.idade = idade;
		this.login = login;
		this.senha = senha;
		this.admin = admin;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
