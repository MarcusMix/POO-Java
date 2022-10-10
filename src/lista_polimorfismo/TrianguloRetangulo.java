package lista_polimorfismo;

public class TrianguloRetangulo extends Triangulo {
	private double base;
	private double altura;
	
	public TrianguloRetangulo(double base, double altura, String nome) {
		super();
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

	public double calcularArea(double base, double altura) {
		return (base * altura) / 2;
	}
	
	
	public double calcularPerimetro(double raio) {
		return base + (altura * 2);
	}

	@Override
	public double calcularPerimetro(double ladoA, double ladoB) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularArea(double raio) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
