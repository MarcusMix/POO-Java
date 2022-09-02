package exerciciosStrings;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = new String();
		System.out.println("Informe o texto: ");
		texto = teclado.nextLine();
		String [] textoQt = texto.split(" ");
		System.out.println(textoQt.length);
	}

}
