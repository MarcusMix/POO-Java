package exemplosOO;

public class Caminhao extends Veiculo{
	private int numeroEixos;

	public Caminhao(String fabricante, String modelo, int ano, String placa, int numeroEixos) {
		super(fabricante, modelo, ano, placa);
		this.numeroEixos = numeroEixos;
	}

	public Caminhao() {
		super();
	}

	public int getNumeroEixos() {
		return numeroEixos;
	}

	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}
	
	@Override
	public String toString() {
		return  "Fabricante: " + this.getFabricante() + 
				"\nModelo: " + this.getModelo() + 
				"\nAno: " + this.getAno() + 
				"\nPlaca: " + this.getPlaca() +
				"\nNúmero de eixos: " + this.getNumeroEixos();
	}
	
}
