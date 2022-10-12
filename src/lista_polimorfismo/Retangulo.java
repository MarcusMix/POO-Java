package lista_polimorfismo;

public class Retangulo extends FormasGeometricas {
	private double ladoA;
	private double ladoB;
	
	public Retangulo(double ladoA, double ladoB, String nome) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public Retangulo() {
		super();
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	
	@Override
	public double calcularArea() {
		return ladoA * ladoB;
	}
	

	@Override
	public double calcularPerimetro() {
		return  ladoA * ladoB;
	}

	
	
}
