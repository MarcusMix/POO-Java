package lista_construtores_heranca;

public class Geladeira extends Eletrodomestico {
	private int capacidadeEmLitros;

	public Geladeira() {
		super();
	}

	public Geladeira(String modelo, String fabricante, int capacidadeEmLitros, int kwDia) {
		super(modelo, fabricante, kwDia);
		this.capacidadeEmLitros = capacidadeEmLitros;
	}

	public int getCapacidadeEmLitros() {
		return capacidadeEmLitros;
	}

	public void setCapacidadeEmLitros(int capacidadeEmLitros) {
		this.capacidadeEmLitros = capacidadeEmLitros;
	}

	
	
}
