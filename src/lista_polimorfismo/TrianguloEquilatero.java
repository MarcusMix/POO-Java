package lista_polimorfismo;

public class TrianguloEquilatero {
	private double lado;
	private String nome;
	
	public TrianguloEquilatero(double lado, String nome) {
		super();
		this.lado = lado;
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public double calcularArea(int lado) {
		return lado * lado;
	}
	
	
	public double calcularPerimetro(double lado) {
		return lado * 3;
	}
	
}
