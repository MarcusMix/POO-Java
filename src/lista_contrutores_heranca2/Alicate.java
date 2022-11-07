package lista_contrutores_heranca2;

public class Alicate extends FerramentaManual {

	public Alicate() {
		super();
	}

	public Alicate(String modelo, String fabricante, String tipo, double tamanho, double peso, double fatorDeDesgaste) {
		super(modelo, fabricante, tipo, tamanho, peso, fatorDeDesgaste);
	}
}
