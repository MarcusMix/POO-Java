package lista_construtores_heranca;

public class Forno_eletrico extends Eletrodomestico  {
	private int capacidadeEmLitros;

	public Forno_eletrico() {
		super();
	}

	public Forno_eletrico(String modelo, String fabricante, int kwDia, int capacidadeEmLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeEmLitros = capacidadeEmLitros;
	}

	public int getCapacidadeEmLitros() {
		return capacidadeEmLitros;
	}

	public void setCapacidadeEmLitros(int capacidadeEmLitros) {
		this.capacidadeEmLitros = capacidadeEmLitros;
	}
	
	public double calcularConsumo() {
		return (30 * kwDia) * 0.25;
	}
	
	public double getKwDia() {
		return  (kwDia * 0.25);
	}

}
