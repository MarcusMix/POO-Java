package simulado03;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

	public void identificarObraAntiga() {
		Obra obraMaisVelha1 = this.getListaObras()[0];
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getDataPublicacao().isBefore(obraMaisVelha1.getDataPublicacao())) {
				obraMaisVelha1 = this.getListaObras()[i];
			}
		}
		System.out.println("\nObra mais antiga: " + obraMaisVelha1);
	}

	public void identificarAutorMaisNovo() {
		Autor autorMaisNovo = this.getListaObras()[0].getAutor();
		Autor autorMaisNovo1 = this.getListaObras()[0].getAutor();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
				autorMaisNovo = this.getListaObras()[i].getAutor();
			}
		}
		System.out.println("\nAutor mais novo: " + autorMaisNovo);
	}

	public void diferencaAnosAutores() {
		Autor autorMaisNovo = this.getListaObras()[0].getAutor();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getDataNascimento().isAfter(autorMaisNovo.getDataNascimento())) {
				autorMaisNovo = this.getListaObras()[i].getAutor();
			}
		}
		System.out.println("\nAutor mais novo: " + autorMaisNovo.getNome());
		

		Autor autorMaisVelho = this.getListaObras()[0].getAutor();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getDataNascimento().isBefore(autorMaisVelho.getDataNascimento())) {
				autorMaisVelho = this.getListaObras()[i].getAutor();
			}
		}
		System.out.println("\nAutor mais Velho: " + autorMaisVelho.getNome());
		
		Period diferenca = Period.between(autorMaisVelho.getDataNascimento(), autorMaisNovo.getDataNascimento());
		System.out.println("\n"+diferenca.getYears() + " anos");
		System.out.println(diferenca.getMonths() + " meses");
		System.out.println(diferenca.getDays() + " dias");
	}		

	public void localizarEnderecoAutor(String nome) {
		Endereco endLocalizado = new Endereco();
		String autorNome = "";
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getNome().equals(nome)) {
				endLocalizado =  this.getListaObras()[i].getAutor().getEnderecoAutor();
				autorNome = this.getListaObras()[i].getAutor().getNome();
			}
		}
		System.out.println("Endereço do(a) " + autorNome + ": ");
		System.out.println(endLocalizado);
	}

	public void listarAutoresCidades(String cidade) {
		System.out.println("Moram na cidade " +  cidade + " os seguintes autores: ");
		int contador = 0;
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getEnderecoAutor().getCidade().equals(cidade)) {
				System.out.println(getListaObras()[i].getAutor().getNome()); 
			}
		}
	}	
}


