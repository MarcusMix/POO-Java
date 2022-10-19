package simulado02;

public class Executavel {

	public static void main(String[] args) {

		Endereco end1 = new Endereco("RUA DAS JUJUBAS",100,"CAMPECHE","FLORIAN�POLIS","SANTA CATARINA");
		Endereco end2 = new Endereco("RUA DAS GOMAS",200,"PEDRA BRANCA","PALHO�A","SANTA CATARINA");
		Endereco end3 = new Endereco("RUA DOS CARAMELOS",300,"KOBRASOL","S�O JOS�","SANTA CATARINA");
		Endereco end4 = new Endereco("RUA DOS PIRULITOS",400,"ESTREITO","FLORIAN�POLIS","SANTA CATARINA");
		Endereco end5 = new Endereco("RUA DOS CHICLETES",500 ,"ARIRI�","PALHO�A","SANTA CATARINA");
		
		Endereco end6 = new Endereco("RUA DOS BOMBONS",600,"FORQUILHINHAS","S�O JOS�","SANTA CATARINA");
		Endereco end7 = new Endereco("RUA DAS  BALAS",700,"CAPOEIRAS","FLORIAN�POLIS","SANTA CATARINA");
		Endereco end8 = new Endereco("RUA DAS TRUFAS",800,"CENTRO","BIGUA�U","SANTA CATARINA");
		Endereco end9 = new Endereco("RUA DOS DOCES",900,"CAMPINAS","S�O JOS�","SANTA CATARINA");
		Endereco end10 = new Endereco("RUA DOS  CONFETES",1000,"CAPOEIRAS","FLORIAN�POLIS","SANTA CATARINA");
		
		Endereco end11 = new Endereco("RUA DAS ENCICLOP�DIAS",500,"CENTRO","FLORIAN�POLIS","SANTA CATARINA");
		Endereco end12 = new Endereco("RUA DOS DICION�RIOS",750,"CENTRO","FLORIAN�POLIS","SANTA CATARINA");
		
		Endereco end13 = new Endereco("RUA DOS ESTUDOS, N�MERO", 1000,"CENTRO","FLORIAN�POLIS","SANTA CATARINA");
		
		Aluno aluno1 = new Aluno ("Juliana Silva", 15, end1);
		Aluno aluno2 = new Aluno ("Daniele Veiga", 14, end2);
		Aluno aluno3 = new Aluno ("Bruna Andrade", 13, end3);
		Aluno aluno4 = new Aluno ("Helena de Andrade", 16, end4);
		Aluno aluno5 = new Aluno ("Mary Souza", 15, end5);
		
		Aluno aluno6 = new Aluno ("Paula Vieira", 14, end6);
		Aluno aluno7 = new Aluno ("Renata Augusta", 15, end7);
		Aluno aluno8 = new Aluno ("Luiza Pires", 15, end8);
		Aluno aluno9 = new Aluno ("Beatriz Santos", 14, end9);
		Aluno aluno10 = new Aluno ("Suellen Lima", 17, end10);
		
		Professor regente1 = new Professor("Zeca", 45, end11, "Matem�tica");
		Professor regente2 = new Professor("Pires", 40, end12, "Portugu�s");
		
		Aluno alunosA[] = {aluno1, aluno2, aluno3, aluno4, aluno5};
		Aluno alunosB[] = {aluno6, aluno7, aluno8, aluno9, aluno10};
		
		Turma turmaA = new Turma(7, regente1, alunosA);
		Turma turmaB = new Turma(8, regente2, alunosB);
		
		Turma turmas[] = {turmaA, turmaB};
		
		Escola escola = new Escola("Escola B�sica das Meninas de Florian�polis", "3232-3232", turmas, end13);
		
		
		//3-A
		escola.contabilizarAlunos();
		System.out.println("\n-------Vers�o Professor--------------------");
		//3-B
		escola.localizarRegente("Pires");
		System.out.println("\n-------Vers�o Marcus--------------------");
		escola.localizarRegente2("Zeca");
		
		//3-C
		System.out.println("\n-------Vers�o Professor--------------------");
		escola.listarAlunasPorSerie(8);
		
		System.out.println("\n-------Vers�o Marcus--------------------");
		escola.listarAlunasPorSerie2(7);
		
		System.out.println("\n-------Vers�o Professor--------------------");
		//3-D
		escola.identificarRegenteMaisNovo();
		
		//3-E
		System.out.println("\n-------Vers�o Professor--------------------");
		escola.listarAlunasPorCidade("PALHO�A");
		
		System.out.println("\n-------Vers�o Marcus--------------------");
		escola.listarAlunasPorCidade2("FLORIAN�POLIS");
	}

}
