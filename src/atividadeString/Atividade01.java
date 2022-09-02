package exerciciosStrings;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra = new String();
		System.out.println("Informe a palavra que deseja. ");
		palavra = teclado.nextLine();
		for(int i = (palavra.length() -1); i >= 0 ; i--) {
			System.out.print(palavra.charAt((i)));
		}
		
	}

}
