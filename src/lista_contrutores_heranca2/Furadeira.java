package lista_contrutores_heranca2;

public class Furadeira extends FerramentasEletricas{

	public Furadeira() {
		super();
	}

	public Furadeira(String modelo, String fabricante, double rpm, double potencia, double tensao) {
		super(modelo, fabricante, rpm, potencia, tensao);
	}
	
}
