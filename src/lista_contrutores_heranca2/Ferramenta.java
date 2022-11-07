package lista_contrutores_heranca2;

public class Ferramenta {
	private String modelo;
	private String fabricante;
	
	public Ferramenta() {
		super();
	}

	public Ferramenta(String modelo, String fabricante) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
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
