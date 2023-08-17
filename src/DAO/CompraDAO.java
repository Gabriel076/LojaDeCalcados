package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.Compra;
public class CompraDAO {
	private Connection conn;
	private Compra compra;
	
	public CompraDAO() {
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
	public void cadastrarCompra() {
		
	}
}
