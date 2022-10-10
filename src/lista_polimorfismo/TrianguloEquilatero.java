package lista_polimorfismo;

public class TrianguloEquilatero extends Triangulo {
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
	
	
	@Override
	public double calcularPerimetro(double lado) {
		return lado * 3;
	}

	@Override
	public double calcularArea(double lado) {
		return lado * lado;
	}
	
	
	@Override
	public double calcularPerimetro(double ladoA, double ladoB) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularArea(double base, double altura) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
