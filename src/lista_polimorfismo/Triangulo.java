package lista_polimorfismo;

public abstract class Triangulo extends FormasGeometricas {
	
	public Triangulo(String nome) {
		super(nome);
	}

	public Triangulo() {
		super();
	}

	public abstract double calcularPerimetro();
	public abstract double calcularArea();
	
}
