package exerciciosStrings;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = new String();
		System.out.println("Informe o texto: ");
		texto = teclado.nextLine();
		texto = texto.replace(".", "");
		String [] textoEspacado = texto.split(" ");
		for(int i = 0; i < textoEspacado.length; i++) {
			System.out.println(textoEspacado[i]);
		}

	}

}
