package lista_polimorfismo;

public abstract class Triangulo extends FormasGeometricas {
	private double base;
	private double altura;
	
	public Triangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public Triangulo() {
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

	public abstract double calcularPerimetro(double ladoA, double ladoB) ;
	public abstract double calcularArea(double base, double altura);
	
}
