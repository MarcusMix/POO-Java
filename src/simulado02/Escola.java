package simulado02;

public class Escola {
	private String nome;
	private String telefone;
	private Turma[] turmas;
	private Endereco enderecoEscola;

	public Escola(String nome, String telefone, Turma[] turmas, Endereco enderecoEscola) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.turmas = turmas;
		this.enderecoEscola = enderecoEscola;
	}
	
	public Escola() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}

	public Endereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(Endereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}
	
	
}
