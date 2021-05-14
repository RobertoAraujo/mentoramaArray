package br.gov.ac.sefaz.clases;

import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(); Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		List<Aluno> ausentes = Arrays.asList(aluno, aluno2, aluno3);
		
		aluno.status = " Ausente ";
		aluno.Data = " 2021-05-14";
		aluno.nome = "Bruno ";
		
		aluno2.status = " Presente ";
		aluno2.Data = " 2021-05-01";
		aluno2.nome = "Roberto ";
		
		aluno3.status = " Ausente ";
		aluno3.Data = " 2021-05-01";
		aluno3.nome = "Luiz ";
		
		for (Aluno alun : ausentes) {
			System.out.println(alun.toString());
		}
	
		
	}
	


}
