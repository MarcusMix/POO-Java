package avaliacao;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empresa {
	
	DecimalFormat formatador = new DecimalFormat("0.00");
	DateTimeFormatter formatatorData = DateTimeFormatter.ofPattern("HH:mm:ss");
	private String nome;
	private Linha[] listaLinhas;
	
	public Empresa(String nome, Linha[] listaLinhas) {
		super();
		this.nome = nome;
		this.listaLinhas = listaLinhas;
	}

	public Empresa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Linha[] getListaLinhas() {
		return listaLinhas;
	}

	public void setListaLinhas(Linha[] listaLinhas) {
		this.listaLinhas = listaLinhas;
	}

	public double calcularFaturamento() {
		double total = 0;
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			for(int j = 0; j < this.getListaLinhas().length; j++) {
				total += this.getListaLinhas()[i].getListaPassagem()[j].getValorPassagem();
			}
		}
		return total;
	}

	public void identificarTremMaisAntigo() {
		Trem tremNovo = this.getListaLinhas()[0].getTrem();
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			if(tremNovo.getDataFabricacao().isAfter(this.getListaLinhas()[i].getTrem().getDataFabricacao())) {
				tremNovo = this.getListaLinhas()[i].getTrem();
			}
		}
		System.out.println("O trem mais antigo é: " + tremNovo);
		
	}

	public Period identificarDiferecaIdadePassageiroMaisNovoMaisIdoso() {
		Period div = null;
		Passageiro passageiroNovo = this.getListaLinhas()[0].getListaPassagem()[0].getPassageiro();
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			for(int j = 0; j < this.getListaLinhas().length; j++) {
				if(passageiroNovo.getDataNascimento().isBefore(this.getListaLinhas()[i].getListaPassagem()[j].getPassageiro().getDataNascimento())) {
					passageiroNovo = this.getListaLinhas()[i].getListaPassagem()[j].getPassageiro();
				}
			}		
		}
//		System.out.println(passageiroNovo.getDataNascimento());
		Passageiro passageiroVelho = this.getListaLinhas()[0].getListaPassagem()[0].getPassageiro();
		for(int x = 0; x < this.getListaLinhas().length; x++) {
			for(int j = 0; j < this.getListaLinhas().length; j++) {
				if(passageiroVelho.getDataNascimento().isAfter(this.getListaLinhas()[x].getListaPassagem()[j].getPassageiro().getDataNascimento())) {
					passageiroVelho = this.getListaLinhas()[x].getListaPassagem()[j].getPassageiro();
				}
			}
			
//			System.out.println(Period.between(passageiroVelho.getDataNascimento(), passageiroNovo.getDataNascimento()));
		}
		div = Period.between(passageiroVelho.getDataNascimento(), passageiroNovo.getDataNascimento());
//		System.out.println(passageiroVelho.getDataNascimento());
		return div;
	
		
}

	public void identificarMaquinistaMaisNovo() {
		Maquinista maqNovo = this.getListaLinhas()[0].getTrem().getMaquinista();
		for(int x = 0; x < this.getListaLinhas().length; x++) {
			if(maqNovo.getDataNascimento().isBefore(this.getListaLinhas()[x].getTrem().getMaquinista().getDataNascimento())) {
				maqNovo = this.getListaLinhas()[x].getTrem().getMaquinista();
			}
		}
		System.out.println("Maquinista mais novo: " + maqNovo);
	}

	public void calcularPercentualPassageirosHomensMulheres() {
		char femea = 'F';
		char macho = 'M';
		int total = 0;
		float machoContador = 0f;
		float femeaContador = 0f;
		for(int x = 0; x < this.getListaLinhas().length; x++) {
			for(int j = 0; j < this.getListaLinhas().length; j++) {
				if(femea == this.getListaLinhas()[x].getListaPassagem()[j].getPassageiro().getSexo()) {
					femeaContador++;
				}if(macho == this.getListaLinhas()[x].getListaPassagem()[j].getPassageiro().getSexo()) {
					machoContador++;
				}
				total ++;
			}
		}
//		double media = 0;
		float mediaMulher = (femeaContador / total)  * 100;
		float mediaHomem = (machoContador / total)  * 100;
		System.out.println("Percentual de passageiros mulheres: " + formatador.format(mediaMulher) + "%");
		System.out.println("Percentual de passageiros homems: " + formatador.format(mediaHomem) + "%");
//		System.out.println(machoContador);
	}

	public void listarContatoPassageiro(String nome) {
		Passageiro passageiroEscolhido = new Passageiro();
		for(int x = 0; x < this.getListaLinhas().length; x++) {
			for(int j = 0; j < this.getListaLinhas().length; j++) {
				if(this.getListaLinhas()[x].getListaPassagem()[j].getPassageiro().getNome().equals(nome)) {
					passageiroEscolhido = this.getListaLinhas()[x].getListaPassagem()[j].getPassageiro();
				}
			}
		}
		System.out.println("Contato do passageiro " + nome + passageiroEscolhido.getContato());
}

	public void listarPassageirosPorTrechoLinha(String trecho) {
		for(int x = 0; x < this.getListaLinhas().length; x++) {
			if(this.getListaLinhas()[x].getTrecho().equals(trecho)) {
				for(int ç = 0; ç < this.getListaLinhas().length; ç++) {
					System.out.println(this.getListaLinhas()[x].getListaPassagem()[ç].getPassageiro().getNome());
				}
			}
		}
		
	}

	public void identificarPassageiroPorPassaporte(String passaporte) {
		Passageiro passageiroLocalizar = new Passageiro();
		for(int b = 0; b < this.getListaLinhas().length; b++) {
			for(int q = 0; q < this.getListaLinhas().length; q++) {
				if(this.getListaLinhas()[b].getListaPassagem()[q].getPassageiro().getDocumento().getPassaporte().equals(passaporte)) {
					passageiroLocalizar = this.getListaLinhas()[b].getListaPassagem()[q].getPassageiro();
				}
			}
		}
		System.out.println("Passageiro cujo passaporte número: " + passaporte+" é o(a)" + passageiroLocalizar.getNome());
	}

	public LocalDateTime mostrarHorarioTremPorTrechoLinha(String trecho) {
		LocalDateTime horaCerta = null;
		for(int x = 0; x < this.getListaLinhas().length; x++) {
			if(this.getListaLinhas()[x].getTrecho().equals(trecho)) {
				for(int ç = 0; ç < this.getListaLinhas().length; ç++) {
					horaCerta = this.getListaLinhas()[x].getListaPassagem()[ç].getDataHorario();
				}
			}
		}
		return horaCerta;
	}

	public double informarPrecoPassagemPorNumeroTrem(int numero) {
		double valorPassagemSelecionada = 0;
		for(int h = 0; h < this.getListaLinhas().length; h++)  {
			if(this.getListaLinhas()[h].getTrem().getNumeroLocomotiva() == numero) {
				for(int b = 0; b < this.getListaLinhas().length; b++) {
					for(int q = 0; q < this.getListaLinhas().length; q++) {
						valorPassagemSelecionada = this.getListaLinhas()[b].getListaPassagem()[q].getValorPassagem();
					}
			}
		}
		
	}
		return valorPassagemSelecionada;
	}
}