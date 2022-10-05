package lista_poliforfismo;

public class Quadrado {
	private int lado;
	private String nome;
	
	public Quadrado(int lado, String nome) {
		super();
		this.lado = lado;
		this.nome = nome;
	}

	public Quadrado() {
		super();
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
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
	
	
	public double calcularPerimetro(int lado) {
		return lado * 4;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", nome=" + nome + "]";
	}
	
	
}
