package poo;

public class Executavel {

	public static void main(String[] args) {
		
		//endereço laboratorio
		Endereco end1 = new Endereco("RUA DOS REMÉDIOS",100 ,"CENTRO" ,"PALHOÇA","SANTA CATARINA");
		Endereco end2 = new Endereco("RUA DA MEDICAÇÃO", 200,"ESTREITO","FLORIANÓPOLIS","SANTA CATARINA");
		
		//endereço farmacia
		Endereco end3 = new Endereco("RUA JARDIM SILVA", 360,"CENTRO","FLORIANÓPOLIS","SANTA CATARINA");
		
		//laboratorios
		Laboratorio legrand = new Laboratorio("Legrand", "12.345.678/0001-11", end1);		
		Laboratorio medley = new Laboratorio("Medley", "12.345.678/0001-22", end2);	
		
		//remedios legrand
		Remedio remedio1 = new Remedio("Rosuvas", 55, legrand);
		Remedio remedio2 = new Remedio("Glifage", 35, legrand);
		Remedio remedio3 = new Remedio("Aradois H", 50, legrand);
		Remedio remedio4 = new Remedio("Trandilax", 10, legrand);
		
		//remedios medley
		Remedio remedio5 = new Remedio("Rosuvastatina", 50, medley);
		Remedio remedio6 = new Remedio("Lexotan", 40, medley);
		Remedio remedio7 = new Remedio("Losartana", 45, medley);
		Remedio remedio8 = new Remedio("Torsilax", 15, medley);
		
		//remedios
		Remedio[] remedios = {  remedio1, remedio1, remedio1, remedio1,
								remedio2, remedio2, remedio2,
								remedio3, remedio3,
								remedio4,
								remedio5,
								remedio6, remedio6,
								remedio7, remedio7, remedio7,
								remedio8, remedio8, remedio8, remedio8
							};
		
		//estoque
		Estoque estoque = new Estoque("Luciano", remedios);
		
		//farmacia
		Farmacia farmacia = new Farmacia("Farmacia do Senac", "12.345.678/0001-33", end3, estoque);
		
		
		//3-A
		String responsavel = farmacia.informarNomeResponsavel();
		System.out.println("Responsável: " + responsavel);
		System.out.println("-------------------------------------");
		
		//3-B
		farmacia.calcularValorTotal();
		System.out.println("-------------------------------------");
		
		//3-C
		farmacia.calcularValorTotalLaboratorio("Legrand");
		System.out.println("-------------------------------------");
		farmacia.calcularValorTotalLaboratorio("Medley");
		System.out.println("-------------------------------------");
		
		//4-D
		farmacia.buscarInformacoesLaboratorio("Legrand");
		System.out.println("-------------------------------------");
		farmacia.buscarInformacoesLaboratorio("Medley");
	}

}
