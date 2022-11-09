package avaliacao;

import java.time.LocalDate;

public abstract class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private char sexo;
	private Documento documento;
	private Contato contato;
	
	public Pessoa(String nome, LocalDate dataNascimento, char sexo, Documento documento, Contato contato) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.documento = documento;
		this.contato = contato;
	}

	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + 
				"\nData de Nascimento: " + this.getDataNascimento() + 
				"\nSexo: " + this.getSexo() + 
				"\nDocumento: " + this.getDocumento() + 
				"\nContato: " + this.getContato();
	}
	

}
