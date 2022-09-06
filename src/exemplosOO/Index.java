package exemplosOO;

public class Index {

	public static void main(String[] args) {
		Carro c1 = new Carro("Ford", "Ka", 2021, "40ABC40", 120);
		
		Carro c2 = new Carro("Chevrolet", "S10", 2001, "50klJ90", 240);
		
		Carro c3 = new Carro("Gol", "Volkswagem", 2019, "98BNC09", 90);
		
		Carro c4 = new Carro("Fiat", "Mob", 2020, "098ZXY986", 63);
		
		Moto m1 = new Moto("Honda", "CG150", 1991, "50AHJ40", 150);
		
		Moto m2 = new Moto("Honda", "biz", 2007, "30REQ40", 120);
		
		Moto m3 = new Moto("Yamaha", "XTZ", 2021, "20NMH80", 300);
		
		Moto m4 = new Moto("Dafra", "Dafra g1", 2005, "90MKL40", 180);
		
		Caminhao ca1 = new Caminhao("Scania", "Gran turismo", 2005, "80MKL40", 6);
		
		Caminhao ca2 = new Caminhao("Ford", "Caminhao grande", 2022, "54RAS40", 8);
		
		Caminhao ca3 = new Caminhao("BMW", "988i", 2020, "98POP98", 4);
		
		Caminhao ca4 = new Caminhao("Scania", "Gran turismo III", 2022, "69CPS40", 6);
	
		
		
		Carro [] listaCarros = {c1, c2, c3, c4};
		Moto[] listaMotos = {m1, m2, m3, m4};
		Caminhao[] listaCaminhao = {ca1, ca2, ca3, ca4};
		
		
		// Qual carro com a maio potência?
		
		Carro carro = listaCarros[0];
		
		for(int i = 0; i < listaCarros.length; i++) {
			if(listaCarros[i].getPotenciaCV() > carro.getPotenciaCV()) {
					carro = listaCarros[i];
				}
			}
		
		System.out.println("O carro com maior potencia é: " + carro.getModelo()+ " e sua potência: " +carro.getPotenciaCV());
		
		
		// Qual a moto de menor cilindrada?
		
		Moto moto = listaMotos[0];
		
		for(int i = 0; i < listaMotos.length; i++) {
			if(listaMotos[i].getPotenciaCilindrada() < moto.getPotenciaCilindrada()) {
				moto = listaMotos[i];
			}
		}
		
		System.out.println("A moto com menor cilindrada é: " + moto.getModelo() + " e sua cilindrada: " + moto.getPotenciaCilindrada());
		
		
		// Qual o veiculo mais antigo?
		
		Veiculo[] listaVeiculos = {c1, c2, c3, c4, m1, m2, m3, m4,ca1, ca2, ca3, ca4 };
		
		Veiculo veiculo = listaVeiculos[0];
		for(int i = 0; i < listaVeiculos.length; i++) {
			if(listaVeiculos[i].getAno() < veiculo.getAno()) {
				veiculo = listaVeiculos[i];
			}
		}
		
		
		// ----------------------------------
		
		Carro carroAntigo = listaCarros[0];
		
		for(int i = 0; i < listaCarros.length; i++) {
			if(listaCarros[i].getAno() < carroAntigo.getAno()) {
				carroAntigo = listaCarros[i];
			}
		}
		
		Moto motoAntiga = listaMotos[0];
		
		for(int i = 0; i < listaMotos.length; i++) {
			if(listaMotos[i].getAno() < motoAntiga.getAno()) {
				moto = listaMotos[i];
			}
		}
		
		
		Caminhao caminhaoAntigo = listaCaminhao[0];
		
		for(int i = 0; i < listaMotos.length; i++) {
			if(listaCaminhao[i].getAno() < caminhaoAntigo.getAno()) {
				caminhaoAntigo = listaCaminhao[i];
			}
		}
		
		
		if(caminhaoAntigo.getAno() < carroAntigo.getAno()) {
			if(caminhaoAntigo.getAno() < motoAntiga.getAno()) {
				System.out.println("O caminhão é o veiculo mais antigo!");
				System.out.println(caminhaoAntigo);
			}else {
				
			}
		}
		
		
		
		
		
		
		
		System.out.println("O carro com a menor potência é:" + carro.getModelo());
		System.out.println("-------------------------------");
		System.out.println("A moto de menor cilindrada é:" + moto.getModelo());
		System.out.println("-------------------------------");
		System.out.println("O veiculo mais antigo é: " + veiculo.getModelo()+ ".");
		System.out.println("-------------------------------");
//		System.out.println(m1);
//		System.out.println(ca1);
	}

	
}
