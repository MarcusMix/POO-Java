package lista_construtores_heranca;

public class Eletrodomestico {
	private String modelo;
	private String fabricante;
	private int kwDia;
	
	
	public Eletrodomestico() {
		super();
	}


	public Eletrodomestico(String modelo, String fabricante, int kwDia) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.kwDia = kwDia;
	}

	
	public double calcularConsumo() {
		return 30 * kwDia;
	}
	
	public double calcularConsumo(int dia) {
		return dia * kwDia;
	}

	public int getKwDia() {
		return kwDia;
	}


	public void setKwDia(int kwDia) {
		this.kwDia = kwDia;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
}
