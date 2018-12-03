package model;

public class Cliente extends Usuario {

	String codigoCliente;
	String nome;
	String email;
	String telefone;
	Endereco[] enderecos = new Endereco[10];
	Pedido[] pedidos = new Pedido[10];
	
	
	
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
	public Cliente(String codigoCliente, String nome, String email, String telefone, Endereco[] enderecos,
			Pedido[] pedido) {
		super();
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.enderecos = enderecos;
		this.pedidos = pedido;
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
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		
		retValue = "Informações dobre o cliente: "+ ENTER + super.toString()+ 
				"Código do cliente: "+codigoCliente+ ENTER + 
				"Nome:"+ nome + ENTER + 
				"E-mail: " + email + ENTER+
				"Telefone: " + telefone+ ENTER+
				"Endereco: "+ enderecos[0];
		
		return retValue;
	}
	
}
//
//   FINALIZARRR PARTE 8
//
