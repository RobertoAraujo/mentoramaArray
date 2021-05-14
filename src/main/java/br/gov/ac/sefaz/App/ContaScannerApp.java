package br.gov.ac.sefaz.App;

import java.util.Scanner;

import br.gov.ac.sefaz.cliente.PessoaFisca;
import br.gov.ac.sefaz.cliente.PessoaJuridica;
import br.gov.ac.sefaz.conta.ContaCorrente;
import br.gov.ac.sefaz.conta.ContaSalario;

public class ContaScannerApp {
	public static void main(String[] args) {
		PessoaFisca pessoaF = new  PessoaFisca();
		PessoaJuridica pessoaJ = new PessoaJuridica();
		ContaCorrente corrente =new  ContaCorrente();
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
			System.out.println("Conta Pessoa Fisica");
				System.out.println("Digite o nome ?");
				System.out.println("Idade ?");
				System.out.println("Rg ?");
			break;

		case 2:
			ContaSalario salario1 = new ContaSalario();
			Scanner valor = new Scanner(System.in);
			double val = valor.nextDouble();
			System.out.println("Sacar :");
			salario1.sacarSalario(salario.getSaldo(), val);
			break;
		default:
			break;
		}
		
		entrada.close();
	}
}
