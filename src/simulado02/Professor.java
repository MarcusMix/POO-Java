package simulado02;

public class Professor extends Pessoa{
	private String disciplina;

	public Professor(String nome, int idade, String disciplina) {
		super(nome, idade);
		this.disciplina = disciplina;
	}

	public Professor() {
		super();
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
