package lista_contrutores_heranca2;

public class Oficina {

	public static void main(String[] args) {

		Alicate alicate1 = new Alicate("AliCat", "Connorte", "dobra-tudo", 20, 3, 1);
		Alicate alicate2 = new Alicate("MiSuper", "Millium", "Arrancol", 24, 4, 2);
		Furadeira furadeira1 = new Furadeira("B500", "Boch", 3000, 500, 20, 1, 20);
		Lixadeira lixadeira1 = new Lixadeira("Lixante", "Lixuosa", 2000, 50, 240, 3, 1);
		Serra serra = new Serra("Serrão", "Still", 1500, 300, 120, 5, 1);
		Martelo martelo1 = new Martelo("Bate tudo", "Tramontina", "Cabeça-larga", 23, 2, 0.1);
		Martelo martelo2 = new Martelo("Fofura", "Tramontina", "Borracha", 23, 2, 0.1);
		Serrote serrote = new Serrote("Cortex", "Makita", "Longo", 80, 4, 0.4);
	}

}
