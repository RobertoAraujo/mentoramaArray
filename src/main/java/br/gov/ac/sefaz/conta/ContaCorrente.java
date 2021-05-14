package br.gov.ac.sefaz.conta;

public class ContaCorrente extends Conta {
	double resultado;
	public void sacarCorrente(double saldo, double valor) {
		if (saldo >= valor) {
			resultado = (saldo - valor);
			super.setSaldo(resultado);
		} else {
			System.out.println("Sem saldo tente outro valor");
		}
	}

	public void depositarCorrente(double saldo, double valor) {
		if (saldo == valor) {
			System.out.println("cade !!");
		} else {
			resultado = (saldo + valor);
			super.setSaldo(resultado);
		}
	}
}
