package Model;

public class Main {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("123-4","gabriel",18,"login","senha",true);
		Cliente clt = new Cliente("123-5","julia","julia10fernandes@gmail.com");
		
		
		Produto p1 = new Produto("calçado","tênis addidas",150.0,"41");
		Produto p2 = new Produto("calçado","tênis nike",200.0,"42");
		Produto p3 = new Produto("meia","meia nike",20.5,"p");
		
	Loja loja = new Loja();
	
		
		Compra c = new Compra(clt,f);
		c.addProduto(p1);
		c.addProduto(p2);
		c.addProduto(p3);
		NotaFiscal nota = new NotaFiscal(loja,c,f,clt);
		nota.emitirNota();
	}
}
