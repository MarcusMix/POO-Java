package lista_polimorfismo;

public class TrianguloEquilatero extends Triangulo {
	private double lado;
	
	public TrianguloEquilatero(double lado, String nome) {
		super(nome);
		this.lado = lado;
	}

	public TrianguloEquilatero() {
		super();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	
	@Override
	public double calcularPerimetro() {
		return this.lado * 3;
	}

	@Override
	public double calcularArea() {
		return (Math.pow(getLado(), 2) * Math.sqrt(3)) / 4;
	}
	
}
