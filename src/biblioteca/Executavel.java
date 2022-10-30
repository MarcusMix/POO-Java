package biblioteca;

import java.time.LocalDate;

public class Executavel {

	public static void main(String[] args) {
		
		//endereços
		Endereco end1 = new Endereco("RUA DAS MAÇAS", 100,"INGLESES","FLORIANÓPOLIS","SANTA CATARINA");
		Endereco end2 = new Endereco("RUA DAS LARANJAS", 200,"ARIRIU","PALHOÇA","SANTA CATARINA");
		Endereco end3 = new Endereco("RUA DAS UVAS", 300,"PEDRA BRANCA","PALHOÇA","SANTA CATARINA");
		Endereco end4 = new Endereco("RUA DAS MELANCIAS", 400,"ESTREITO","FLORIANÓPOLIS","SANTA CATARINA");

		//endereco biblioteca
		Endereco end5 = new Endereco("RUA DAS MANGAS", 600,"CENTRO","FLORIANÓPOLIS","SANTA CATARINA");

		//data de nascimento
		LocalDate dataNasc1 = LocalDate.of(1946, 10, 01);
		LocalDate dataNasc2 = LocalDate.of(1915, 03, 15);
		LocalDate dataNasc3 = LocalDate.of(1927, 05, 21);
		LocalDate dataNasc4 = LocalDate.of(1934, 06, 04);
		
		//data de publicação revistas
		LocalDate dataPub1 = LocalDate.of(2012, 12, 01);
		LocalDate dataPub2 = LocalDate.of(2013, 03, 01);
		LocalDate dataPub3 = LocalDate.of(2011, 9, 01);
		LocalDate dataPub4 = LocalDate.of(2010, 04, 01);
		
		//data de publicação livros
		LocalDate dataPub5 = LocalDate.of(1983, 01, 30);
		LocalDate dataPub6 = LocalDate.of(1892, 05, 13);
		LocalDate dataPub7 = LocalDate.of(1934, 11, 20);
		LocalDate dataPub8 = LocalDate.of(1941, 07, 28);
		
		//autores
		Autor autor1 = new Autor("Carlos Drummond", dataNasc1, end1);
		Autor autor2 = new Autor("Machado de Assis", dataNasc2, end2);
		Autor autor3 = new Autor("Cecilia Meireles", dataNasc3, end3);
		Autor autor4 = new Autor("Osvald Andrade", dataNasc4, end4);
		
		//revistas
		Revista revista1 = new Revista("Veja", 60, dataPub1, autor1);
		Revista revista2 = new Revista("IstoÉ", 80, dataPub2, autor2);
		Revista revista3 = new Revista("Auto Esporte", 20, dataPub3, autor3);
		Revista revista4 = new Revista("Super Interessante", 100, dataPub4, autor4);
		
		//livros
		Livro livro1 = new Livro("Brejo das Almas", 8, dataPub5, autor1);
		Livro livro2 = new Livro("Quincas Borba", 8, dataPub6, autor2);
		Livro livro3 = new Livro("Colar de Carolina", 8, dataPub7, autor3);
		Livro livro4 = new Livro("Os Condenados", 8, dataPub8, autor4);
		
		//lista obras
		Obra[] listaObras = {revista1, revista2, revista3, revista4, livro1, livro2, livro3, livro4};
		
		//biclioteca
		Biblioteca biblioteca = new Biblioteca("Central", listaObras, end5);
		
		
		//3-A
		int totalDeObras = biblioteca.contabilizarObras();
		System.out.println("Total de obras da biblioteca : " + totalDeObras);
		
		//3-B
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		biblioteca.obraMaisAntiga();
		
		//3-C
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		biblioteca.identificarAutorMaisNovo();
		
		//3-D
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		biblioteca.diferencaEntreIdadeAutorMaisNovoEMaisVelho();
		
		//3-E
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		biblioteca.localizarEnderecoDoAutor("Osvald Andrade");
		
		//3-F
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		biblioteca.listarAutoresQueMoramNaCidade("FLORIANÓPOLIS");
	}

}
