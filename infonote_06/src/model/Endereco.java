package model;

public class Endereco {
	
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	
	
	public void mostrar() {// não utilizar no infonote_06
		
		System.out.println("\n\nENDEREÇO:\n");
		System.out.println("Logradouro: "+this.logradouro);
		System.out.println("Numero: "+this.numero);
		System.out.println("Complemento: "+this.complemento);
		System.out.println("Bairro: "+this.bairro);
		System.out.println("Cidade: "+this.cidade);
		System.out.println("Estado: "+this.estado);
		System.out.println("Cep: "+this.cep);
		
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logadouro) {
		this.logradouro = logadouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Endereco(String ConstruLogradouro, String ConstruNumero, String ConstruComplemento, String ConstruBairro, String ConstruCidade, String ConstruEstado,
			String ConstruCep) {
		super();
		this.logradouro = ConstruLogradouro;
		this.numero = ConstruNumero;
		this.complemento = ConstruComplemento;
		this.bairro = ConstruBairro;
		this.cidade = ConstruCidade;
		this.estado = ConstruEstado;
		this.cep = ConstruCep;
	}
	
	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "ENDEREÇO"+ENTER+
				"logradouro: " + logradouro +ENTER +
				"numero: " + numero +ENTER+ 
				"complemento: " + complemento+ENTER+
				"bairro: " + bairro +ENTER+
				"cidade: " + cidade +ENTER+
				"estado: " + estado +ENTER +
				"cep: " + cep + ENTER;
		
		return retValue;
	}
}
