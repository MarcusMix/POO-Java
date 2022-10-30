package exame;

public class Escola {
	private String nome;
	private String telefone;
	private Endereco enderecoEscola;
	private Turma[] turmas;
	
	public Escola(String nome, String telefone, Endereco enderecoEscola, Turma[] turmas) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.enderecoEscola = enderecoEscola;
		this.turmas = turmas;
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

	public Endereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(Endereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}

	public void contabilizarAlunos() {
		int total = 0;
		for(int i = 0; i < this.getTurmas().length; i++) {
			total += this.getTurmas()[i].getAlunos().length;
		}
		System.out.println("Total de alunas na escola é : " + total);
	}

	public void localizarRegentePorNome(String regente) {
		Endereco endProf = new Endereco();
		for(int i = 0; i < this.getTurmas().length; i++) {
			if(this.getTurmas()[i].getRegente().getNome().equals(regente)) {
				endProf = this.getTurmas()[i].getRegente().getEndereco();
			}
		}
		System.out.println("O endereço do professor " + regente + " é: " + endProf);
	}

	public void listarNomeAlunasPorSerie(int serie) {
		for(int i = 0; i < this.getTurmas().length; i++) {
			if(this.getTurmas()[i].getSerie() == serie ) {
				for(int j = 0; j < this.getTurmas()[i].getAlunos().length; j++) {
					System.out.println("Alunas da " + serie + " são: " + this.getTurmas()[i].getAlunos()[j].getNome());
					this.getTurmas()[i].getAlunos()[j].getNome();	
				}
			}
		}
		
	}

	public void identificarRegenteMaisNovo() {
		Professor maisNovo = this.getTurmas()[0].getRegente();
		for(int i = 0; i < this.getTurmas().length; i++) {
			if(this.getTurmas()[i].getRegente().getIdade() < maisNovo.getIdade()) {
				maisNovo = getTurmas()[i].getRegente();
			}
		}
		System.out.println("Professor mais novo é: " + maisNovo);
	}

	public void listarAlunasPorCidade(String cidade) {
		for(int i = 0; i < this.getTurmas().length; i++) {
			for(int j = 0; j < this.getTurmas()[i].getAlunos().length; j++) {
				if(this.getTurmas()[i].getAlunos()[j].getEndereco().getCidade().equals(cidade)) {
					System.out.println("Alunas que moram  na cidade de " + cidade + " são: " + this.getTurmas()[i].getAlunos()[j].getNome());
				}
				
			}
		}
		
	}
	
	
}
