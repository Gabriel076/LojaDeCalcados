package Model;
public class Loja {
	private String nomeLoja;
	private String cnpj;
	private String endereco;
	
	public Loja() {
		this.nomeLoja = "Loja Test";
		this.cnpj = "34234342-4";
		this.endereco = "Rua Teste";
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
}
