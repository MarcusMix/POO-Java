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

	public void contabilizarAlunos() {
		int total = 0;
		for(int i = 0; i < this.getTurmas().length; i++) {
			total += this.getTurmas()[i].getAlunos().length;
		}
		System.out.println("Total de Alunos: " +  total);
	}

	public void localizarRegente(String nome) {
		for(int i = 0; i < this.getTurmas().length; i++) {
			this.getTurmas()[i].localizarRegente(nome);
		}
		
	}
	
	public void localizarRegente2(String nome) {
		for(int i = 0; i < this.getTurmas().length; i++) {
			if(this.getTurmas()[i].getRegente().getNome().equals(nome))
				System.out.println("Endereço do Regente: " + this.getTurmas()[i].getRegente().getNome());
				System.out.println(this.getTurmas()[i].getRegente().getEndereco());
				break;
		}
		
	}
	
	
	public void listarAlunasPorSerie(int serie) {
		for(int i = 0; i < this.getTurmas().length; i++) {
			if(this.getTurmas()[i].getSerie() == serie) {
				this.getTurmas()[i].listarAlunasPorSerie();
			}
		}
	}

	

	public void listarAlunasPorSerie2(int serie) {
		for(int i = 0; i < this.getTurmas().length; i++) {
			if(this.getTurmas()[i].getSerie() == serie) {
				System.out.println("Alunas da série: " + this.getTurmas()[i].getSerie());
				for(int j = 0; j < this.getTurmas()[i].getAlunos().length; j++) {
					System.out.println(this.getTurmas()[i].getAlunos()[j].getNome());					
				}
				
			}
		}
		
	}

	public void identificarRegenteMaisNovo() {
		Professor maisNovo = this.getTurmas()[0].getRegente();
		for(int i = 0; i < this.getTurmas().length; i++) {
			if(this.getTurmas()[i].getRegente().getIdade() < maisNovo.getIdade()) {
				maisNovo = this.getTurmas()[i].getRegente();
			}
		}
		System.out.println("Regente mais novo: ");
		System.out.println(maisNovo);
	}

	public void listarAlunasPorCidade(String cidade) {
		for(int i = 0; i < this.getTurmas().length; i++) {
			this.getTurmas()[i].listarAlunasPorCidade(cidade);
		}
	}

	public void listarAlunasPorCidade2(String cidade) {
		for(int i = 0; i < this.getTurmas().length; i++) {
			for(int x = 0; x < this.getTurmas()[i].getAlunos().length ;x++)
			if(this.getTurmas()[i].getAlunos()[x].getEndereco().getCidade().equals(cidade)) {
				System.out.println(this.getTurmas()[i].getAlunos()[x].getNome());
			}
		}
		
	}
	
	
	
}
