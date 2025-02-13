package exame;

public class Executavel {

	public static void main(String[] args) {
		
		//endere�o meninas
		Endereco end1 = new Endereco("RUA DAS JUJUBAS", 100,"CAMPECHE","FLORIAN�POLIS","SANTA CATARINA");
		Endereco end2 = new Endereco("RUA DAS GOMAS", 200,"PEDRA BRANCA","PALHO�A","SANTA CATARINA");
		Endereco end3 = new Endereco("RUA DOS CARAMELOS", 300,"KOBRASOL","S�O JOS�","SANTA CATARINA");
		Endereco end4 = new Endereco("RUA DOS PIRULITOS", 400,"ESTREITO","FLORIAN�POLIS","SANTA CATARINA");
		Endereco end5 = new Endereco("RUA DOS CHICLETES", 500,"ARIRI�","PALHO�A","SANTA CATARINA");
		Endereco end6 = new Endereco("RUA DOS BOMBONS", 600,"FORQUILHINHAS","S�O JOS�","SANTA CATARINA");
		Endereco end7 = new Endereco("RUA DAS BALAS", 700, "CAPOEIRAS","FLORIAN�POLIS","SANTA CATARINA");
		Endereco end8 = new Endereco("RUA DAS TRUFAS", 800, "CENTRO","BIGUA�U","SANTA CATARINA");
		Endereco end9 = new Endereco("RUA DOS DOCES", 900, "CAMPINAS","S�O JOS�","SANTA CATARINA");
		Endereco end10 = new Endereco("RUA DOS CONFETES", 1000, "CAPOEIRAS","FLORIAN�POLIS","SANTA CATARINA");
		
		//endere�o professores
		Endereco end11 = new Endereco("RUA DAS ENCICLOP�DIAS", 500, "CENTRO","FLORIAN�POLIS","SANTA CATARINA");
		Endereco end12 = new Endereco("RUA DOS DICION�RIOS", 750,"CENTRO","FLORIAN�POLIS","SANTA CATARINA");
		
		//endereco escola
		Endereco end13 = new Endereco("RUA DOS ESTUDOS",1000,"CENTRO","FLORIAN�POLIS","SANTA CATARINA");
		
		//Alunas
		Aluno aluno1 = new Aluno("Juliana Silva", 15, end1);
		Aluno aluno2 = new Aluno("Daniele Veiga", 14, end2);
		Aluno aluno3 = new Aluno("Bruna Andrade", 13, end3);
		Aluno aluno4 = new Aluno("Helena de Andrade", 16, end4);
		Aluno aluno5 = new Aluno("Mary Souza", 15, end5);
		Aluno aluno6 = new Aluno("Paula Vieira", 14, end6);
		Aluno aluno7 = new Aluno("Renata Augusta", 15, end7);
		Aluno aluno8 = new Aluno("Luiza Pires", 15, end8);
		Aluno aluno9 = new Aluno("Beatriz Santos", 14, end9);
		Aluno aluno10 = new Aluno("Suellen Lima", 17, end10);
		
		//Professores
		Professor professor1 = new Professor("Zeca", 45, end11, "Matem�tica");
		Professor professor2 = new Professor("Pires", 40, end12, "Portugu�s");

		
		//Alunos
		Aluno[] listaAlunosA = {aluno1, aluno2, aluno3, aluno4, aluno5};
		Aluno[] listaAlunosB = {aluno6, aluno7, aluno8, aluno9, aluno10};
		
		//Turmas
		Turma turmaA = new Turma(7, listaAlunosA, professor1);
		Turma turmaB = new Turma(8, listaAlunosB, professor2);
		
		Turma turmas[] = {turmaA, turmaB};
			
		//Escola
		Escola escola = new Escola("Escola B�sica das Meninas de Florian�polis", "3232-3232", end13, turmas);

		
		
		//3-A
		escola.contabilizarAlunos();
		
		//3-B
		System.out.println("-------------------");
		escola.localizarRegentePorNome("Zeca");
		
		//3-C
		System.out.println("-------------------");
		escola.listarNomeAlunasPorSerie(7);
		System.out.println("-------------------");
		escola.listarNomeAlunasPorSerie(8);
		
		//4-D
		System.out.println("-------------------");
		escola.identificarRegenteMaisNovo();
		
		//5-D
		System.out.println("-------------------");
		escola.listarAlunasPorCidade("FLORIAN�POLIS");
	}

}
