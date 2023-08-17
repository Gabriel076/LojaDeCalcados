package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ClienteDAO {
	private Connection conn;

	public ClienteDAO() {
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
	public void cadastrarCliente() {
		
	}
	public void listarClientes() {
		
	}
	public void buscarClientes(String cpf) {
		
	}
	
	
}
