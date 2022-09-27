package POO;

public class MarcusFarmacia  extends MarcusEmpresa {
	private MarcusEstoque estoque;

	public MarcusFarmacia() {
		super();
	}

	public MarcusFarmacia(String nome, String cnpj, MarcusEndereco endereco, MarcusEstoque estoque) {
		super(nome, cnpj, endereco);
		this.estoque = estoque;
	}
	
	public MarcusEstoque getEstoque() {
		return estoque;
	}
	
	public void setEstoque(MarcusEstoque estoque) {
		this.estoque = estoque;
	}

	public void identificarResponsavel() {
		this.getEstoque().identificarResponsavel();
		
	}

	public  void calculaEstoque() {
		this.getEstoque().calcularEstoque();
		
	}

	
	
//	
//	public String nomeResponsavel () {
//		String nome = estoque.getResponsavel();
//		return nome;
//	}

	
	
}
 