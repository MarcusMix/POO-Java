package exemplos;

import java.util.Scanner;

public class UsandoSwitchCase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int opcao = teclado.nextInt();
		switch(opcao) {
		case 1:{
			System.out.println("Número 1");
			break;
		}
		case 2:{
			System.out.println("Número 2");
			break;
		}
		default: {
			System.out.println("Opção Inválida");
		}
		}
		teclado.close();
	}

}
		
