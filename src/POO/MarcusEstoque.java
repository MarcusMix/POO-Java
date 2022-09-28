package POO;

public class MarcusEstoque {
	
	private String responsavel;
	private MarcusRemedio[] remedios;
	
	public MarcusEstoque() {
		super();
	}

	public MarcusEstoque(String responsavel, MarcusRemedio[] remedios) {
		super();
		this.responsavel = responsavel;
		this.remedios = remedios;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public MarcusRemedio[] getRemedios() {
		return remedios;
	}

	public void setRemedios(MarcusRemedio[] remedios) {
		this.remedios = remedios;
	}

	public void identificarResponsavel() {
		System.out.println("O responsável pela farmácia é: " + this.getResponsavel());
		
	}

	public void calcularEstoque() {
		double total = 0;
		for(int i = 0; i < this.getRemedios().length; i++) {
			total += this.getRemedios()[i].getPreco();
		}
		
		System.out.println("Total do estoque: " + total);
	}
	
	public void calcularEstoque(String laboratorio) {
		double total = 0;
		for(int i = 0; i < this.getRemedios().length; i++) {
			if(laboratorio.equalsIgnoreCase(this.getRemedios()[i].getLaboratorio().getNome()))
			total += this.getRemedios()[i].getPreco();
		}
		System.out.println("Laboratório: " + laboratorio);
		System.out.println("Total do estoque: " + total);
		
	}

	public MarcusLaboratorio informarDadosLaboratorio(String nome) {
		MarcusLaboratorio resultado = null;
		for(int i = 0; i < this.getRemedios().length; i++) {
			if(this.getRemedios()[i].getLaboratorio().getNome().equalsIgnoreCase(nome)) {
				resultado = this.getRemedios()[i].getLaboratorio();			
				}
		}
		return resultado;
	}
}
	

	

