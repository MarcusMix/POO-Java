package simulado01;

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
	
	
	// identificar respons�vel
	public void identificarResponsavel() {
		this.getEstoque().identificarResponsavel();
		
	}
	
	// identificar respons�vel MANEIRA F�CIL
	public void identificarResponsavelEstoque3() {
		System.out.println("Respons�vel : " + this.getEstoque().getResponsavel());
	}

	
	//calcular estoque
	public  void calcularEstoque() {
		this.getEstoque().calcularEstoque();
		
	}

	public void calcularEstoque(String laboratorio) {
		this.getEstoque().calcularEstoque(laboratorio);
		
	}

	public MarcusLaboratorio informarDadosLaboratorio(String nome) {
		return this.getEstoque().informarDadosLaboratorio(nome);
	}
	
}
 