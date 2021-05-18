package br.gov.ac.sefaz.execao;

public class TratamentoErro {

	public static void main(String[] args) {
		
		int [] veotr = new int[4];
		
		try {
			veotr[4] = 10;			
			System.out.println("Trata !");
			System.out.println("Imprime essa bagaça ai !!!!!!!");
		} catch (ArrayIndexOutOfBoundsException Exception) {
			System.out.println("Erro de Exceção chara !!!!!!!");
		}
		
	}

}
