package simulado03;

public class Biblioteca {
	private String nome;
	private Obra[] listaObras;
	private Endereco enderecoBiblioteca;
	
	public Biblioteca(String nome, Obra[] listaObras, Endereco enderecoBiblioteca) {
		super();
		this.nome = nome;
		this.listaObras = listaObras;
		this.enderecoBiblioteca = enderecoBiblioteca;
	}

	public Biblioteca() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Obra[] getListaObras() {
		return listaObras;
	}

	public void setListaObras(Obra[] listaObras) {
		this.listaObras = listaObras;
	}

	public Endereco getEnderecoBiblioteca() {
		return enderecoBiblioteca;
	}

	public void setEnderecoBiblioteca(Endereco enderecoBiblioteca) {
		this.enderecoBiblioteca = enderecoBiblioteca;
	}

	public void contabilizarObras() {
		System.out.println("A quantidade de obras na biblioteca é: " + this.getListaObras().length);
	}
//
//	public void identificarObraAntiga() {
//		for(int i = 0; i < this.getListaObras().length; i++) {
//			this.getListaObras()[i].identificarObraAntiga();
//		}
//	}
//	
	
}
