package br.gov.ac.sefaz.App;

import java.util.ArrayList;

import br.gov.ac.sefaz.cliente.Cliente;
import br.gov.ac.sefaz.cliente.Produtos;
import br.gov.ac.sefaz.cliente.Venda;

public class ClienteApp {

	public static void main(String[] args) {

		ArrayList<Produtos> produtos = new ArrayList<Produtos>();
		produtos.add(new Produtos(1, "biscoito1", 250));
		produtos.add(new Produtos(2, "biscoito2", 50));
		produtos.add(new Produtos(3, "biscoito3", 20));
		produtos.add(new Produtos(4, "biscoito4", 10));
		produtos.add(new Produtos(5, "biscoito5", 0.25));

		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		cliente.add(new Cliente(1, "Bruno Bolino1"));
		cliente.add(new Cliente(2, "Bruno Bolino2"));
		cliente.add(new Cliente(3, "Bruno Bolino3"));
		cliente.add(new Cliente(4, "Bruno Bolino4"));
		cliente.add(new Cliente(5, "Bruno Bolino5"));
		cliente.add(new Cliente(6, "Bruno Bolino6"));
		cliente.add(new Cliente(7, "Bruno Bolino7"));
		cliente.add(new Cliente(8, "Bruno Bolino8"));
		cliente.add(new Cliente(9, "Bruno Bolino9"));
		cliente.add(new Cliente(10, "Bruno Bolino10"));

		ArrayList<Venda> vend = new ArrayList<Venda>();

		vend.add(new Venda(produtos.get(1), cliente.get(7)));
		vend.add(new Venda(produtos.get(1), cliente.get(7)));
		vend.add(new Venda(produtos.get(2), cliente.get(7)));
		vend.add(new Venda(produtos.get(1), cliente.get(1)));
		vend.add(new Venda(produtos.get(3), cliente.get(1)));
		vend.add(new Venda(produtos.get(3), cliente.get(2)));
		vend.add(new Venda(produtos.get(4), cliente.get(5)));
		vend.add(new Venda(produtos.get(3), cliente.get(7)));
		vend.add(new Venda(produtos.get(4), cliente.get(9)));
		vend.add(new Venda(produtos.get(4), cliente.get(3)));

		//for (Venda venda : vend) {
			//System.out.println(venda.toString());
		//}

		int min = 1000000000, max = 0;
		for (Cliente c : cliente) {
			System.out.println(c.getNome() + " = " + quantidade(vend, c.getId()));
			if (quantidade(vend, c.getId()) < min) {
				min = quantidade(vend, c.getId());
			}
			if (quantidade(vend, c.getId()) > max) {
				max = quantidade(vend, c.getId());
			}

		}

		System.out.println("max = " + max );
		System.out.println("min = " + min );

	}

	public static int quantidade(ArrayList<Venda> vendas, int param) {
		int cont = 0;
		for (Venda venda : vendas) {
			if (venda.cliente.getId() == param) {
				cont++;
			}
		}
		return cont;
	}
	

}
