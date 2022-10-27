package simulado03;

import java.time.LocalDate;

public class Executavel {

	public static void main(String[] args) {

		//Endere�os autores
		Endereco end1 = new Endereco("RUA DAS MA�AS", 100, "INGLESES", "FLORIAN�POLIS", "SANTA CATERINA");
		Endereco end2 = new Endereco("RUA DAS LARANJAS", 200, "ARIRIU","PALHO�A","SANTA CATARINA");
		Endereco end3 = new Endereco("RUA DAS UVAS", 300,"PEDRA BRANCA","PALHO�A","SANTA CATARINA");
		Endereco end4 = new Endereco("RUA DAS MELANCIAS", 400,"ESTREITO","FLORIAN�POLIS","SANTA CATARINA");
		
		//Endere�o biblioteca
		Endereco end5 = new Endereco("RUA DAS MANGAS",600,"CENTRO","FLORIAN�POLIS","SANTA CATARINA");

		//Data nascimento autores
		LocalDate dataNascimento1 = LocalDate.of(1946, 10, 01);
		LocalDate dataNascimento2 = LocalDate.of(1915, 03, 15);
		LocalDate dataNascimento3 = LocalDate.of(1927, 05, 21);
		LocalDate dataNascimento4 = LocalDate.of(1934, 06, 04);
		
		//Data publica��o revistas
		LocalDate dataPub1 = LocalDate.of(2012, 12, 01);
		LocalDate dataPub2 = LocalDate.of(2013, 06, 01);
		LocalDate dataPub3 = LocalDate.of(2011, 9, 01);
		LocalDate dataPub4 = LocalDate.of(2010, 04, 01);
		
		//Data publica��o livros
		LocalDate dataPub5 = LocalDate.of(1983, 01, 30);
		LocalDate dataPub6 = LocalDate.of(1892, 05, 13);
		LocalDate dataPub7 = LocalDate.of(1934, 11, 20);
		LocalDate dataPub8 = LocalDate.of(1941, 07, 28);
		
		//Autores
		Autor autor1 = new Autor("Carlos Drummond", dataNascimento1, end1);
		Autor autor2 = new Autor("Machado de Assis", dataNascimento2, end2);
		Autor autor3 = new Autor("Cecilia Meireles", dataNascimento3, end3);
		Autor autor4 = new Autor("Osvald Andrade", dataNascimento4, end4);
		
		//Revistas
		Revista revista1 = new Revista("Veja", 60, dataPub1, autor1);
		Revista revista2 = new Revista("Isto�", 80, dataPub2, autor2);
		Revista revista3 = new Revista("Auto Esporte", 20, dataPub3, autor3);
		Revista revista4 = new Revista("Super Interessante", 100, dataPub4, autor4);
		
		//Livros
		Livro livro1 = new Livro("Brejo das Almas", 8, dataPub5, autor1);
		Livro livro2 = new Livro("Quincas Borba", 1, dataPub6, autor2);
		Livro livro3 = new Livro("Colar de Carolina", 3, dataPub7, autor3);
		Livro livro4 = new Livro("Os Condenados", 7, dataPub8, autor4);
		
		//Todas as obras juntas
		Obra obras[] = {revista1, revista2, revista3, revista4, livro1, livro2, livro3, livro4};
		
		//Biblioteca
		Biblioteca biblioteca = new Biblioteca("Central", obras, end5);
		
		
		//Quest�o 3
		
		//3-A
		biblioteca.contabilizarObras();
		System.out.println("---------------------------------");
		
		//3-B
		biblioteca.identificarObraAntiga();
		System.out.println("---------------------------------");
		
		//3-C
		biblioteca.identificarAutorMaisNovo();
		System.out.println("---------------------------------");
		
		//3-D
		biblioteca.diferencaAnosAutores();		
		System.out.println("---------------------------------");
		
		//3-E
		biblioteca.localizarEnderecoAutor("Cecilia Meireles");
		System.out.println("---------------------------------");
		
		//3-F
		biblioteca.listarAutoresCidades("FLORIAN�POLIS");

	}

}
