package exerciciosString;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um texto: ");
		String texto = teclado.nextLine();
		
		int vogalA = 0;
		int vogalE = 0;
		int vogalI = 0;
		int vogalO = 0;
		int vogalU = 0;
		
		char[] letras = texto.toUpperCase().toCharArray();
		for(int i = 0; i < letras.length; i++) {
			switch(letras[i]) {
			case 'A': {
				vogalA++;
				break;
			}
			case 'E': {
				vogalE++;
				break;
			}
			case 'I': {
				vogalI++;
				break;
			}
			case 'O': {
				vogalO++;
				break;
			}
			case 'U': {
				vogalU++;
				break;
			}
			}
		}
		System.out.println("Total de ocorrencias vogal A: " + vogalA);
		System.out.println("Total de ocorrencias vogal E: " + vogalE);
		System.out.println("Total de ocorrencias vogal I: " + vogalI);
		System.out.println("Total de ocorrencias vogal O: " + vogalO);
		System.out.println("Total de ocorrencias vogal U: " + vogalU);
	}

}
