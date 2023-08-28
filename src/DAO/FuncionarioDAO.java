package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Funcionario;
import Model.Produto;
public class FuncionarioDAO {
	private Connection conn;

	public FuncionarioDAO() {
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
	public boolean cadastrarFuncionario(Funcionario f) {
		String sql = "INSERT INTO Funcionario(cpfFunc,nome,adm,idade,login,senha) VALUES(?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, f.getCpfFuncionario());
			ps.setString(2, f.getNomeFuncionario());
			ps.setBoolean(3, f.isAdmin());
			ps.setInt(4, f.getIdade());
			ps.setString(5, f.getLogin());
			ps.setString(6, f.getSenha());
			ps.execute();
			
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean excluirFuncionario(String cpfFunc) {
		String sql = "DELETE FROM Funcionario WHERE cpfFunc = ?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cpfFunc);
			ps.execute();
			
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean validarFuncionario(String login, String senha, boolean admin) {
		String sql = "SELECT * FROM Funcionario WHERE login = '?' and senha = '?' and adm = ?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			ps.setBoolean(3, admin);
			ps.execute();
			
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public Funcionario buscarFuncionario(String cpf) {
		String sql = "SELECT * FROM Funcionario WHERE cpf=?";
		 
		 try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String nome = rs.getString("nome");
				String cpfFunc = rs.getString("cpfFunc");
				int idade = rs.getInt("idade");
				String login = rs.getString("login");
				String senha = rs.getString("senha");
				boolean admin = rs.getBoolean("adm");
				Funcionario func = new Funcionario(nome,cpfFunc,idade,login,senha,admin);
				return func;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Funcionario> listarFuncionarios() {
		ArrayList<Funcionario> funcionariosCadastrados = new ArrayList<Funcionario>();
		String sql = "SELECT * FROM Funcionario";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String nome = rs.getString("nome");
				String cpfFunc = rs.getString("cpfFunc");
				int idade = rs.getInt("idade");
				String login = rs.getString("login");
				String senha = rs.getString("senha");
				boolean admin = rs.getBoolean("adm");
				Funcionario func = new Funcionario(nome,cpfFunc,idade,login,senha,admin);
				funcionariosCadastrados.add(func);
			}
			return funcionariosCadastrados;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
