package lista_polimorfismo;

public class TrianguloRetangulo extends Triangulo {
	private double base;
	private double altura;
	
	public TrianguloRetangulo(double base, double altura, String nome) {
		super(nome);
		this.base = base;
		this.altura = altura;
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

	public double calcularArea() {
		return (base * altura) / 2;
	}
	
	
	public double calcularPerimetro() {
		return base + (altura * 2);
	}

}
