package lista_polimorfismo;

public abstract class  FormasGeometricas {
	private String nome;
	
	public FormasGeometricas(String nome) {
		super();
		this.nome = nome;
	}

	public FormasGeometricas() {
		super();
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public abstract double calcularArea(double raio);
	
	
	public abstract double calcularPerimetro(double raio) ;
	
	
}
