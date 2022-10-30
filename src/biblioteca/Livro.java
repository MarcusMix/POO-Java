package biblioteca;

import java.time.LocalDate;

public class Livro extends Obra {

	public Livro() {
		super();
	}

	public Livro(String titulo, int edicao, LocalDate dataPublicacao, Autor autor) {
		super(titulo, edicao, dataPublicacao, autor);
	}

}
