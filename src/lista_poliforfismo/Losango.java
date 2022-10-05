package lista_poliforfismo;

public class Losango {
	private double ladoA;
	private double ladoB;
	private double diagonalMaior;
	private double diagonalMenor;
	private String nome;
	
	public Losango(double ladoA, double ladoB, double diagonalMaior, double diagonalMenor, String nome) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
		this.nome = nome;
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


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public double calcularArea(double diagonalMaior, double diagonalMenor) {
		return (diagonalMaior * diagonalMenor) / 2;
	}
	
	
	public double calcularPerimetro(int lado) {
		return  (ladoA * 2) + (ladoB * 2);
	}
	
}
