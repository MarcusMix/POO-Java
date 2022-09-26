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
	
//	
//	public double qtRemedios () {
//	double tRemedios = this.getRemedios();
//		return tRemedios;
//	}
	
	
}
