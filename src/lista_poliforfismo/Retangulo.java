package lista_poliforfismo;

public class Retangulo {
	private double ladoA;
	private double ladoB;
	private String nome;
	
	public Retangulo(double ladoA, double ladoB, String nome) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double calcularArea(double ladoA, double ladoB) {
		return ladoA * ladoB;
	}
	
	
	public double calcularPerimetro(int lado) {
		return  ladoA * ladoB;
	}
	
}
