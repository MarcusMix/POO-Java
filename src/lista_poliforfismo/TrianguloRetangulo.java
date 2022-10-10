package lista_poliforfismo;

public class TrianguloRetangulo {
	private double base;
	private double altura;
	private String nome;
	
	public TrianguloRetangulo(double base, double altura, String nome) {
		super();
		this.base = base;
		this.altura = altura;
		this.nome = nome;
	}

	public TrianguloRetangulo() {
		super();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public double calcularArea(double base, double altura) {
		return (base * altura) / 2;
	}
	
	
	public double calcularPerimetro(double raio) {
		return base + (altura * 2);
	}
	
}
