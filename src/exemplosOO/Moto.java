package exemplosOO;

public class Moto extends Veiculo{
	private double potenciaCilindrada;

	
	public Moto(String fabricante, String modelo, int ano, String placa, double potenciaCilindrada) {
		super(fabricante, modelo, ano, placa);
		this.potenciaCilindrada = potenciaCilindrada;
	}

	public Moto() {
		super();

	}

	public double getPotenciaCilindrada() {
		return potenciaCilindrada;
	}

	public void setPotenciaCilindrada(double potenciaCilindrada) {
		this.potenciaCilindrada = potenciaCilindrada;
	}
	
	@Override
	public String toString() {
		return  "Fabricante: " + this.getFabricante() + 
				"\nModelo: " + this.getModelo() + 
				"\nAno: " + this.getAno() + 
				"\nPlaca: " + this.getPlaca() +
				"\nCilindradas: " + this.getPotenciaCilindrada();
	}

	
}
