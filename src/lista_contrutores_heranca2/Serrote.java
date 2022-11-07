package lista_contrutores_heranca2;

public class Serrote extends FerramentaManual {

	public Serrote() {
		super();
	}

	public Serrote(String modelo, String fabricante, String tipo, double tamanho, double peso, double fatorDeDesgaste) {
		super(modelo, fabricante, tipo, tamanho, peso, fatorDeDesgaste);
	}
}
