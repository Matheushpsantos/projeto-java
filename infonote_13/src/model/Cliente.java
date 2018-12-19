package model;

import model.DAO.*;

public class Cliente extends Usuario implements IUsuario {

	String codigoCliente;
	String nome;
	String email;
	String telefone;
	Endereco[] enderecos = new Endereco[10];
	Pedido[] pedidos = new Pedido[10];
	
	
	public String getNomeInvertido() {
		String nome, sobrenome;
		
		int posicao = getNome().indexOf(" ");
		nome = getNome().substring(0, posicao);
		
		posicao = getNome().lastIndexOf(" ");
		sobrenome = getNome().substring(posicao + 1);
		
		return sobrenome + ", "+ nome;
	}
	
	public boolean inserirPedido(Pedido paramPedido){
		
		for (int i =0; i< pedidos.length; i++) {
			if (pedidos[i]==null) {
				pedidos[i]= paramPedido;
				return true;
			}
		}
		return false;
	}
	
	
	public boolean inserirEndereco (Endereco paramEnderecos) {
		for (int i=0; i < enderecos.length; i++) {
			if(enderecos[i]==null) {
				enderecos[i] = paramEnderecos;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean validarLogin (String login, String senha){
		Cliente cliente = ClienteDAO.buscarPorLoginSenha(login, senha);
		if(cliente != null){
			return true;
		}
		return false;
	}

	
	

	//========================================================
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco[] getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}
	public Pedido[] getPedido() {
		return pedidos;
	}
	public void setPedido(Pedido[] pedido) {
		this.pedidos = pedido;
	}
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cliente(String login, String senha, int tipo,String codigoCliente, 
			String nome, String email, String telefone, Endereco enderecos) {
		super(login, senha, tipo);
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		inserirEndereco(enderecos);
	}



	public Cliente(String login, String senha, int tipo, String codigoCliente,
			String nome, String email, String telefone) {
		
		super(login, senha, tipo);
		
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		
		retValue = "Informa��es sobre o cliente: "+ ENTER + super.toString()+ 
				"C�digo do cliente: "+codigoCliente+ ENTER + 
				"Nome: "+ nome + ENTER + 
				"E-mail: " + email + ENTER+
				"Telefone: " + telefone+ ENTER;

		return retValue;
	}


	
}

