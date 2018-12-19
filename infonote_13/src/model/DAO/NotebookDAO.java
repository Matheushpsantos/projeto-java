package model.DAO;

import java.sql.*;

import model.Notebook;
import model.Usuario;
import util.Conexao;
import util.Configurador;

	public class NotebookDAO {
	
	Configurador config = new Configurador();
	String url;
	String driver;
	String login;
	String senha;
	
	
	public NotebookDAO() {
		
		url = config.getUrl();
		driver = config.getDriver();
		login = config.getLogin();
		senha = config.getSenha();


	}

	public static Notebook inserir(String login, String senha, int tipo) {
		
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			// Criação do insert
			String sql = "insert into usuario (login, senha, tipo) values (?,?,?)";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver,
					noteDAO.login, noteDAO.senha);
			// Abrir a conexão
			Connection con = conex.obterConexao();
			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, login);
			comando.setString(2, senha);
			comando.setInt(3, tipo);
			// Comando executado
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebook;
	}
}
