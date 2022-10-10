package lista_polimorfismo;

public class TrianguloIsosceles extends Triangulo {
	private double base;
	private double altura;
	
	public TrianguloIsosceles(double base, double altura, String nome) {
		super();
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
	public double calcularArea(double base, double altura) {
		return (base * altura) / 2;
	}

	@Override
	public double calcularPerimetro(double base, double altura) {
		return base + (altura * 2);
	}

	@Override
	public double calcularArea(double raio) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPerimetro(double raio) {
		// TODO Auto-generated method stub
		return 0;
	}

}
