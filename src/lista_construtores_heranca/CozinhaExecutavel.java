package lista_construtores_heranca;

public class CozinhaExecutavel {

	public static void main(String[] args) {
		Geladeira g1 = new Geladeira("Frost free", "Brastemp", 50 , 90);
		Fogao f1 = new Fogao("Super quente", "Electrolux", 6, 87);
		Lava_loucas l1 = new Lava_loucas("Grandux", "Trisol", 40, 98);
		Micro_ondas m1 = new Micro_ondas("Microx", "Fogarel", 20, 250);
		Lavadora_roupas lp1 = new Lavadora_roupas("Roupexy", "PopUp09", 200, 580);
		Forno_eletrico fe1 = new Forno_eletrico("Brastemp", "Super 3000", 30, 200);

//		cozinha [] listaCozinha = {g1, f1, l1, m1, lp1};
		
		double consumoGeladeiraMes = g1.calcularConsumo();
		double consumoGeladeiraDias = g1.calcularConsumo(10);
	
		double consumoFogaoMes = f1.calcularConsumo();
		double consumoFogaoDia = f1.calcularConsumo(10);
		
		double consumoLavaLoucasMes = l1.calcularConsumo();
		double consumoLavaLoucasDias = l1.calcularConsumo(10);
		
		
		double consumoMicro_ondasMes = m1.calcularConsumo();
		double consumoMicro_ondasDia = m1.calcularConsumo(10);
		
		
		double consumoLavadora_roupasMes = lp1.calcularConsumo();
		double consumoLavadora_roupasDias = lp1.calcularConsumo(10);
		
		double consumoForno_eletricoMes = fe1.calcularConsumo();
		double consumoForno_eletricoDia = fe1.calcularConsumo(10);
		
		
		double consumoTotalMes = consumoGeladeiraMes + 
								 consumoFogaoMes + 
								 consumoLavaLoucasMes+  
								 consumoMicro_ondasMes + 
								 consumoLavadora_roupasMes +
								 consumoForno_eletricoMes;
		
		double consumoTotal10Dias = consumoGeladeiraDias + 
									consumoFogaoDia + 
									consumoLavaLoucasDias + 
									consumoMicro_ondasDia + 
									consumoLavadora_roupasDias +
									consumoForno_eletricoDia;
		
		
		System.out.println("O consumo da Cozinha por mes é: " + consumoTotalMes + "Kw.");
		System.out.println("Consumo da Cozinha em 10 dias é: " + consumoTotal10Dias + "Kw.");
		System.out.println("Consumo forno 1 mes: " + consumoForno_eletricoMes + "Kw.");
		System.out.println("Consumo forno 10 dias: " + consumoForno_eletricoDia + "Kw.");
		
		
	}

}
