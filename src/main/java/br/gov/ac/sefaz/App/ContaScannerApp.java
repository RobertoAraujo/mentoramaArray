package br.gov.ac.sefaz.App;

import java.util.Scanner;

import br.gov.ac.sefaz.cliente.Pessoa;
import br.gov.ac.sefaz.cliente.PessoaFisca;
import br.gov.ac.sefaz.conta.ContaCorrente;
import br.gov.ac.sefaz.conta.ContaSalario;

public class ContaScannerApp {
	public static void main(String[] args) {
		PessoaFisca pessoaF = new PessoaFisca();
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
			System.out.println(salario.getSaldo());
			System.out.println("Parabéns pelo seu Depostio !:R$"+salario2.getSaldo());

			valor1.close();
			break;
			
		case 4:
			Pessoa pessoa = new Pessoa();
			System.out.println("Conta Pessoa Fisica");
			System.out.println("Digite o nome ?");
			System.out.println("Idade ?");
			System.out.println("Rg ?");
			
			System.out.println(pessoa.getNome()+ pessoa.getIdade()+ pessoa.getRg());
			break;

		case 5:
			Scanner valoor1 = new Scanner(System.in);
			ContaCorrente corrente5 = new ContaCorrente();
			ContaSalario salario5 = new ContaSalario();
			pessoaF.setNome("Roberto Moraes");
			pessoaF.setIdade("30");
			pessoaF.setRg("12134567-8");
			pessoaF.setCpf("000.000.000-00");
			corrente5.setAg("1234-5");
			corrente5.setConta("0001245-7");
			corrente5.setSaldo(58.45);
			
			pessoaF.setNome("Roberto Moraes");
			pessoaF.setIdade("30");
			pessoaF.setRg("12134567-8");
			pessoaF.setCpf("000.000.000-00");
			salario5.setAg("1234-5");
			salario5.setConta("0001245-7");
			salario5.setSaldo(58.45);
			
			System.out.println("Saldo da conta Corrente"+corrente5.getSaldo());
			System.out.println("Saldo da conta Salario"+salario5.getSaldo());
			
			System.out.println("Transferir :");
			double transf = valoor1.nextDouble();
			salario5.transferir(salario5.getSaldo(), transf);
			
			System.out.println("Saldo da conta Corrente"+ (corrente5.getSaldo()+ transf));
			
			
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
