package br.gov.ac.sefaz.App;

import java.util.Random;

public class TestRamdom {
	public static void main(String[] args) {
		Random digito = new Random(0);
		Random gerador = new Random(123);
        //imprime sequência de 10 números inteiros aleatórios
        for (int c = 0; c < 1; c++) {
           // System.out.println("Conta :"+gerador.nextInt()+"-"+digito.nextInt());
        }
        int valor = new Random().nextInt(100) + 1188;
        System.out.println(valor);
	}

}
