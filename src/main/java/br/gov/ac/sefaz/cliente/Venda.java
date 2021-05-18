package br.gov.ac.sefaz.cliente;

public class Venda {
	public Produtos produto;
	public Cliente cliente;
	
	public Venda(Produtos produto, Cliente cliente ) {
		this.cliente = cliente;
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto.toString() + ", cliente=" + cliente.toString() + "]";
	}
	
	
	
}
