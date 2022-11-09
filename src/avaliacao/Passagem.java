package avaliacao;

import java.time.LocalDateTime;

public class Passagem {
	
	private double valorPassagem;
	private LocalDateTime dataHorario;
	private Passageiro passageiro;
	
	public Passagem(double valorPassagem, LocalDateTime dataHorario, Passageiro passageiro) {
		super();
		this.valorPassagem = valorPassagem;
		this.dataHorario = dataHorario;
		this.passageiro = passageiro;
	}

	public Passagem() {
		super();
	}

	public double getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	public LocalDateTime getDataHorario() {
		return dataHorario;
	}

	public void setDataHorario(LocalDateTime dataHorario) {
		this.dataHorario = dataHorario;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

}
