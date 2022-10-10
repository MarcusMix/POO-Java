package lista_polimorfismo;

public class Teste {

	public static void main(String[] args) {
		String[] array = new String[6];
		
		Quadrado q = new Quadrado(1, "Quadradão");
		Circulo c = new Circulo(1, "Circuluzinho");
		Retangulo r = new Retangulo(1, 2, "Retanguloso");
		Losango l = new Losango(1, 2, 10, 20, "Losangulo");
		
//		String [] array = {q, c, r, l, l, q, c};
		
		for(int i = 0; i > array.length; i++) {
			System.out.println(array[i].getClass().getName());
		}
	}

}
