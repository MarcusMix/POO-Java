package POO;

public class MarcusExecutavel {

	public static void main(String[] args) {
		MarcusEndereco endLegrand = new MarcusEndereco("Rua dos Rem�dios", 100, "Centro", "Palho�a", "SC");
		MarcusLaboratorio Legrand = new MarcusLaboratorio("Legrand", "12.345.678/0001-11", endLegrand);

		MarcusEndereco endMedley = new MarcusEndereco("Rua da Medica��o", 200, "Estreito", "Florian�polis", "SC");
		MarcusLaboratorio Medley = new MarcusLaboratorio("Medley", "12.345.678/0001-22", endMedley);
		
		MarcusEndereco endSenac = new MarcusEndereco("Rua Jardim Silva", 360, "Centro", "Florian�polis", "SC");
		
		MarcusRemedio remedio1 = new MarcusRemedio("Rosuvas", 55.0, Legrand);
		MarcusRemedio remedio2 = new MarcusRemedio("Glifage", 35.0, Legrand);
		MarcusRemedio remedio3 = new MarcusRemedio("Aradois H", 50.0, Legrand);
		MarcusRemedio remedio4 = new MarcusRemedio("Tandrilax", 10.0, Legrand);
		
		MarcusRemedio remedio5 = new MarcusRemedio("Rosuvastatina", 50.0, Medley);
		MarcusRemedio remedio6 = new MarcusRemedio("Lexotan", 40.0, Medley);
		MarcusRemedio remedio7 = new MarcusRemedio("Losartana", 45.0, Medley);
		MarcusRemedio remedio8 = new MarcusRemedio("Torsilax", 15.0, Medley);
		
		MarcusRemedio[] listaRemedios = {remedio1, remedio1, remedio1, remedio1,
								   remedio2,remedio2, remedio2,
								   remedio3, remedio3,
								   remedio4,
								   remedio5,
								   remedio6, remedio5,
								   remedio7, remedio7, remedio7,
								   remedio8, remedio8, remedio8, remedio8};
		
		MarcusEstoque estoque = new MarcusEstoque("Lucinado", listaRemedios);
		
		MarcusFarmacia farmacia = new MarcusFarmacia("Farm�cia do Senac", "9", endSenac, estoque);
		
		System.out.println("Nome respons�vel: " + farmacia.nomeResponsavel());
		
//		double valor = estoque.qtRemedios() * remedio1.preco();
		
//		System.out.println("valor1" + valor);
		
	}

}
