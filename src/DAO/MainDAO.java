package DAO;

import Model.*;
import java.util.Scanner;
public class MainDAO {

	public static void main(String[] args) {
		ClienteDAO c = new ClienteDAO();
		CompraDAO a = new CompraDAO();
		FuncionarioDAO f = new FuncionarioDAO();
		boolean teste;
		//NotaFiscalDAO nf = new NotaFiscalDAO();
		//ProdutoDAO pd = new ProdutoDAO();
		
		//Cliente c1 = new Cliente("123.123.333-04", "Gabriel", "gabriel@gmail.com");
		//c.cadastrarCliente(c1);
		//f.validarFuncionario("111", "222", false);

		teste = true;
		if(teste==false) {
			System.out.println("Certo");
		}else {
			System.out.println("errado");
		}
	}

}
