package br.gov.ac.sefaz.banco;

public class ContaPouPanca extends Conta{

	public double sacarPoupanca(double saldo, double valor) {
		double	resultado = saldo - valor;
		return resultado;
	}
	
	public double DdepositarPoupanca(double saldo, double valor) {
		double	resultado = saldo + valor;
		return resultado;
	}
}
