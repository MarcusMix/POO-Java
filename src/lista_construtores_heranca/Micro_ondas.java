package lista_construtores_heranca;

public class Micro_ondas extends Eletrodomestico{
	private int capacidadeEmLitros;

	public Micro_ondas() {
		super();
	}

	public Micro_ondas(String modelo, String fabricante, int capacidadeEmLitros, int kwDia) {
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
