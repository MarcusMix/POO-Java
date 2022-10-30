package poo;

public class Farmacia extends Empresa {
	private Estoque estoque;

	public Farmacia() {
		super();
	}

	public Farmacia(String nome, String cnpj, Endereco endereco, Estoque estoque) {
		super(nome, cnpj, endereco);
		this.estoque = estoque;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public String informarNomeResponsavel() {
		return this.getEstoque().getResponsavel();
	}

	public void calcularValorTotal() {
		double total = 0;
		for(int i = 0; i < this.getNome().length(); i++) {
			if(this.getEstoque().getRemedios()[i].getPreco() > 0) {
				total += this.getEstoque().getRemedios()[i].getPreco();
			}
		}
		System.out.println("Valor total em reais é : " + total);
	}

	public void calcularValorTotalLaboratorio(String laboratorio) {
		double total = 0;
		for(int i = 0; i < this.getNome().length(); i++) {
			if(this.getEstoque().getRemedios()[i].getLaboratorio().getNome().equals(laboratorio)) {
				total += this.getEstoque().getRemedios()[i].getPreco();
			}
		}
		System.out.println("Valor total do laboratório " + laboratorio + " em reais é : " + total);
	}

	public void buscarInformacoesLaboratorio(String laboratorio) {
		Laboratorio lab = new Laboratorio();
		for(int i = 0; i < this.getNome().length(); i++) {
			if(this.getEstoque().getRemedios()[i].getLaboratorio().getNome().equals(laboratorio)) {
				lab = this.getEstoque().getRemedios()[i].getLaboratorio();
			}
		}
		System.out.println("Endereço do laboratorio " + laboratorio + " é: " + lab);
	}

	
}
