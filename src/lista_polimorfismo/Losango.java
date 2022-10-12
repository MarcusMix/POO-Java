package lista_polimorfismo;

public class Losango extends FormasGeometricas  {
	private double ladoA;
	private double ladoB;
	private double diagonalMaior;
	private double diagonalMenor;

	
	public Losango(double ladoA, double ladoB, double diagonalMaior, double diagonalMenor, String nome) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}


	public Losango() {
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


	public double getDiagonalMaior() {
		return diagonalMaior;
	}


	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}


	public double getDiagonalMenor() {
		return diagonalMenor;
	}


	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	
	
	public double calcularArea() {
		return (diagonalMaior * diagonalMenor) / 2;
	}
	
	
	public double calcularPerimetro() {
		return  (ladoA * 2) + (ladoB * 2);
	}


	
}
