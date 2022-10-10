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

	
	@Override
	public double calcularArea(double raio) {
		return 3.14 * (raio * 2);
	}
	
	
	@Override
	public double calcularPerimetro(double raio) {
		return 2 * 3.14 * raio;
	}

	@Override
	public double calcularArea(double base, double altura) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPerimetro(double ladoA, double ladoB) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	
