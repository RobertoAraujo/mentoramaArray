package br.gov.ac.sefaz.App;

import br.gov.ac.sefaz.banco.Conta;
import br.gov.ac.sefaz.banco.ContaCorrente;
import br.gov.ac.sefaz.banco.ContaSalario;
import br.gov.ac.sefaz.banco.PessoaFisca;

public class ContaApp {

	public static void main(String[] args) {
		PessoaFisca pessoaF = new  PessoaFisca();
		//PessoaJuridica pessoaJ = new PessoaJuridica();
		Conta conta = new Conta();
		ContaCorrente corrente =new  ContaCorrente();
		ContaSalario salario = new ContaSalario();
		
		pessoaF.setNome("Roberto Moraes");
		pessoaF.setIdade("30");
		pessoaF.setRg("12134567-8");
		pessoaF.setCpf("000.000.000-00");
		corrente.setAg("1234-5");
		corrente.setConta("0001245-7");
		corrente.setSaldo(258.45);
		corrente.depositarCorrente(500.0, corrente.getSaldo());
		
		System.out.println("Dados Conta :"+pessoaF.getNome()+" "+pessoaF.getIdade()+" "+pessoaF.getRg()+" "
		+pessoaF.getCpf());
		System.out.println(" AG: "+corrente.getAg()+" CC: "+corrente.getConta()+" Saldo Atual : R$ "+corrente.getSaldo());

		System.out.println();
		
		pessoaF.setNome("Roberto Araujo");
		pessoaF.setIdade("32");
		pessoaF.setRg("12134567-7");
		pessoaF.setCpf("000.000.000-00");
		salario.setAg("8237-5");
		salario.setConta("0008245-8");
		salario.setSaldo(58.45);
		salario.sacarSalario(salario.getSaldo(), 30.00);
		
		System.out.println("Dados Conta :"+pessoaF.getNome()+" "+pessoaF.getIdade()+" "+pessoaF.getRg()+" "
		+pessoaF.getCpf());
		System.out.println(" AG: "+salario.getAg()+" CC: "+salario.getConta()+" Saldo Atual : R$ "+salario.getSaldo());
		
		System.out.println();
		salario.depositarSalario(750, salario.getSaldo());
		System.out.println("Valor é :"+salario.getSaldo());

		System.out.println();
		System.out.println("inserido ");
		salario.sacarSalario(salario.getSaldo(), 30.00);
		System.out.println("Valor agora é : "+salario.getSaldo());
	}

}
