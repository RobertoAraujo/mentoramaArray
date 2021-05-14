package br.gov.ac.sefaz.App;

import java.util.Scanner;

import br.gov.ac.sefaz.cliente.PessoaFisca;
import br.gov.ac.sefaz.cliente.PessoaJuridica;
import br.gov.ac.sefaz.conta.ContaCorrente;
import br.gov.ac.sefaz.conta.ContaSalario;

public class ContaScannerApp {
	public static void main(String[] args) {
		PessoaFisca pessoaF = new PessoaFisca();
		PessoaJuridica pessoaJ = new PessoaJuridica();
		ContaCorrente corrente = new ContaCorrente();
		ContaSalario salario = new ContaSalario();

		Scanner entrada = new Scanner(System.in);

		System.out.println("***** Banco Mentorama ** R$ **************");
		System.out.println("Menu de Opção para você Cliente amigo !");
		System.out.println(" 1 - Criar Conta ");
		System.out.println(" 2 - Sacar ");
		System.out.println(" 3 - Depositar");
		System.out.println(" 4 - Criar Cliente");
		System.out.println(" 5 - Transferir valores");
		System.out.println(" 6 - Mostrar montante disponivel nas contas");
		System.out.println(" 7 - sair");
		System.out.println(" Escolha a opção desejada :");

		System.out.println("Digita sua Opção : ");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			Scanner tconta = new Scanner(System.in);
			System.out.println("Tipo de Conta");
			int val = tconta.nextInt();
			System.out.println();
			System.out.println(val);
			break;
		case 2:
			Scanner valor = new Scanner(System.in);
			ContaSalario salario1 = new ContaSalario();
			pessoaF.setNome("Roberto Moraes");
			pessoaF.setIdade("30");
			pessoaF.setRg("12134567-8");
			pessoaF.setCpf("000.000.000-00");
			salario1.setAg("1234-5");
			salario1.setConta("0001245-7");
			salario1.setSaldo(258.45);
			
			System.out.println("Sacar :");
			double valo = valor.nextDouble();
			salario1.sacarSalario(salario.getSaldo(), valo);
			System.out.println(salario1.getSaldo());

			valor.close();
			break;
		case 3:
			Scanner valor1 = new Scanner(System.in);
			ContaSalario salario2 = new ContaSalario();
			pessoaF.setNome("Roberto Moraes");
			pessoaF.setIdade("30");
			pessoaF.setRg("12134567-8");
			pessoaF.setCpf("000.000.000-00");
			salario2.setAg("1234-5");
			salario2.setConta("0001245-7");
			salario2.setSaldo(258.45);
			
			System.out.println("Depositar :");
			double valo2 = valor1.nextDouble();
			salario2.depositarSalario(salario.getSaldo(), valo2);
			System.out.println("Parabéns pelo seu Depostio !:R$"+salario2.getSaldo());

			valor1.close();
			break;
		case 4:
			System.out.println("Conta Pessoa Fisica");
			System.out.println("Digite o nome ?");
			System.out.println("Idade ?");
			System.out.println("Rg ?");
			break;

		case 5:

			break;

		case 6:

			break;

		default:
			System.out.println("Sair do programa");
			break;
		}

		entrada.close();
	}
}
