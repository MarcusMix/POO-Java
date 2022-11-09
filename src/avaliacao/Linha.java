package avaliacao;

public class Linha {
	
	private String trecho;
	private Trem trem;
	private Passagem[] listaPassagem;
	
	public Linha(String trecho, Trem trem, Passagem[] listaPassagem) {
		super();
		this.trecho = trecho;
		this.trem = trem;
		this.listaPassagem = listaPassagem;
	}

	public Linha() {
		super();
	}

	public String getTrecho() {
		return trecho;
	}

	public void setTrecho(String trecho) {
		this.trecho = trecho;
	}

	public Trem getTrem() {
		return trem;
	}

	public void setTrem(Trem trem) {
		this.trem = trem;
	}

	public Passagem[] getListaPassagem() {
		return listaPassagem;
	}

	public void setListaPassagem(Passagem[] listaPassagem) {
		this.listaPassagem = listaPassagem;
	}

}
