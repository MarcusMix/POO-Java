package lista_contrutores_heranca2;

public class FerramentasEletricas {
	private String modelo;
	private String fabricante;
	private double rpm;
	private double potencia;
	private double tensao;
	
	public FerramentasEletricas(String modelo, String fabricante, double rpm, double potencia, double tensao) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.rpm = rpm;
		this.potencia = potencia;
		this.tensao = tensao;
	}

	public FerramentasEletricas() {
		super();
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

	public double getRpm() {
		return rpm;
	}

	public void setRpm(double rpm) {
		this.rpm = rpm;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getTensao() {
		return tensao;
	}

	public void setTensao(double tensao) {
		this.tensao = tensao;
	}
	
}
