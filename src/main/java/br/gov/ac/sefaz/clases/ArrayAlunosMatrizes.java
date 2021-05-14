package br.gov.ac.sefaz.clases;

import java.util.Arrays;
import java.util.List;

public class ArrayAlunosMatrizes {
	public static void main(String[] args) {
		
		List<String> alunos = Arrays.asList
				("Roberto ", "Roney " , "Bruno 0", "Bruno 1 ", "Bruno 2","Bruno 3");
		List<String> ausentes = Arrays.asList
				("Ausente ", "Presente ","Ausente ","Ausente ", "Presente ", "Presente ");
		
		for (String string : alunos) {
			for (int i = 0; i < ausentes.size(); i++) {
				System.out.print(" "+ausentes.get(i));
				System.out.print(string);
			}
		}
		/*
		System.out.println();
		
		Iterator<String> aprovados = ausentes.iterator();
		while (aprovados.hasNext()) {			
			System.out.println(aprovados.next());
		}
		
		System.out.println();
		
		Stream<String> stream = ausentes.stream();
		stream.forEach(System.out::println);
	*/	
		
	}
}
