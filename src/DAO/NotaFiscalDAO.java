package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NotaFiscalDAO {
	private Connection conn;

	public NotaFiscalDAO() {
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
	
	

}
