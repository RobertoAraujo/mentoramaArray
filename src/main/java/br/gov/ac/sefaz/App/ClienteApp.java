package br.gov.ac.sefaz.App;

import java.util.ArrayList;

import br.gov.ac.sefaz.cliente.Cliente;
import br.gov.ac.sefaz.cliente.Produtos;

public class ClienteApp {

	public static void main(String[] args) {
		Cliente clientes = new  Cliente();
		Produtos produts = new Produtos();
		ArrayList<Produtos> produtos = new ArrayList<Produtos>();
		
		clientes.setId(1);
		clientes.setNome("Roberto Moraes0  ");
		produts.setNome("Biscoito nestle0");
		produts.setValor(6.50);
		
		System.out.println(clientes.getNome() + produts.getNome() +" R$ "+produts.getValor());
		
		
		Cliente clientes1 = new  Cliente();
		Produtos produts1 = new Produtos();
		clientes1.setId(2);
		clientes1.setNome("Roberto Moraes1  ");
		produts1.setId(2);
		produts1.setNome("Biscoito nestle1");
		produts1.setValor(0.55);
	
		
		System.out.println(clientes1.getNome() + produts1.getNome() +" R$ "+produts1.getValor());
		
		Cliente clientes2 = new  Cliente();
		Produtos produts2 = new Produtos();
		clientes2.setId(2);
		clientes2.setNome("Roberto Moraes2  ");
		produts2.setId(2);
		produts2.setNome("Biscoito nestle2");
		produts2.setValor(5.50);
		
		System.out.println(clientes2.getNome() + produts2.getNome() +" R$ "+produts2.getValor());

	}

}
