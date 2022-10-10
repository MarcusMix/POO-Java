package lista_polimorfismo;

public class Quadrado extends FormasGeometricas{
	private double lado;
	
	public Quadrado(double lado, String nome) {
		super();
		this.lado = lado;
	}

	public Quadrado() {
		super();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	
	public double calcularArea(double lado) {
		return lado * lado;
	}
	
	
	public double calcularPerimetro(double lado) {
		return lado * 4;
	}

	
}
