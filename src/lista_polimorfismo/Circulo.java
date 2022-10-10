package lista_polimorfismo;

public class Circulo extends FormasGeometricas {
	private double raio;
	
	public Circulo(double raio, String nome) {
		super();
		this.raio = raio;
	}

	public Circulo() {
		super();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	public double calcularArea(double raio) {
		return 3.14 * (raio * 2);
	}
	
	
	public double calcularPerimetro(double raio) {
		return 2 * 3.14 * raio;
	}
}
	
