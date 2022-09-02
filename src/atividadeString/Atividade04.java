package exerciciosStrings;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Informe o texto: ");
	String texto = teclado.nextLine();
	System.out.println("Informe a palavra a ser buscada: ");
	String palavra = teclado.nextLine();
	
	System.out.println("O texto digitado: " + texto);
	System.out.println("A palavra digitada: " + palavra);
	
	texto = texto.replace(".", "");
	texto = texto.replace("?", "");
	texto = texto.replace("!", "");
	texto = texto.replace(":", "");
	texto = texto.replace(";", "");
	texto = texto.replace("'", "");
	texto = texto.replace("-", "");
	
	String[] palavras = texto.split(" ");
	int ocorrencias = 0;
	for(int i = 0; i < palavras.length; i++) {
		if(palavras[i].equals(palavra)) {
			ocorrencias++;
		}
	}
	System.out.println("Ocorrencia: " + ocorrencias);
	}
}
