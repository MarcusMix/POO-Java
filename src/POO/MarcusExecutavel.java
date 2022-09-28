package POO;

public class MarcusExecutavel {

	public static void main(String[] args) {
		
		MarcusEndereco endLegrand = new MarcusEndereco("Rua dos Remédios", 100, "Centro", "Palhoça", "SC");
		MarcusLaboratorio Legrand = new MarcusLaboratorio("Legrand", "12.345.678/0001-11", endLegrand);

		MarcusEndereco endMedley = new MarcusEndereco("Rua da Medicação", 200, "Estreito", "Florianópolis", "SC");
		MarcusLaboratorio Medley = new MarcusLaboratorio("Medley", "12.345.678/0001-22", endMedley);
		
		MarcusEndereco endSenac = new MarcusEndereco("Rua Jardim Silva", 360, "Centro", "Florianópolis", "SC");
		
		MarcusRemedio rosuvas = new MarcusRemedio("Rosuvas", 55.0, Legrand);
		MarcusRemedio glifage = new MarcusRemedio("Glifage", 35.0, Legrand);
		MarcusRemedio araDois = new MarcusRemedio("Aradois H", 50.0, Legrand);
		MarcusRemedio tandrilax = new MarcusRemedio("Tandrilax", 10.0, Legrand);
		
		MarcusRemedio rosuvastatina = new MarcusRemedio("Rosuvastatina", 50.0, Medley);
		MarcusRemedio lexotan = new MarcusRemedio("Lexotan", 40.0, Medley);
		MarcusRemedio losartana = new MarcusRemedio("Losartana", 45.0, Medley);
		MarcusRemedio torsilax = new MarcusRemedio("Torsilax", 15.0, Medley);
		
		MarcusRemedio[] listaRemedios = {
								   rosuvas, rosuvas, rosuvas, rosuvas,
								   glifage,glifage, glifage,
								   araDois, araDois,
								   tandrilax,
								   rosuvastatina,
								   lexotan, rosuvastatina,
								   losartana, losartana, losartana,
								   torsilax, torsilax, torsilax, torsilax
								   };
		
		MarcusEstoque estoque = new MarcusEstoque("Lucinado", listaRemedios);
		
		MarcusFarmacia farmacia = new MarcusFarmacia("Farmácia do Senac", "12.345.678/0001-33", endSenac, estoque);
		
		
		//3-a
		farmacia.identificarResponsavel();
		
		//3-b
		System.out.println("----------------------------");
		farmacia.calcularEstoque();
		
		//3-c
		System.out.println("----------------------------");
		farmacia.calcularEstoque("legrand");
		System.out.println("----------------------------");
		farmacia.calcularEstoque("medley");
		
		//3-d
		System.out.println("----------------------------");
		System.out.println("Dados do laboratório: " + farmacia.informarDadosLaboratorio("medley"));
		System.out.println("----------------------------");
		System.out.println("Dados do laboratório: " + farmacia.informarDadosLaboratorio("legrand"));

		
	}

}
