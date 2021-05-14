package br.gov.ac.sefaz.App;

import java.util.Scanner;

public class ContaScannerApp {
	public static void main(String[] args) {
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
		
		entrada.close();
	}
}
