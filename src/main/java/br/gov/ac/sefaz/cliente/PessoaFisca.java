package br.gov.ac.sefaz.cliente;

import java.util.Objects;

public class PessoaFisca extends Pessoa{
	String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cpf);
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
		PessoaFisca other = (PessoaFisca) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return "PessoaFisca [cpf=" + cpf + "]";
	}

	
}
