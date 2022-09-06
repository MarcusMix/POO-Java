package lista_construtores_heranca;

public class Lavadora_roupas extends Eletrodomestico {
	private int capacidadeEmLitros;

	public Lavadora_roupas() {
		super();
	}

	public Lavadora_roupas(String modelo, String fabricante, int capacidadeEmLitros, int kwDia) {
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
