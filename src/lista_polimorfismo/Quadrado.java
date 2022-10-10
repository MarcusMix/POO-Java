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


	@Override
	public double calcularArea(double lado) {
		return lado * lado;
	}
	
	
	@Override
	public double calcularPerimetro(double lado) {
		return lado * 4;
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
