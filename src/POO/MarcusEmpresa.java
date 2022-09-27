package POO;

public class MarcusEmpresa  {
	private String nome;
	private String cnpj;
	private MarcusEndereco endereco;

	public MarcusEmpresa(String nome, String cnpj, MarcusEndereco endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public MarcusEmpresa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public MarcusEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(MarcusEndereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + 
			   "\nCNPJ: " + this.getCnpj() +
			   "\nEndereço: " + this.getEndereco();
	}
}
