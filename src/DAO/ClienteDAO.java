package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Cliente;
import Model.Funcionario;
public class ClienteDAO {
	private Connection conn;

	public ClienteDAO() {
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
	public boolean cadastrarCliente(Cliente c) {
		String sql = "INSERT INTO Cliente(cpfClient,nome,email) VALUES(?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,c.getCpfCliente());
			ps.setString(2,c.getNomeCliente());
			ps.setString(3,c.getEmailCliente());
			ps.execute();
			
			System.out.println("item cadastrado com sucesso");
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean excluirCliente(String cpf) {
		String sql = "DELETE FROM Cliente WHERE cpfClient = ?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cpf);
			ps.execute();
			
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	

	public Cliente buscarClientes(String cpf) {
		String sql = "SELECT * FROM Cliente WHERE cpfClient=?";
		 
		 try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				String cpfClient = rs.getString("cpfClient");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				Cliente client = new Cliente(cpfClient,nome,email);
				return client;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Cliente> listarClientes() {
		
		ArrayList<Cliente> clientesCadastrados = new ArrayList<Cliente>();
		String sql = "SELECT * FROM Cliente";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String cpfClient = rs.getString("cpfClient");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				Cliente client = new Cliente(cpfClient,nome,email);
				clientesCadastrados.add(client);
			}
			return clientesCadastrados;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
