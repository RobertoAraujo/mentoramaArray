package br.gov.ac.sefaz.cliente;

import java.io.Serializable;
import java.util.Objects;

public class Produtos implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	int id;
	String nome;
	double valor;
	
	
	
	public Produtos(int id, String nome, double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return id == other.id && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	@Override
	public String toString() {
		return "Produtos [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
	}
	
	
}
