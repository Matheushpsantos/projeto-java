package model;

public class Usuario {
	
	int matricula;
	String login;
	String senha;
	String nome;
	String email;
	String telefone;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(int construMatricula, String construLogin, String construSenha, String construNome, String construEmail
			, String construTelefone) {
		super();
		this.matricula = construMatricula;//objeto que chamou recebe valor do contrutor
		this.login = construLogin; 		  //objeto que chamou recebe valor do contrutor
		this.senha = construSenha;        //objeto que chamou recebe valor do contrutor
		this.nome = construNome;          //objeto que chamou recebe valor do contrutor
		this.email = construEmail;        //objeto que chamou recebe valor do contrutor
		this.telefone = construTelefone;  //objeto que chamou recebe valor do contrutor
	}
	
	public void mostrar() {
		
		System.out.println("\n\nUSU�RIO:\n");
		System.out.println("Matr�cula: "+this.matricula);//sa�da dos valores dados no contrutor
		System.out.println("Login: "+this.login);
		System.out.println("Senha"+this.senha);
		System.out.println("Nome"+this.nome);
		System.out.println("Email"+this.email);
		System.out.println("Telefone"+this.telefone);
		
		
	}
	
	
	@Override
	public String toString() {
		return "USU�RIO \n|matricula: " + matricula + "|     |login: " + login + "|     |senha: " + senha + "|     |nome:" 
				+ nome + "|\n"+"\n|email: " + email + "|     |telefone: " + telefone +"|\n";
	}

	
}
