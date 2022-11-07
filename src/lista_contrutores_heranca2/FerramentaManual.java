package lista_contrutores_heranca2;

public class FerramentaManual {
	private String modelo;
	private String fabricante;
	private String tipo;
	private double tamanho;
	private double peso;
	private double fatorDeDesgaste;

	public FerramentaManual() {
		super();
	}

	public FerramentaManual(String modelo, String fabricante, String tipo, double tamanho, double peso,
			double fatorDeDesgaste) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.peso = peso;
		this.fatorDeDesgaste = fatorDeDesgaste;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getFatorDeDesgaste() {
		return fatorDeDesgaste;
	}

	public void setFatorDeDesgaste(double fatorDeDesgaste) {
		this.fatorDeDesgaste = fatorDeDesgaste;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
}
