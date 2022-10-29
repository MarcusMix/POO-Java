package simulado02;

public class Professor extends Pessoa {
	private String disciplina;

	public Professor(String nome, int idade, Endereco endereco, String disciplina) {
		super(nome, idade, endereco);
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
