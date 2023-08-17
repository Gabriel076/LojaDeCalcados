package Model;
public class NotaFiscal {
	private Loja loja;
	private Compra compra;
	private Funcionario operador;
	private Cliente cliente;
	
	public NotaFiscal(Loja loja, Compra compra, Funcionario operador, Cliente cliente) {
		this.loja = loja;
		this.compra = compra;
		this.operador = operador;
		this.cliente = cliente;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Funcionario getOperador() {
		return operador;
	}

	public void setOperador(Funcionario operador) {
		this.operador = operador;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void emitirNota() {
		System.out.println("=====testando nota:=====");
		System.out.println("Horario da Compra "+compra.getHorarioCompra());
		System.out.println("data da compra: "+compra.getDataCompra());
		System.out.println("Cliente: "+cliente.getNomeCliente());
		System.out.println("Operador: "+operador.getNomeFuncionario());
		for(int i=0;i<compra.getProdutosComprados().size();i++) {
			System.out.println("Produto: "+compra.getProdutosComprados().get(i).getNomeProduto()+"   valor: "+compra.getProdutosComprados().get(i).getPreco());
		}
		System.out.println("total: "+compra.realizarCompra());
		System.out.println("CPF do cliente: "+cliente.getCpfCliente());
	}
	
}
