package avaliacao;

import java.time.LocalDate;

public class Passageiro extends Pessoa{

	public Passageiro(String nome, LocalDate dataNascimento, char sexo, Documento documento, Contato contato) {
		super(nome, dataNascimento, sexo, documento, contato);
	}
	
	public Passageiro() {
		super();
	}

}
