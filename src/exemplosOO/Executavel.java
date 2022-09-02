package exemplosOO;

public class Executavel {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Milena");
		c1.setIdade(23);
		c1.setCpf("075.281.879-17");
		c1.setTelefone("47 92336841");

		Cliente c2 = new Cliente();
		c2.setNome("Marcus");
		c2.setIdade(20);
		c2.setCpf("129.438.969-69");
		c2.setTelefone("48 984243714");
		
		Cliente c3 = new Cliente();
		c3.setNome("Ana");
		c3.setIdade(23);
		c3.setCpf("075.281.879-28");
		c3.setTelefone("47 92336876");
		
		Cliente c4 = new Cliente();
		c4.setNome("Tadeu");
		c4.setIdade(28);
		c4.setCpf("075.234.879-17");
		c4.setTelefone("49 92336841");
		
		Funcionario f1 = new Funcionario ();
		f1.setNome("Tadeu");
		f1.setCpf("609.105.859-20");
		f1.setTelefone("48 96840080");
		f1.setMatricula(7406);
		
		Funcionario f2 = new Funcionario ();
		f2.setNome("Leandra");
		f2.setCpf("609.104.889-20");
		f2.setTelefone("48 96855080");
		f2.setMatricula(9806);
		
		Funcionario f3 = new Funcionario ();
		f3.setNome("Andressa");
		f3.setCpf("645.107.959-20");
		f3.setTelefone("48 95640080");
		f3.setMatricula(0606);

		Funcionario f4 = new Funcionario ();
		f4.setNome("Manuela");
		f4.setCpf("087.105.238-20");
		f4.setTelefone("49 97840080");
		f4.setMatricula(7680);
		
		Cliente[] listaClientes = {c1,c2,c3,c4};
		Funcionario[] listaFuncionarios = {f1,f2,f3,f4};
		
		//Qual o nome do cliente mais novo? 
		Cliente cliente = listaClientes[0]; // mais novo
		for(int i = 0; i < listaClientes.length; i++ ) {
			if(listaClientes[i].getIdade() < cliente.getIdade())
				cliente = listaClientes[i];
		}
	
		System.out.println("Nome do cliente mais novo: "+ cliente.getNome() );
		
		// Qual o telefone do funcionario de maior matricula
		
		Funcionario func = listaFuncionarios[0];
		for(int i = 0; i < listaFuncionarios.length; i++) {
			if(listaFuncionarios[i].getMatricula() < func.getMatricula()) {
				func = listaFuncionarios[i];
			}
		}
		
		System.out.println("O telefone do funcionário com a maior matrícula é: " + func.getTelefone());
		
		
		Cliente compararNome = listaClientes[0];
//		for( int i = 0; i < listaClientes.length; i++) {
//			if(listaClientes[i].getNome() == listaFuncionarios[0].getNome() ||
//					listaClientes[i].getNome() ==	listaFuncionarios[1].getNome() ||
//							listaClientes[i].getNome() ==listaFuncionarios[2].getNome() ||
//									listaClientes[i].getNome() == listaFuncionarios[3].getNome()) {
//				compararNome = listaClientes[i];
//			}
//		}
//		System.out.println("Nome do funcionário que também é cliente: " + compararNome.getNome());
		
		
		
		// Existe algum funcionário que também é cliente
		
		boolean existe = false;
		for( int i = 0; i < listaClientes.length; i++) {
			for(int j = 0; j < listaFuncionarios.length; j++) {
				if(listaClientes[i].getCpf().equals(listaFuncionarios[j].getCpf())) {
					existe = true;
				}	
			}
		}
		System.out.println("Existe funcionário que também é cliente ? " + (existe? "sim" : "não"));
		
	}


}
