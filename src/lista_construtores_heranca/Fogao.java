package lista_construtores_heranca;

public class Fogao extends Eletrodomestico {
	private int qtBocas;

	public Fogao() {
		super();
	}

	public Fogao(String modelo, String fabricante, int qtBocas,  int kwDia) {
		super(modelo, fabricante, kwDia);
		this.qtBocas = qtBocas;
	}

	public int getQtBocas() {
		return qtBocas;
	}

	public void setQtBocas(int qtBocas) {
		this.qtBocas = qtBocas;
	}

	
	
	
}