package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Produto;
public class ProdutoDAO {
	private Connection conn;
	//private Produto produto;
	
	public ProdutoDAO() {
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
	public void cadastrarProduto(Produto p) {
		
	}
	
	public void excluirProduto() {
		
	}
	
	public void buscarProduto() {
		
	}
	public void listarProduto() {
		
	}
}
