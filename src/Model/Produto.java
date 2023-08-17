package Model;

public class Produto {
	private String tipo;
	private String nomeProduto;
	private double preco;
	private String numeracao;
	
	public Produto(String tipo, String nomeProduto, double preco, String numeracao) {
		this.tipo = tipo;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.numeracao = numeracao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}
	
	
}
