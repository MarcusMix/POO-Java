package biblioteca;

import java.time.Period;
import java.util.HashSet;

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

	public int contabilizarObras() {
		return this.getListaObras().length;
	}

	public void obraMaisAntiga() {
		Obra obraAntiga = this.getListaObras()[0];
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(obraAntiga.getDataPublicacao().isAfter(this.getListaObras()[i].getDataPublicacao())) {
				obraAntiga = this.getListaObras()[i];
			}
		}
		System.out.println("Obra mais antiga da biblioteca: " + obraAntiga);
		
	}

	public void identificarAutorMaisNovo() {
		Autor autorNovo = this.getListaObras()[0].getAutor();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(autorNovo.getDataNascimento().isBefore(this.getListaObras()[i].getAutor().getDataNascimento())) {
				autorNovo = this.getListaObras()[i].getAutor();
			}
		}
		System.out.println("Autor mais novo: " + autorNovo);
	}

	public void diferencaEntreIdadeAutorMaisNovoEMaisVelho() {
		Autor autorNovo = this.getListaObras()[0].getAutor();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(autorNovo.getDataNascimento().isBefore(this.getListaObras()[i].getAutor().getDataNascimento())) {
				autorNovo = this.getListaObras()[i].getAutor();
			}
		}
		
		Autor autorVelho = this.getListaObras()[0].getAutor();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(autorVelho.getDataNascimento().isAfter(this.getListaObras()[i].getAutor().getDataNascimento())) {
				autorVelho = this.getListaObras()[i].getAutor();
			}
		}
		
		Period diferenca = Period.between(autorVelho.getDataNascimento(), autorNovo.getDataNascimento());
		System.out.println("A diferença entre o autor mais novo e velho é de: ");
		System.out.println(diferenca.getYears() + " Anos");
		System.out.println(diferenca.getMonths() + " Meses");
		System.out.println(diferenca.getDays() + " Dias");
	}

	public void localizarEnderecoDoAutor(String nome) {
		for(int i = 0; i < this.getListaObras().length; i++)	{
			if(this.getListaObras()[i].getAutor().getNome().equals(nome)) {
				System.out.println("Endereço do " + nome + ": " + this.getListaObras()[i].getAutor().getEnderecoAutor());
			}
		}
	}

	public void listarAutoresQueMoramNaCidade(String cidade) {
		HashSet<Autor> listaAutores = new HashSet<Autor>();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getEnderecoAutor().getCidade().equals(cidade)) {
				listaAutores.add(this.getListaObras()[i].getAutor());
			}	
		}
		System.out.println("Lista ds autores que moram na cidade " + cidade);
		for(Autor autor : listaAutores) {
			System.out.println(autor.getNome());
		}
		
	}
}
