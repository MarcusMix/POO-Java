package exerciciosString;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.next();
		System.out.println("Informe o termo de busca: ");
		String termo = teclado.next();
		
		
		System.out.println("O número de caracteres é: " + palavra.length());
		System.out.println("Palavra em caixa alta: " + palavra.toUpperCase());
		
		int quantidadeVogal = 0;
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.substring(i, i+1).toUpperCase().equals("A")
					|| palavra.substring(i, i+1).toUpperCase().equals("E") 
					|| palavra.substring(i, i+1).toUpperCase().equals("I")
					|| palavra.substring(i, i+1).toUpperCase().equals("O")
					|| palavra.substring(i, i+1).toUpperCase().equals("U")) {
						quantidadeVogal++;					
					}
		}
		System.out.println("Quantidade de vogal: " + quantidadeVogal);
		System.out.println("A palavra começa com o termo? " + (palavra.startsWith(termo)? "sim" : "não"));
		System.out.println("A palavra termina com o termo? " + (palavra.endsWith(termo)? "sim" : "não"));
	}

}
