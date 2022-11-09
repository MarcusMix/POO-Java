package avaliacao;

public class Documento {
	
	private String passaporte;

	public Documento(String passaporte) {
		super();
		this.passaporte = passaporte;
	}

	public Documento() {
		super();
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	@Override
	public String toString() {
		return "\nPassaporte: " + this.getPassaporte();
	}

}
