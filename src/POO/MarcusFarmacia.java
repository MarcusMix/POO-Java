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
	
	public String nomeResponsavel () {
		String nome = estoque.getResponsavel();
		return nome;
	}
	
	
	
}
 