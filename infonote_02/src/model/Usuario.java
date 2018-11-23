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
	
	
	
	public Usuario(int matricula2, String login2, String senha2, String nome2, String email2
			, String telefone2) {
		super();
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "USUÁRIO \n|matricula: " + matricula + "|     |login: " + login + "|     |senha: " + senha + "|     |nome:" 
				+ nome + "|\n"+"\n|email: " + email + "|     |telefone: " + telefone +"|\n";
	}

	
}
