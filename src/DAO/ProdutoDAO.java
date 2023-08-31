package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Funcionario;
import Model.Produto;
public class ProdutoDAO {
	private Connection conn;
	//private Produto produto;
	
	public ProdutoDAO() {
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
	public boolean cadastrarProduto(Produto p) {
		String sql = "INSERT INTO Produto(tipo,nomeProduto,preco,numerecao) VALUES(?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getTipo());
			ps.setString(2, p.getNomeProduto());
			ps.setDouble(3, p.getPreco());
			ps.setString(4, p.getNumeracao());
			ps.execute();
			System.out.println("item cadastrado com sucesso");
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean excluirProduto(String idProduto) {
		String sql = "DELETE FROM Produto WHERE idProduto = ?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, idProduto);
			ps.execute();
			
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Produto buscarProduto(String idProduto) {
		String sql = "SELECT * FROM Produto WHERE idProduto=?";
		 
		 try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, idProduto);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int idprod = rs.getInt("idProduto");
				String tipo = rs.getString("tipo");
				String nome = rs.getString("nomeProduto");
				double valor = rs.getDouble("preco");
				String numeracao = rs.getString("numeracao");
				Produto produt = new Produto(tipo,nome,valor,numeracao);
				produt.setIdProduto(idprod);
				return produt;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Produto> listarProduto() {
			ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
			String sql = "SELECT * FROM Produto";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					int idprod = rs.getInt("idProduto");
					String tipo = rs.getString("tipo");
					String nome = rs.getString("nomeProduto");
					double valor = rs.getDouble("preco");
					String numeracao = rs.getString("numeracao");
					Produto produt = new Produto(tipo,nome,valor,numeracao);
					produt.setIdProduto(idprod);
					produtosCadastrados.add(produt);
				}
				return produtosCadastrados;
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
	}
}
