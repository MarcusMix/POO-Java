package avaliacao;

import java.time.LocalDate;

public class Maquinista extends Pessoa{
	
	private double salario;

	public Maquinista(String nome, LocalDate dataNascimento, char sexo, Documento documento, Contato contato,
			double salario) {
		super(nome, dataNascimento, sexo, documento, contato);
		this.salario = salario;
	}

	public Maquinista() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
