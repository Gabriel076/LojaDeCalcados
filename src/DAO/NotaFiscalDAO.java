package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.NotaFiscal;
import Model.Compra;
public class NotaFiscalDAO {
	private Connection conn;

	public NotaFiscalDAO() {
		this.conn = null;
		String url = "jdbc:mysql://localhost/LojaDeCalcados";
		String user = "root";
		String password = "admin";
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão estabelecida");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean cadastrarNota(NotaFiscal nf) {
		String sql = "INSERT INTO NotaFiscal(idCompra,cpfClient,cpfFunc) VALUES(?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, nf.getCompra().getIdCompra());
			ps.setString(2, nf.getCliente().getCpfCliente());
			ps.setString(3, nf.getOperador().getCpfFuncionario());
			ps.execute();
			
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	

}
