package simulado03;

import java.time.LocalDate;

public abstract class Obra {
	private String titulo;
	private int edicao;
	private LocalDate dataPublicacao;
	private Autor autor;
	
	
	public Obra(String titulo, int edicao, LocalDate dataPublicacao, Autor autor) {
		super();
		this.titulo = titulo;
		this.edicao = edicao;
		this.dataPublicacao = dataPublicacao;
		this.autor = autor;
	}


	public Obra() {
		super();
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getEdicao() {
		return edicao;
	}


	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}


	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}


	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "\nTítulo: "+ this.getTitulo() +
				"\nEdicao: " + this.getEdicao() + 
				"\nData de Publicação: " + this.getDataPublicacao() +
				"\nAutor: " + this.getAutor();
	}
	
	
}
