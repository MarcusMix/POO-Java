package POO;

public class MarcusRemedio {
	private String nome;
	private double preco;
	private MarcusLaboratorio laboratorio;
	
	public MarcusRemedio() {
		super();
	}

	public MarcusRemedio(String nome, double preco, MarcusLaboratorio laboratorio) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.laboratorio = laboratorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public MarcusLaboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(MarcusLaboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	
	
	
	
}
