package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.Funcionario;
public class FuncionarioDAO {
	private Connection conn;

	public FuncionarioDAO() {
		this.conn = null;
		String url = "jdbc:mysql://localhost/NomeDoBanco";
		String user = "root";
		String password = "admin";
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão estabelecida");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//methods
	public void cadastrarFuncionario(Funcionario f) {
		
	}
	public void listarFuncionarios() {
		
	}
	public void validarFuncionario(String login, String senha, boolean admin) {
		
	}
	
	
}
