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
	
	
}
