package simulado03;

import java.time.LocalDate;

public class Executavel {

	public static void main(String[] args) {

		LocalDate dataNascimento1 = LocalDate.of(1946, 10, 01);
		LocalDate dataNascimento2 = LocalDate.of(1915, 03, 15);
		LocalDate dataNascimento3 = LocalDate.of(1927, 05, 21);
		LocalDate dataNascimento4 = LocalDate.of(1934, 06, 04);
		
		LocalDate dataPub1 = LocalDate.of(2012, 12, 01);
		LocalDate dataPub2 = LocalDate.of(2013, 06, 01);
		LocalDate dataPub3 = LocalDate.of(2011, 9, 01);
		LocalDate dataPub4 = LocalDate.of(2010, 04, 01);
		
		LocalDate dataPub5 = LocalDate.of(1983, 01, 30);
		LocalDate dataPub6 = LocalDate.of(1892, 05, 13);
		LocalDate dataPub7 = LocalDate.of(1934, 11, 20);
		LocalDate dataPub8 = LocalDate.of(1941, 07, 28);
		
		
		Endereco end1 = new Endereco("Rua das Maças", 100, "Ingleses", "FLORIANÓPOLIS", "SC");
		Endereco end2 = new Endereco("RUA DAS LARANJAS", 200, "ARIRIU","PALHOÇA","SANTA CATARINA");
		Endereco end3 = new Endereco("RUA DAS UVAS", 300,"PEDRA BRANCA","PALHOÇA","SANTA CATARINA");
		Endereco end4 = new Endereco("RUA DAS MELANCIAS", 400,"ESTREITO","FLORIANÓPOLIS","SANTA CATARINA");
		
		Endereco end5 = new Endereco("RUA DAS MANGAS",600,"CENTRO","FLORIANÓPOLIS","SANTA CATARINA");
		
		
		
		Autor autor1 = new Autor("Carlos Drummond", dataNascimento1, end1);
		Autor autor2 = new Autor("Machado de Assis", dataNascimento2, end2);
		Autor autor3 = new Autor("Cecilia Meireles", dataNascimento3, end3);
		Autor autor4 = new Autor("Osvald Andrade", dataNascimento4, end4);
		
		Revista revista1 = new Revista("Veja", 60, dataPub1, autor1);
		Revista revista2 = new Revista("IstoÉ", 80, dataPub2, autor2);
		Revista revista3 = new Revista("Auto Esporte", 20, dataPub3, autor3);
		Revista revista4 = new Revista("Super Interessante", 100, dataPub4, autor4);
		
		Livro livro1 = new Livro("Brejo das Almas", 8, dataPub5, autor1);
		Livro livro2 = new Livro("Quincas Borba", 1, dataPub6, autor2);
		Livro livro3 = new Livro("Colar de Carolina", 3, dataPub7, autor3);
		Livro livro4 = new Livro("Os Condenados", 7, dataPub8, autor4);
		
		
		Obra obras[] = {revista1, revista2, revista3, revista4, livro1, livro2, livro3, livro4};
		
		Biblioteca biblioteca = new Biblioteca("Central", obras, end5);
		
		
//		3-A
		biblioteca.contabilizarObras();
		System.out.println("---------------------------------");
		
//		3-B
		biblioteca.identificarObraAntiga();
		System.out.println("---------------------------------");
		
//		3-C
		biblioteca.identificarAutorMaisNovo();
		System.out.println("---------------------------------");
		
//		3-D
		biblioteca.diferencaAnosAutores();		
		System.out.println("---------------------------------");
		
//		3-E
		biblioteca.localizarEnderecoAutor("Osvald Andrade");
		System.out.println("---------------------------------");
		biblioteca.localizarEnderecoAutor("Cecilia Meireles");
		System.out.println("---------------------------------");
		
//		3-F
		biblioteca.listarAutoresCidades("FLORIANÓPOLIS");
		System.out.println("---------------------------------");
		biblioteca.listarAutoresCidades("PALHOÇA");
	}

}
