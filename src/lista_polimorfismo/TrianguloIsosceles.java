package lista_polimorfismo;

public class TrianguloIsosceles extends Triangulo {
	private double base;
	private double altura;
	
	public TrianguloIsosceles(double base, double altura, String nome) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}
	
	public TrianguloIsosceles() {
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


	@Override
	public double calcularArea() {
		return (this.base * this.altura);
	}

	@Override
	public double calcularPerimetro() {
		return (this.base * 2) + (Math.hypot(this.base, this.altura) * 2);
	}



}
