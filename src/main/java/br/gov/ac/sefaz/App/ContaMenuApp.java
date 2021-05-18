package br.gov.ac.sefaz.App;

import java.util.Random;
import java.util.Scanner;

import br.gov.ac.sefaz.conta.ContaCorrente;
import br.gov.ac.sefaz.conta.ContaSalario;
import br.gov.ac.sefaz.pessoa.Pessoa;
import br.gov.ac.sefaz.pessoa.PessoaFisca;

public class ContaMenuApp {
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
			System.out.println("1 - Conta Corrente");
			System.out.println("2 - Conta Salario");
			System.out.println("3 - Conta Poupança");
			System.out.println("4 - Conta Juridica");
			System.out.println("Tipo de Conta");
			int val = tconta.nextInt();
			switch (val) {
			case 1:
				Scanner CriaConta =new Scanner(System.in);
				System.out.println("**************** Bem Vindo Abra Sua Conta *****************");
				System.out.println("Digite o nome do Titular :");
				String recebNomeConta = CriaConta.next();
				System.out.println("Digite o CPf :");
				String recebCpfConta = CriaConta.next();
				
				int digitoConta = new Random().nextInt(100) + 10;
				int contadousuario = new Random().nextInt(100) + 1188;
		        System.out.println("Nome Do Titular: "+recebNomeConta+"  CPF DO Titular: "+recebCpfConta +" Sua conta CC:"+contadousuario+"-"+digitoConta);
		        
				break;
				
			case 2:
				Scanner CriaConta2 =new Scanner(System.in);
				System.out.println("**************** Bem Vindo Abra Sua Conta *****************");
				System.out.println("Digite o nome do Titular :");
				String recebNomeConta2 = CriaConta2.next();
				System.out.println("Digite o CPf :");
				String recebCpfConta2 = CriaConta2.next();
				
				int digitoConta2 = new Random().nextInt(100) + 10;
				int contadousuario2 = new Random().nextInt(100) + 1188;
		        System.out.println("Nome Do Titular: "+recebNomeConta2+"  CPF DO Titular: "+recebCpfConta2 +" Sua conta CS:"+contadousuario2+"-"+digitoConta2);
				break;

			case 3:
				Scanner CriaConta3 =new Scanner(System.in);
				System.out.println("**************** Bem Vindo Abra Sua Conta *****************");
				System.out.println("Digite o nome do Titular :");
				String recebNomeConta3 = CriaConta3.next();
				System.out.println("Digite o CPf :");
				String recebCpfConta3 = CriaConta3.next();
				
				int digitoConta3 = new Random().nextInt(100) + 10;
				int contadousuario3 = new Random().nextInt(100) + 1188;
		        System.out.println("Nome Do Titular: "+recebNomeConta3+"  CPF DO Titular : "+recebCpfConta3 +" Sua conta CP :"+contadousuario3+"-"+digitoConta3);
				break;
			case 4 :
				Scanner CriaConta4 =new Scanner(System.in);
				System.out.println("**************** Bem Vindo Abra Sua Conta *****************");
				System.out.println("Digite o nome do Titular :");
				String recebNomeConta4 = CriaConta4.next();
				System.out.println("Digite o CNPJ :");
				String recebCpfConta4 = CriaConta4.next();
				
				int digitoConta4 = new Random().nextInt(100) + 10;
				int contadousuario4 = new Random().nextInt(100) + 1188;
		        System.out.println("Nome Do Titular: "+recebNomeConta4+"  CPF DO Titular : "+recebCpfConta4 +" Sua conta CP :"+contadousuario4+"-"+digitoConta4);
				break;

			default:
				if(opcao >= 5) {
					
					System.out.println("opa numero fora da opção :");
				}
				break;
			}

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

			System.out.println(salario1.getSaldo());
			System.out.println("Quanto Deseja Sacar :");
			double valo = valor.nextDouble();
			salario1.sacarSalario(salario1.getSaldo(), valo);
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

			System.out.println(salario2.getSaldo());

			System.out.println("Depositar :");
			double valo2 = valor1.nextDouble();
			salario2.depositarSalario(salario2.getSaldo(), valo2);
			System.out.println(salario2.getSaldo());
			System.out.println("Parabéns pelo seu Depostio !:R$" + salario2.getSaldo());

			valor1.close();
			break;

		case 4:
			Scanner contaEntrada = new Scanner(System.in);
			Scanner nomeEntrada = new Scanner(System.in);
			Scanner idadeEntrada = new Scanner(System.in);
			Scanner rgEntrada = new Scanner(System.in);
			Pessoa pessoa = new Pessoa();
			System.out.println("Conta Pessoa Fisica");
			String CPf = contaEntrada.next();
			System.out.println("Digite o nome ?");
			String nomecont = nomeEntrada.next();
			System.out.println("Idade ?");
			String idade = idadeEntrada.next();
			System.out.println("Rg ?");
			String rg = rgEntrada.next();

			System.out.println(" "+ CPf +" "+ nomecont+" "+ idade+" "+rg);
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

			System.out.println("Saldo da conta Corrente" + corrente5.getSaldo());
			System.out.println("Saldo da conta Salario" + salario5.getSaldo());

			System.out.println("Transferir :");
			double transf = valoor1.nextDouble();
			salario5.transferir(salario5.getSaldo(), transf);

			System.out.println("Saldo da conta Corrente" + (corrente5.getSaldo() + transf));

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
