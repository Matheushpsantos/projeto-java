package controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import model.*;
import model.DAO.*;
import util.Ajuda;
import util.Configurador;
import util.GerarSenha;
import util.Teclado;



public class InfoNote {

	Usuario usuario;

	
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
	private static final int AREA_ADMINISTRATIVA = 9;
	private static final int SAIR = 10;
	
	
	
	public InfoNote() {
	note [0] = new Notebook("1", "dell vs2014", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	note [1] = new Notebook("2", "dell vs2017", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	note [2] = new Notebook("3", "dell vs2018", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	note [3] = new Notebook("4", "dell vs2015", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
			"29/11/2018");
	note [5] = new Notebook("5", "dell vs2017", "cpu intel core, memoria 4GB", 6, 5890.00, "dell.png",
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
				
			case AREA_ADMINISTRATIVA:
				info.areaAdministrativa();
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
		System.out.println("9 - Área administrativa");
		System.out.println("10 - sair");
	}
	
	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");
		cliente = ClienteDAO.buscarPorLoginSenha(login, senha);
		if (cliente != null) {
			logado = cliente.validarLogin(login, senha);
		}else{
			if (logado) {
				System.out.println("Login efetuado com sucesso!");
			} else {
				System.out.println("Usuário ou senha inválido.");
				int opcao2 = 3;
				do {
					System.out.println("Digite:");
					System.out.println("1 - Para efetuar Login");
					System.out.println("2 - Para cadastrar-se");
					System.out.println("3 - Para sair do sistema");
					opcao2 = Teclado.lerInt("");
					switch (opcao2) {
					case 1:
						efetuarLogin();
						break;
					case 2:
						cadastrarUsuario();
						break;
					case 3:
						System.out.println("Obrigado e volte sempre!");
						break;
					default:
						System.out.println("Opção inválida");
					}
				} while (!logado);
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
		
		int tipo = 0;
		String codigoCliente = Teclado.lerTexto("Código de cliente: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");// esses atributos vão para Cliente Cli

		String logradouro = Teclado.lerTexto("Logadouro: ");
		String numero = Teclado.lerTexto("Numero: ");
		String complemento = Teclado.lerTexto("Complemeto: ");
		String bairro = Teclado.lerTexto("Bairro: ");
		String cidade = Teclado.lerTexto("Cidade: ");
		String estado = Teclado.lerTexto("Estado: ");
		String cep = Teclado.lerTexto("Cep: ");
		
		usuario = UsuarioDAO.inserir(login, senha, tipo);
		cliente = ClienteDAO.inserir(login, senha, tipo, codigoCliente, nome,
		email,telefone);
		
		Endereco endereco = EnderecoDAO.inserir(logradouro, numero, complemento,
		bairro, cidade, estado, cep, codigoCliente);
		
		
		
		
		
		System.out.println("===================================================");
		System.out.println("           Usuário Cadastrado Com Sucesso.         ");
		System.out.println("===================================================");
		System.out.println(cliente);
		System.out.println(endereco);

		
		
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
	
	public void areaAdministrativa(){

		InfoNote info = new InfoNote();
		efetuarLoginAdm();
		System.out.println("Opções Administrativas\n");
		System.out.println("1 - Cadastrar Notebook");
		System.out.println("2 - Mostrar Notebooks");
		System.out.println("3 - Editar Notebook");
		System.out.println("4 - Excluir Notebook");
		System.out.println("5 - Sair");
		int opcao = 5;
		do {
			opcao = Teclado.lerInt("Digite sua opção: ");
			switch (opcao) {
			case 1:
				info.cadastrarNotebook();
				break;
			case 2:
				info.mostrarNotebooks();
				break;
			case 3:
				info.editarNotebook();
				break;
			case 4:
				info.excluirNotebook();
				break;
			case 5:
				System.out.println("Saída do Sistema");
				break;
			default:
				System.out.println("Opção inválida!");
			}
			Teclado.lerTexto("Pressione uma tecla para continuar...");
		} while (opcao != 5);
	}


	public void efetuarLoginAdm() {
		
		String login, senha;
		
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");
		Funcionario funcionario = FuncionarioDAO.buscarPorLoginSenha(login, senha);
		
		if (funcionario != null) {
			logado = funcionario.validarLogin(login, senha);
		}else{
			if (logado) {
				System.out.println("Login efetuado com sucesso!");
			} else {
				System.out.println("Usuário ou senha inválido.");
			}
		}
	}

	public void cadastrarNotebook(){
		
		System.out.println("===================================  =");
		System.out.println("         Cadastro de Notebbok        ");
		System.out.println("====================================  ");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		int tipo = Teclado.lerInt("tipo 0 ou 1?: ");
		
		Notebook contato = NotebookDAO.inserir(login, senha, tipo);
		
		System.out.println(contato);
		
	}

	public void mostrarNotebooks() {
		
		System.out.println("metodo em construção");		
	}

	public void editarNotebook() {
		
		System.out.println("metodo em construção");
	}

	public void excluirNotebook() {
		
		System.out.println("metodo em construção");
	}


}
