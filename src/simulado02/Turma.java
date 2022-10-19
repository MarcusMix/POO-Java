package simulado02;

public class Turma {
	private int serie;
	private Professor regente;
	private Aluno[] alunos;
	
	public Turma(int serie, Professor regente, Aluno[] alunos) {
		super();
		this.serie = serie;
		this.regente = regente;
		this.alunos = alunos;
	}

	public Turma() {
		super();
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public Professor getRegente() {
		return regente;
	}

	public void setRegente(Professor regente) {
		this.regente = regente;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public void localizarRegente(String nome) {
		if(this.getRegente().getNome().equals(nome)) {
			System.out.println("Endereço do Regente: " + nome);
			System.out.println(this.getRegente().getEndereco());
		}
		
	}

	public void listarAlunasPorSerie() {
		System.out.println("Alunas da série: " + this.getSerie());
		for(int i = 0; i < this.getAlunos().length; i++) {
			System.out.println(this.getAlunos()[i].getNome());
		}
		
	}

	public void listarAlunasPorCidade(String cidade) {
		for(int i = 0; i < this.getAlunos().length; i++) {
			if(this.getAlunos()[i].getEndereco().getCidade().equals(cidade)) {
				System.out.println(this.getAlunos()[i].getNome());
			}
		}
		
	}
	
	
}
