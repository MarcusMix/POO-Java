package lista_contrutores_heranca2;

public class FerramentasEletricas extends Ferramenta {
	private double rpm;
	private double potencia;
	private double tensao;
	private double peso;
	private double fatorDeDesgaste;
	
	public FerramentasEletricas(String modelo, String fabricante, double rpm, double potencia, double tensao,
			double peso, double fatorDeDesgaste) {
		super(modelo, fabricante);
		this.rpm = rpm;
		this.potencia = potencia;
		this.tensao = tensao;
		this.peso = peso;
		this.fatorDeDesgaste = fatorDeDesgaste;
	}

	public FerramentasEletricas() {
		super();
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
}
