package controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import model.*;
import util.Ajuda;
import util.Configurador;
import util.GerarSenha;
import util.Teclado;


public class InfoNote {

	
	Cliente cliente;
	boolean logado = false;
	Pedido pedido;
	Notebook[] note = new Notebook[10];
	private static Cliente clienteGlobal = null;
	private static Cliente funcionarioGlobal = null;
	
	Configurador config;
	Ajuda ajuda;
	
	private static final int LOGIN = 1;
	private static final int CADASTRAR_USUARIO = 2;
	private static final int BUSCAR_NOTEBOOK = 3;
	private static final int INSERIR_NOTEBOOK = 4;
	private static final int REMOVER_NOTEBOOK = 5;
	private static final int VER_CARRINHO = 6;
	private static final int EFETUAR_COMPRA = 7;
	private static final int AJUDA = 8;
	private static final int SAIR = 9;
	
	
	
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
	// Cria objeto de configurações
	config = new Configurador();
	Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));
	// Cria o objeto Ajuda
	ajuda = new Ajuda(config.getArquivoAjuda());

	}
	
	public static void main(String[] args)  {
		InfoNote info = new InfoNote();
		int opcao = SAIR;
		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua opção: ");
			switch (opcao) {
			case LOGIN:
				info.efetuarLogin();
				break;
				
			case CADASTRAR_USUARIO:
				info.cadastrarUsuario();
				break;
				
			case BUSCAR_NOTEBOOK:
				info.buscarNotebook();
				break;
				
			case INSERIR_NOTEBOOK:
				info.manterCarrinho();
				break;
				
			case REMOVER_NOTEBOOK:
				info.manterCarrinho();
				break;
				
			case VER_CARRINHO:
				info.manterCarrinho();
				break;
				
			case EFETUAR_COMPRA:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;} else {
					info.efetuarCompra();
					break;
							}
				
			case AJUDA:
				info.ajuda();
				break;
				
				
			case SAIR:
				System.out.println("Saída do Sistema");
				break;
				
			default:
				System.out.println("Opção inválida!");
			}
			Teclado.lerTexto("Pressione uma tecla para continuar...");
		} while (opcao != SAIR);
	}

	
//==============================================================================
//==============================================================================
	
	public void mostrarMenu() {
		
		System.out.println("==================================================");
		System.out.println("InfoNote - Se não é Info não vendemos." +
		DateFormat.getDateInstance(DateFormat.SHORT).format(new Date())
		+ " " +
		DateFormat.getTimeInstance().format(new Date()));
		if (logado == true){
		System.out.println("Seja bem vindo, " + clienteGlobal.getNomeInvertido());
		}
		
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Ajuda");
		System.out.println("9 - Sair");
	}
	
	public void efetuarLogin(){
	
		String login, senha;
		
		login = Teclado.lerTexto("digite o login:");
		senha = Teclado.lerTexto("Digite a senha");
		
		if (clienteGlobal != null) {
			logado = clienteGlobal.validarLogin(login, senha);
			if (logado) {
				System.out.println("Login efetuado com sucesso!");
				
			}else {
					System.out.println("Usuário ou senha inválido.");
			}
		} else {
				logado = funcionarioGlobal.validarLogin(login, senha);
				if (logado) {
					System.out.println("Login efetuado com sucesso!");
					
				}else {
						System.out.println("Usuário ou senha inválido.");
				}
		}
		
	}

	public void cadastrarUsuario(){
		
		System.out.println("===================================================");
		System.out.println("           Infonote - Cadastro de Usuários.        ");
		System.out.println("===================================================");
		
		String login = Teclado.lerTexto("login: ");
		String senha = Teclado.lerTexto("Senha: ");
		if (senha.equals("")|| senha == null) {//referente a senha
			senha = GerarSenha.gerarSenha();   //para gerar senha aut
			System.out.println("Senha gerada: "+ senha);
		}
		
		int tipo = 1;
		String codigoCliente = Teclado.lerTexto("Código de cliente: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");// esses atributos vão para Cliente Cli

		String Logradouro = Teclado.lerTexto("Logadouro: ");
		String Numero = Teclado.lerTexto("Numero: ");
		String Complemento = Teclado.lerTexto("Complemeto: ");
		String Bairro = Teclado.lerTexto("Bairro: ");
		String Cidade = Teclado.lerTexto("Cidade: ");
		String Estado = Teclado.lerTexto("Estado: ");
		String Cep = Teclado.lerTexto("Cep: ");
		
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
		
		clienteGlobal = cli;
		
		
		
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

		String numeroNote = Teclado.lerTexto("Informe o número do Notebook para compra: ");
	
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
	
	public void ajuda(){
		System.out.println(ajuda.getTexto());
		}

}
