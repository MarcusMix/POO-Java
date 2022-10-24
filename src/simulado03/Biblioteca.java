package simulado03;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
		LocalDate obraMaisVelha = this.getListaObras()[0].getDataPublicacao();
		Obra obraMaisVelha1 = listaObras[0];
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getDataPublicacao().isBefore(obraMaisVelha)) {
				obraMaisVelha1 = this.getListaObras()[i];
			}
		}
		System.out.println("\nObra mais antiga: " + obraMaisVelha1);
	}

	public void identificarAutorMaisNovo() {
		LocalDate autorMaisNovo = this.getListaObras()[0].getAutor().getDataNascimento();
		Autor autorMaisNovo1 = this.getListaObras()[0].getAutor();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getDataNascimento().isAfter(autorMaisNovo)) {
				autorMaisNovo1 = this.getListaObras()[i].getAutor();
			}
		}
		System.out.println("\nAutor mais novo: " + autorMaisNovo1);
	}

	public void diferencaAnosAutores() {
		LocalDate autorMaisNovo = this.getListaObras()[0].getAutor().getDataNascimento();
		String autorMaisNovo1 = this.getListaObras()[0].getAutor().getNome();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getDataNascimento().isAfter(autorMaisNovo)) {
				autorMaisNovo1 = this.getListaObras()[i].getAutor().getNome();
			}
		}
		System.out.println("\nAutor mais novo: " + autorMaisNovo1);
		
		LocalDate autorMaisVelho = this.getListaObras()[0].getAutor().getDataNascimento();
		String autorMaisVelho1 = this.getListaObras()[0].getAutor().getNome();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getDataNascimento().isBefore(autorMaisVelho)) {
				autorMaisVelho1 = this.getListaObras()[i].getAutor().getNome();
			}
		}
		
		DateTimeFormatter formatador  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		autorMaisNovo.format(formatador);
//		autorMaisVelho.format(formatador);
		System.out.println("\nAutor mais Velho: " + autorMaisVelho1);
//		LocalDate diferencaDias = autorMaisVelho.minus();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//		LocalDate autorMaisVelho2 = LocalDate.parse(autorMaisVelho, formatter);
//		LocalDate autorMaisNovo2 = LocalDate.parse(autorMaisNovo, formatter);
//		long elapsedDays = ChronoUnit.DAYS.between(autorMaisVelho2, autorMaisNovo2);
//		System.out.println("Diferença de dias entre os autores é de: " + (autorMaisVelho.format(formatador) - autorMaisNovo.format(formatador)));
//		System.out.println(elapsedDays);
	}

	public void localizarEnderecoAutor(String nome) {
		Endereco endLocalizado = new Endereco();
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getNome().equals(nome)) {
				endLocalizado =  this.getListaObras()[i].getAutor().getEnderecoAutor();
			}
		}
		System.out.println("Endereço do autor desejado: " + endLocalizado);
	}

	public void listarAutoresCidades(String cidade) {
		System.out.println("Moram na cidade " +  cidade + " os seguintes autores: ");
		for(int i = 0; i < this.getListaObras().length; i++) {
			if(this.getListaObras()[i].getAutor().getEnderecoAutor().getCidade().equals(cidade)) {
				System.out.println(getListaObras()[i].getAutor().getNome()); 
			}
		}
	}
	
	
	
}


