package lista_contrutores_heranca2;

public class Martelo extends FerramentaManual {

	public Martelo() {
		super();
	}

	public Martelo(String modelo, String fabricante, String tipo, double tamanho, double peso, double fatorDeDesgaste) {
		super(modelo, fabricante, tipo, tamanho, peso, fatorDeDesgaste);
	}
}
