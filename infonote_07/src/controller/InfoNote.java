package controller;
import model.*;
import util.teclado;


public class InfoNote {

	
	Cliente cliente;
	boolean logado = false;
	Pedido pedido;
	Notebook[] note = new Notebook[10];
	
	
	//testar retornando void
	
	public InfoNote() {
	note [0] = new Notebook(1, "dell vs2014", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	note [1] = new Notebook(2, "dell vs2017", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	note [2] = new Notebook(3, "dell vs2018", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	note [3] = new Notebook(4, "dell vs2015", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	note [5] = new Notebook(5, "dell vs2017", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	}
	
	public static void main(String [] args) {
		
		InfoNote info = new InfoNote();
		
	
		
		int opcao = 8;
		
		do {
			
		info.mostrarMenu();
		opcao = teclado.lerInt("\n==== DIGITE SUA OPÇÃO: ====");
		
		switch(opcao) {
		
		case 1:
			info.efetuarLogin();
			break;
			
		case 2:
			info.cadastrarUsuario();
			break;
			
		case 3:
			info.buscarNotebook();
			break;
		case 4:
			info.manterCarrinho();
			break;
			
		case 5:
			info.manterCarrinho();
			break;
			
		case 6:
			info.manterCarrinho();
			
		case 7:
			if (!info.logado) {
				System.out.println("Efetue login para efetuar comprar");
				break;
			} else {
				info.efetuarCompra();
				break;
			}
		case 8:
			System.out.println("Saída do sistema.");
			break;
		
		default:
			System.out.println("Opção invalida!");
		}
		
		} while (opcao != 8);
		
		
		
	}
	
//==============================================================================
//==============================================================================
	
	public void mostrarMenu() {
		
		System.out.println("\n\n===================================================");
		System.out.println("        Infonote - se não é Info não vendemos      ");
		System.out.println("===================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - sair");
		
	}
	
	public void efetuarLogin(){
	
		String login, senha;
		
		login = teclado.lerTexto("digite o login:");
		senha = teclado.lerTexto("Digite a senha");
		
		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso");
			logado = true;
			
		}else{
			System.out.println("Login ou senha invalido.");
			efetuarLogin();
			}
		
	}

	public void cadastrarUsuario(){
		
		System.out.println("===================================================");
		System.out.println("           Infonote - Cadastro de Usuários.        ");
		System.out.println("===================================================");
		
		String login = teclado.lerTexto("login: ");
		String senha = teclado.lerTexto("Senha: ");
		int tipo = 1;
		String codigoCliente = teclado.lerTexto("Código de cliente: ");
		String nome = teclado.lerTexto("Nome: ");
		String email = teclado.lerTexto("E-mail: ");
		String telefone = teclado.lerTexto("Telefone: ");// esses atributos vão para Cliente Cli

		String Logradouro = teclado.lerTexto("Logadouro: ");
		String Numero = teclado.lerTexto("Numero: ");
		String Complemento = teclado.lerTexto("Complemeto: ");
		String Bairro = teclado.lerTexto("Bairro: ");
		String Cidade = teclado.lerTexto("Cidade: ");
		String Estado = teclado.lerTexto("Estado: ");
		String Cep = teclado.lerTexto("Cep: ");
		
		Endereco enderecos = new Endereco(Logradouro,
										Numero, 
										Complemento, 
										Bairro, 
										Cidade, 
										Estado, 
										Cep);

		Cliente cli = new Cliente (login,
								senha,
								tipo,
								codigoCliente,
								nome, 
								email,
								telefone,
								enderecos);
		
		
		
		System.out.println("===================================================");
		System.out.println("           Usuário Cadastrado Com Sucesso.         ");
		System.out.println("===================================================");
		
		System.out.println(cli);
	}

	public void buscarNotebook() {
		for (int i = 0; i < note.length; i++ ) {
			if (note[i] != null) {
				System.out.println(note[i].getSerialNote()+" ===== "+ note[i].getModelo());
			}
		}
	}

	
	public void manterCarrinho() {
		System.out.println("Opção ManterCarrinho - Em Construção");
	}
	
	
	public void inserirNotebook() {

		String numeroNote = teclado.lerTexto("Informe o número do Notebook para compra: ");
	
		if (pedido == null) {
			pedido = new Pedido();
		}
	
		Notebook aux = null;
		for (int i = 0; i< note.length; i++) {
			if (note [i] != null && numeroNote.equals(note[i].getSerialNote())) {
				aux = note[i];
			}
		}
		if (aux==null) {
			return;
		}
		ItemDePedido item = new ItemDePedido(1,aux.getPrecoUnitario(), aux);
		
		pedido.inserirItem(item);
	}
	
	
	
	public void efetuarCompra() {
		System.out.println(" Opção EfetuarCompra - Em Construção");
	}
	
}
