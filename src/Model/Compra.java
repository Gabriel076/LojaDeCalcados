package Model;
import java.util.ArrayList;
import java.util.Date;

public class Compra {
	private Cliente cliente;
	private Funcionario funcionario;
	private ArrayList<Produto> produtosComprados;
	private NotaFiscal comprovante;
	private String opcaoPagamento;
	private Date horaAtual;
	private double desconto;
	
	public Compra(Cliente cliente, Funcionario funcionario) {
		this.horaAtual = new Date();
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.desconto = desconto;
		this.produtosComprados = new ArrayList<Produto>();
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getOpcaoPagamento() {
		return opcaoPagamento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public ArrayList<Produto> getProdutosComprados() {
		return produtosComprados;
	}

	public void setProdutosComprados(ArrayList<Produto> produtosComprados) {
		this.produtosComprados = produtosComprados;
	}

	public NotaFiscal getComprovante() {
		return comprovante;
	}

	public void setComprovante(NotaFiscal comprovante) {
		this.comprovante = comprovante;
	}
	
	public void escolherPagamento(String opcao){
		this.opcaoPagamento = opcao;
	}
	
	public String getHorarioCompra() {
		long hora = horaAtual.getHours();
		long min = horaAtual.getMinutes();
		String horario = hora+":"+min;
		
		return horario;
	}
	public String getDataCompra() {
		long dia = horaAtual.getDate();
		long mes = horaAtual.getMonth()+1;
		long ano = horaAtual.getYear()+1900;
		
		return dia+"/"+mes+"/"+ano;
	}
	
	//Add e remove produtos da compra
	public void addProduto(Produto p) {
		this.produtosComprados.add(p);
	}
	public void removeProduto(Produto p) {
		this.produtosComprados.remove(p);
	}
	
	public double realizarCompra() {
		double valorC = 0.0;
		for(int i=0;i<produtosComprados.size();i++) {
			valorC += produtosComprados.get(i).getPreco();
		}
		return valorC;
	}
	
}
