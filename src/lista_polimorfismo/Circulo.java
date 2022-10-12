package lista_polimorfismo;

public class Circulo extends FormasGeometricas {
	private double raio;
	
	public Circulo(double raio, String nome) {
		super(nome);
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

	
	@Override
	public double calcularArea() {
		return 3.14 * (this.raio * 2);
	}
	
	
	@Override
	public double calcularPerimetro() {
		return 2 * 3.14 * this.raio;
	}

}
	
