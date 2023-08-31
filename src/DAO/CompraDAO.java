package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Compra;
public class CompraDAO {
	private Connection conn;
	private Compra compra;
	
	public CompraDAO() {
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
	
	//methods
	public boolean cadastrarCompra(Compra c) {
		String sql = "INSERT INTO Compra(cpfClient,cpfFunc,hora,valorTotal,desconto) VALUES(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getCliente().getCpfCliente());
			ps.setString(2, c.getFuncionario().getCpfFuncionario());
			ps.setString(3, c.getDataCompra());
			ps.setDouble(4, c.getValorC());
			ps.setDouble(5, c.getDesconto());
			ps.execute();
			System.out.println("item cadastrado com sucesso");
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
