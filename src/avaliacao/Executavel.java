package avaliacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Executavel {

	public static void main(String[] args) {
		
		Contato con1 = new Contato("91111-1111", "carlos@gmail.com");
		Contato con2 = new Contato("92222-2222", "zeca@gmail.com");
		Contato con3 = new Contato("93333-3333", "vera@gmail.com");
		Contato con4 = new Contato("94444-4444", "bia@gmail.com");
		Contato con5 = new Contato("95555-5555", "cintia@gmail.com");
		Contato con6 = new Contato("96666-6666", "miguel@gmail.com");
		Contato con7 = new Contato("97777-7777", "monique@gmail.com");
		Contato con8 = new Contato("98888-8888", "solange@gmail.com");
		Contato con9 = new Contato("99999-9999", "luciano@gmail.com");
		Contato con10 = new Contato("91010-1010", "flavio@gmail.com");
		Contato con11 = new Contato("91100-1100", "ronaldo@gmail.com");
		Contato con12 = new Contato("92200-2200", "jorge@gmail.com");
		
		Documento doc1 = new Documento("FX-1111");
		Documento doc2 = new Documento("FX-2222");
		Documento doc3 = new Documento("FX-3333");
		Documento doc4 = new Documento("FX-4444");
		Documento doc5 = new Documento("FX-5555");
		Documento doc6 = new Documento("FX-6666");
		Documento doc7 = new Documento("FX-7777");
		Documento doc8 = new Documento("FX-8888");
		Documento doc9 = new Documento("FX-9999");
		Documento doc10 = new Documento("FX-1010");
		Documento doc11 = new Documento("FX-1100");
		Documento doc12 = new Documento("FX-2200");
		
		LocalDate dtNas1 = LocalDate.of(1992, 1, 10);
		LocalDate dtNas2 = LocalDate.of(1987, 2, 10);
		LocalDate dtNas3 = LocalDate.of(1980, 3, 10);
		LocalDate dtNas4 = LocalDate.of(1995, 4, 10);
		LocalDate dtNas5 = LocalDate.of(2000, 5, 10);
		LocalDate dtNas6 = LocalDate.of(1977, 6, 10);
		LocalDate dtNas7 = LocalDate.of(2001, 7, 10);
		LocalDate dtNas8 = LocalDate.of(1993, 8, 10);
		LocalDate dtNas9 = LocalDate.of(1989, 9, 10);
		LocalDate dtNas10 = LocalDate.of(1990, 10, 10);
		LocalDate dtNas11 = LocalDate.of(1972, 11, 10);
		LocalDate dtNas12 = LocalDate.of(1968, 12, 10);
		
		Passageiro pas1 = new Passageiro("Carlos", dtNas1, 'M', doc1, con1);
		Passageiro pas2 = new Passageiro("Zeca", dtNas2, 'M', doc2, con2);
		Passageiro pas3 = new Passageiro("Vera", dtNas3, 'F', doc3, con3);
		Passageiro pas4 = new Passageiro("Bia", dtNas4, 'F', doc4, con4);
		Passageiro pas5 = new Passageiro("Cintia", dtNas5, 'F', doc5, con5);
		Passageiro pas6 = new Passageiro("Miguel", dtNas6, 'M', doc6, con6);
		Passageiro pas7 = new Passageiro("Monique", dtNas7, 'F', doc7, con7);
		Passageiro pas8 = new Passageiro("Solange", dtNas8, 'F', doc8, con8);
		Passageiro pas9 = new Passageiro("Luciano", dtNas9, 'M', doc9, con9);
		
		LocalDateTime dataHora1 = LocalDateTime.of(2022, 10, 5, 9, 15, 0);
		LocalDateTime dataHora2 = LocalDateTime.of(2022, 10, 5, 9, 15, 0);
		LocalDateTime dataHora3 = LocalDateTime.of(2022, 10, 5, 9, 15, 0);
		LocalDateTime dataHora4 = LocalDateTime.of(2022, 10, 15, 12, 30, 0);
		LocalDateTime dataHora5 = LocalDateTime.of(2022, 10, 15, 12, 30, 0);
		LocalDateTime dataHora6 = LocalDateTime.of(2022, 10, 15, 12, 30, 0);
		LocalDateTime dataHora7 = LocalDateTime.of(2022, 10, 25, 15, 45, 0);
		LocalDateTime dataHora8 = LocalDateTime.of(2022, 10, 25, 15, 45, 0);
		LocalDateTime dataHora9 = LocalDateTime.of(2022, 10, 25, 15, 45, 0);
		
		Passagem pass1 = new Passagem(120, dataHora1, pas1);
		Passagem pass2 = new Passagem(120, dataHora2, pas2);
		Passagem pass3 = new Passagem(120, dataHora3, pas3);
		Passagem pass4 = new Passagem(150, dataHora4, pas4);
		Passagem pass5 = new Passagem(150, dataHora5, pas5);
		Passagem pass6 = new Passagem(150, dataHora6, pas6);
		Passagem pass7 = new Passagem(180, dataHora7, pas7);
		Passagem pass8 = new Passagem(180, dataHora8, pas8);
		Passagem pass9 = new Passagem(180, dataHora9, pas9);
		
		Maquinista maq1 = new Maquinista("Flavio", dtNas10, 'M', doc10, con10, 3500);
		Maquinista maq2 = new Maquinista("Ronaldo", dtNas11, 'M', doc11, con11, 3900);
		Maquinista maq3 = new Maquinista("Jorge", dtNas12, 'M', doc12, con12, 4100);

		LocalDate fab1 = LocalDate.of(1945, 6, 10);
		LocalDate fab2 = LocalDate.of(1947, 9, 10);
		LocalDate fab3 = LocalDate.of(1942, 12, 10);
		
		Trem trem1 = new Trem(1250, fab1, maq1);
		Trem trem2 = new Trem(2410, fab2, maq2);
		Trem trem3 = new Trem(1005, fab3, maq3);
		
		Passagem[] lista1 = {pass1, pass2, pass3};
		Passagem[] lista2 = {pass4, pass5, pass6};
		Passagem[] lista3 = {pass7, pass8, pass9};
		
		Linha linha1 = new Linha("Paris-Londres", trem1, lista1);
		Linha linha2 = new Linha("Lisboa-Madri", trem2, lista2);
		Linha linha3 = new Linha("Roma-Berlim", trem3, lista3);
		
		Linha[] listaLinhas = {linha1, linha2, linha3};
		Empresa emp = new Empresa("Locomotiva Senac", listaLinhas);
		
		
		//2-A
		double total = emp.calcularFaturamento();
		System.out.println("Total faturado da empresa é: " +  total);
		System.out.println("------------------\n");
		
		//2-B
		emp.identificarTremMaisAntigo();
		System.out.println("------------------\n");
		
		//2-C
		emp.identificarMaquinistaMaisNovo();
		System.out.println("------------------\n");
		
		//2-D
		Period diferenca = emp.identificarDiferecaIdadePassageiroMaisNovoMaisIdoso();
		System.out.println("A diferença é de : " + diferenca);
		System.out.println("Anos: " + diferenca.getYears() + " - Meses: " +  diferenca.getMonths() + " - Dias: " + diferenca.getDays());
		System.out.println("------------------\n");
		
		//2-E
		emp.calcularPercentualPassageirosHomensMulheres();
		System.out.println("------------------\n");
		
		//2-F
		emp.listarContatoPassageiro("Luciano");
		System.out.println("------------------\n");
		
		//2-G
		emp.listarPassageirosPorTrechoLinha("Lisboa-Madri");
		System.out.println("------------------\n");
		
		//2-H
		emp.identificarPassageiroPorPassaporte("FX-5555");
		System.out.println("------------------\n");
		
		//2-I
		LocalDateTime horario = emp.mostrarHorarioTremPorTrechoLinha("Roma-Berlim");
		System.out.println("Horário do Trem: " + horario.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println("------------------\n");
		
		//2-J
		double preco = emp.informarPrecoPassagemPorNumeroTrem(2410);
		System.out.println("Valor da passagem do trem é: R$" + preco);
		System.out.println("------------------\n");
		
	}

}
