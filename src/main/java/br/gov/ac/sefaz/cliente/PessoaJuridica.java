package br.gov.ac.sefaz.cliente;

import java.util.Objects;

public class PessoaJuridica extends Pessoa{
	String nome;
	String cnpj;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cnpj, nome);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "PessoaJuridica [nome=" + nome + ", cnpj=" + cnpj + "]";
	}
	
	
}
