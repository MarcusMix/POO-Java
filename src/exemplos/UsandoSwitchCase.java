package exemplos;

import java.util.Scanner;

public class UsandoSwitchCase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int opcao = teclado.nextInt();
		switch(opcao) {
		case 1:{
			System.out.println("N�mero 1");
			break;
		}
		case 2:{
			System.out.println("N�mero 2");
			break;
		}
		default: {
			System.out.println("Op��o Inv�lida");
		}
		}
		teclado.close();
	}

}
		
