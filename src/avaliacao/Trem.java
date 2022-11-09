package avaliacao;

import java.time.LocalDate;

public class Trem {
	
	private int numeroLocomotiva;
	private LocalDate dataFabricacao;
	private Maquinista maquinista;
	
	public Trem(int numeroLocomotiva, LocalDate dataFabricacao, Maquinista maquinista) {
		super();
		this.numeroLocomotiva = numeroLocomotiva;
		this.dataFabricacao = dataFabricacao;
		this.maquinista = maquinista;
	}

	public Trem() {
		super();
	}

	public int getNumeroLocomotiva() {
		return numeroLocomotiva;
	}

	public void setNumeroLocomotiva(int numeroLocomotiva) {
		this.numeroLocomotiva = numeroLocomotiva;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Maquinista getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}

	@Override
	public String toString() {
		return "\nNúmero da Locomotiva: " + this.getNumeroLocomotiva()+ 
				"\nData de Fabricação: " + this.getDataFabricacao() + 
				"\nMaquinista: "+ this.getMaquinista();
	}

}
