package lista_polimorfismo;

public class Circulo {
	private double raio;
	private String nome;
	
	public Circulo(double raio, String nome) {
		super();
		this.raio = raio;
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public double calcularArea(double raio) {
		return 3.14 * (raio * 2);
	}
	
	
	public double calcularPerimetro(double raio) {
		return 2 * 3.14 * raio;
	}
}
	
