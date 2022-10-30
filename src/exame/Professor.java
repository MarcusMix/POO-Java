package exame;

public class Professor extends Pessoa{
	private String  disciplina;

	public Professor(String pessoa, int idade, Endereco endereco, String disciplina) {
		super(pessoa, idade, endereco);
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
