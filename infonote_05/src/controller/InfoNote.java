package controller;
import model.*;
import util.teclado;


public class InfoNote {

	
	Usuario user;
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
		opcao = teclado.lerInt("\n==== DIGITE SUA OP��O: ====");
		
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
			System.out.println("Sa�da do sistema.");
			break;
		
		default:
			System.out.println("Op��o invalida!");
		}
		
		} while (opcao != 8);
		
		
		
	}
	
//==============================================================================
//==============================================================================
	
	public void mostrarMenu() {
		
		System.out.println("\n\n===================================================");
		System.out.println("        Infonote - se n�o � Info n�o vendemos      ");
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
		System.out.println("           Infonote - Cadastro de Usu�rios.        ");
		System.out.println("===================================================");
		
		int matricula = teclado.lerInt("Matr�cula: ");
		String login = teclado.lerTexto("Login: ");
		String senha = teclado.lerTexto("Senha: ");
		String nome = teclado.lerTexto("Nome: ");
		String email = teclado.lerTexto("E-mail: ");
		String telefone = teclado.lerTexto("Telefone: ");
		
		user = new Usuario ( matricula, login, senha, nome, email
				, telefone);
		
		System.out.println("===================================================");
		System.out.println("           Usu�rio Cadastrado Com Sucesso.         ");
		System.out.println("===================================================");
		
		System.out.println(user);
	}

	public void buscarNotebook() {
		for (int i = 0; i < note.length; i++ ) {
			if (note[i] != null) {
				System.out.println(note[i].getNumeroNote()+" ===== "+ note[i].getModelo());
			}
		}
	}

	
	public void manterCarrinho() {
		System.out.println("Op��o ManterCarrinho - Em Constru��o");
	}
	
	
	public void inserirNotebook() {

		String numeroNote = teclado.lerTexto("Informe o n�mero do Notebook para compra: ");
	
		if (pedido == null) {
			pedido = new Pedido();
		}
	
		Notebook aux = null;
		for (int i = 0; i< note.length; i++) {
			if (note [i] != null && numeroNote.equals(note[i].getNumeroNote())) {
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
		System.out.println(" Op��o EfetuarCompra - Em Constru��o");
	}
	
}
