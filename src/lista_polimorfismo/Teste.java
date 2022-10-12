package lista_polimorfismo;

import java.text.DecimalFormat;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		Random gerador = new Random();
		FormasGeometricas[] array = new FormasGeometricas[7];
		
		
		for(int i = 0; i < array.length; i++) {
			int opcao = gerador.nextInt(7);
			switch(opcao) {
				case 0: {
					Quadrado quadrado = new Quadrado(gerador.nextInt(9)+1, "Quadrado");
					array[i] = quadrado;
					break;
				}
				case 1: {
					Circulo circulo = new Circulo(gerador.nextInt(9)+1, "Circulo");
					array[i] = circulo;
					break;
				}
				case 2: {
					Losango losango = new Losango(gerador.nextInt(9)+1,gerador.nextInt(9)+1, gerador.nextInt(9)+1, gerador.nextInt(9)+1,"Losango");
					array[i] = losango;
					break;
				}
				case 3: {
					TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(gerador.nextInt(9)+1, "Triangulo Equilatero");
					array[i] = trianguloEquilatero;
					break;
				}
				case 4: {
					TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles(gerador.nextInt(9)+1,gerador.nextInt(9)+1 ,"Triangulo Isosceles");
					array[i] = trianguloIsosceles;
					break;
				}
				case 5: {
					TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo(gerador.nextInt(9)+1,gerador.nextInt(9)+1,"Triangulo Isosceles");
					array[i] = trianguloRetangulo;
					break;
				}
				case 6: {
					Retangulo retangulo = new Retangulo(gerador.nextInt(9)+1,gerador.nextInt(9)+1, "Retangulo");
					array[i] = retangulo;
					break;
				}
				
			}
			
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("\nNome da Figura: " + array[i].getNome());
			System.out.println("Área da Figura: " + df.format(array[i].calcularArea()));
			System.out.println("Perímetro da Figura: " + df.format(array[i].calcularPerimetro()));
			System.out.println("---------------------");
		}
	}
}


