package model;

public class Funcionario extends Usuario {
	
	String matricula;

	
	
//=================================================
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}
	
	

}
