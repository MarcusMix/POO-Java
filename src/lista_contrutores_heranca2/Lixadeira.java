package lista_contrutores_heranca2;

public class Lixadeira extends FerramentasEletricas {

	public Lixadeira() {
		super();
	}

	public Lixadeira(String modelo, String fabricante, double rpm, double potencia, double tensao, double peso,
			double fatorDeDesgaste) {
		super(modelo, fabricante, rpm, potencia, tensao, peso, fatorDeDesgaste);
	}
}
