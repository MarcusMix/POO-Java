package biblioteca;

import java.time.LocalDate;

public class Revista extends Obra {

	public Revista() {
		super();
	}

	public Revista(String titulo, int edicao, LocalDate dataPublicacao, Autor autor) {
		super(titulo, edicao, dataPublicacao, autor);
	}

}
