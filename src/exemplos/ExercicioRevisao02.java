package exemplos;

import java.util.Scanner;

public class ExercicioRevisao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe qual comb�stivel voc� ir� comprar: ");
		System.out.println(" 'A' - �lcool, 'G' - Gasolina, 'D' - Diesel. ");
		String tipo = teclado.next();
		int opcao = 0;
		double valorTotalGasolina = 0;
		double valorTotalAlcool = 0;
		double valorTotalDiesel = 0;
		int cliente = 0;
		do {
			cliente++;
			switch(tipo) {
			case "A" : {
				System.out.println("Quantos litros de �lcool voc� vai comprar? ");
				int litroAlcool = teclado.nextInt();
				double valorAlcool = 5.50 * litroAlcool;
				if (litroAlcool <= 30) {
					System.out.println("Valor por " + litroAlcool + " litros de �lcool � " 
							+ (valorAlcool - (valorAlcool * 0.02)));
					valorTotalAlcool += valorAlcool;
					System.out.println("O " + cliente + "� cliente ir� pagar no total ser�: " + valorAlcool);
				}else {
					System.out.println("Valor por " + litroAlcool + " litros de �lcool � " 
							+ (valorAlcool - (valorAlcool * 0.03)));
					valorTotalAlcool += valorAlcool;
					System.out.println("O " + cliente + "� cliente ir� pagar no total ser�: " + valorAlcool);
				}
				break;
			}
			case "G": {
				System.out.println("Quantos litros de Gasolina voc� vai comprar? ");
				int litroGasolina = teclado.nextInt();
				double valorGasolina = 6 * litroGasolina;
				if (litroGasolina <= 30) {
					System.out.println("Valor por " + litroGasolina + " litros de gasolina � " 
							+ (valorGasolina - (valorGasolina * 0.03)));
					valorTotalGasolina += valorGasolina;
					System.out.println("O " + cliente + "� cliente  ir� pagar no total ser�: " + valorGasolina);
				}else{
					System.out.println("Valor por " + litroGasolina + " litros de gasolina � "
							+ (valorGasolina - (valorGasolina * 0.04)));
					valorTotalGasolina += valorGasolina;
					System.out.println("O " + cliente + "� cliente ir� pagar no total ser�: " + valorGasolina);
				}
				break;
			}
			case "D": {
				System.out.println("Quantos litros de Diesel voc� vai comprar? ");
				int litroDiesel = teclado.nextInt();
				double valorDiesel = 6.5 * litroDiesel;
				if (litroDiesel <= 50) {
					System.out.println("Valor por " + litroDiesel + " litros de gasolina � " 
							+ (valorDiesel - (valorDiesel * 0.05)));
					valorTotalDiesel += valorDiesel;
					System.out.println("O " + cliente + "� cliente ir� pagar no total ser�: " + valorDiesel);
				}else{
					System.out.println("Valor por " + litroDiesel + " litros de gasolina � "
							+ (valorDiesel - (valorDiesel * 0.07)));
					valorTotalDiesel += valorDiesel;
					System.out.println("O " + cliente + "� cliente ir� pagar no total ser�: " + valorDiesel);
				}
				break;
			}
		}
			

		System.out.print("Deseja realizar mais uma venda de combust�vel? 1 - Sim, 2 - N�o: ");
		opcao = teclado.nextInt();
	}while(opcao == 1);
			System.out.println("O valor total de gasolina vendidos foi: " + valorTotalGasolina);
			System.out.println("O valor total de gasolina vendidos foi: " + valorTotalAlcool);
			System.out.println("O valor total de gasolina vendidos foi: " + valorTotalDiesel);
	}
}
