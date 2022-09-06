package lista_construtores_heranca;

public class Lava_loucas extends Eletrodomestico {
	private int capacidadeEmLitros;

	public Lava_loucas() {
		super();
	}

	public Lava_loucas(String modelo, String fabricante, int capacidadeEmLitros, int kwDia) {
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
