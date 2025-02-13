package simulado01;

public class MarcusEndereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public MarcusEndereco(String rua, int numero, String bairro, String cidade, String estado) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public MarcusEndereco() {
		super();
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Rua: " + this.getRua() +
			   "\nN�mero: " + this.getNumero() +
			   "\nBairro: " + this.getBairro() + 
			   "\nCudade: " + this.getCidade() + 
			   "\nEstado: " + this.getEstado();
	}
	
	
	
	
}
