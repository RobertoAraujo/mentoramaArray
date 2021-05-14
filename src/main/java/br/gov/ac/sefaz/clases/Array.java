package br.gov.ac.sefaz.clases;

import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		List<Aluno> ausentes = Arrays.asList(aluno, aluno2, aluno3);
		
		aluno.status = " Ausente";
		aluno.nome = "Bruno";
		
		aluno2.status = " Presente";
		aluno2.nome = "Roberto";
		
		aluno3.status = " Ausente";
		aluno3.nome = "Luiz";
		
		
		for (Aluno alun : ausentes) {
			System.out.println(alun.toString());
		}
		
		System.out.println();
	
		
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
