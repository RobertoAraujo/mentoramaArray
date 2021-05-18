package br.gov.ac.sefaz.conta;

public class ContaSalario extends Conta {

	double resultado;

	public void sacarSalario(double saldo, double valor) {
		if (saldo < valor) {
			System.out.println("Saldo Insuficiente !!");
		}
		if (saldo != saldo && valor < 500) {
			System.out.println("Limite de saque de R$ 250,00 por dia !!");
		} else {
			resultado = (saldo - valor);
			super.setSaldo(resultado);
		}
	}

	public void depositarSalario(double saldo, double valor) {
		if (saldo == valor) {
			System.out.println("cade !!");
		} else {
			resultado = (saldo + valor);
			super.setSaldo(resultado);
		}
	}

	public void transferir(double saldo, double valor) {
		resultado = (saldo - valor);
		super.setSaldo(resultado);

	}

	public void montanteSalario(double saldo, double valor) {
		double montante = 0.70;
		resultado = montante * (saldo - valor);
		super.setSaldo(resultado);

	}

}
