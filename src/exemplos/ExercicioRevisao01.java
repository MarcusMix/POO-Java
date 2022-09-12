package exemplos;

import java.util.Scanner;

public class ExercicioRevisao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		double valorLaranjaTotal = 0;
		double valorMacaTotal = 0;
		double valorMorangoTotal = 0;
		double valorLaranja, valorMaca, valorMorango;
		do {
			System.out.println("Informe a quantidade de kg em "
					+ "laranjas compradas: ");
			double kgLaranja = teclado.nextDouble();
			System.out.println("Informe a quantidade de kg em "
					+ "morango comprados: ");
			double kgMorango = teclado.nextDouble();
			System.out.println("Informe a quantidade de kg em "
					+ "maçãs compradas: ");
			double kgMaca = teclado.nextDouble();
			
			 valorLaranja = calcularValorLaranja(kgLaranja);
			 valorMorango = calcularValorMorango(kgMorango);
			 valorMaca = calcularValorMaca(kgMaca);
			double valorTotal = calcularValorTotal(valorLaranja,
				valorMorango, valorMaca);
			valorLaranjaTotal += valorLaranja;
			valorMacaTotal += valorMaca;
			valorMorangoTotal += valorMorango;
			System.out.print("Deseja informar mais uma venda? 1 - Sim, 2 - Não: ");
			opcao = teclado.nextInt();
		}while(opcao != 2);
		System.out.println("Valor total faturado de Laranja foi : " +  valorLaranjaTotal);
		System.out.println("Valor total faturado de Morango foi : " +  valorMorangoTotal);
		System.out.println("Valor total faturado de Maçã foi : " +  valorMacaTotal);
	
		

	}

	static double calcularValorTotal(double valorLaranja,
		double valorMorango, double valorMaca) {
		double valorTotal = 0;
		valorTotal =  valorLaranja + valorMorango + valorMaca;
		return valorTotal;
	}

	static double calcularValorMaca(double kgMaca) {
		double valorMaca = 0;
		if(kgMaca < 2) {
			valorMaca = kgMaca * 5.5;
		}else if (kgMaca >= 2 && kgMaca < 5) {
			valorMaca = kgMaca * 5.25;
		}else if(kgMaca > 5) {
			valorMaca = kgMaca * 5;
		}
		return valorMaca;
		
		
	}

	static double calcularValorMorango(double kgMorango) {
		double valorMorango = 0;
		if(kgMorango < 2) {
			valorMorango = kgMorango * 6;
		}else if (kgMorango >= 2 && kgMorango < 5) {
			valorMorango = kgMorango * 5.75;
		}else if(kgMorango > 5) {
			valorMorango = kgMorango * 5.50;
		}
		return valorMorango;
		
		
	}

	static double calcularValorLaranja(double kgLaranja) {
		double valorLaranja = 0;
		if(kgLaranja < 2) {
			valorLaranja = kgLaranja * 4.50;
		}else if (kgLaranja >= 2 && kgLaranja < 5) {
			valorLaranja = kgLaranja * 4.25;
		}else  if(kgLaranja > 5) {
			valorLaranja = kgLaranja * 4;
		}
		return valorLaranja;
		
		
	}

}
