package model;

import model.DAO.FuncionarioDAO;

public class Funcionario extends Usuario implements IUsuario {
	
	String matricula;

	@Override
	public boolean validarLogin (String login, String senha){
		Funcionario funcionario = FuncionarioDAO.buscarPorLoginSenha(login, senha);
		if(funcionario != null){
			return true;
		}
		return false;
	}

	
	
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

	public Funcionario(String login, String senha, int tipo,String matricula) {
		super(login, senha, tipo);
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "Funcionario matricula: " + matricula;
		
		return retValue;
	}

	
	
	
}
