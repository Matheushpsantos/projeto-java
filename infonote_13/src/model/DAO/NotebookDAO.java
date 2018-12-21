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

	public static Notebook inserirNotebook(String serialNote, 
			String modelo, String descricao, int estoque,
	double precoUnitario, String figura, String dataCadastro) {
		
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			// Criação do insert
			String sql = "insert into notebook (serialnote,modelo,descricao,estoque,precoUnitario,figura,dataCadastro) values (?,?,?,?,?,?,?)";
		
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver,
					noteDAO.login, noteDAO.senha);
			
			// Abrir a conexão
			Connection con = conex.obterConexao();
			
			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, serialNote);
			comando.setString(2, modelo);
			comando.setString(3, descricao);
			comando.setInt(4, estoque);
			comando.setDouble(5, precoUnitario);
			comando.setString(6, figura);
			comando.setString(7, dataCadastro);
	
			// Comando executado
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		notebook = new Notebook(serialNote, modelo,
				descricao, estoque, precoUnitario, figura, dataCadastro);
		return notebook;
	}

	public static Notebook[] buscarTodos() {
		Notebook[] notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		try {
			// Crição do select
			String sql = "Select * from notebook";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);
			Connection con = conex.obterConexao();
			/*
			 * Executa a confirmação direta de acesso ao banco pois não são necessárias
			 * informações para a Query (caracter curinga)
			 */
			Statement comando = con.createStatement();
			/*
			 * ResultSet - Classe java que monta em memória uma matriz com a resposta das
			 * linhas do banco de dados
			 */
			ResultSet rs = comando.executeQuery(sql);
			// vetor de objetos
			notebook = new Notebook[10];
			/*
			 * Passagem de linha de dados do ResultSet para o vetor de objetos (uma linha de
			 * dados da matriz do ResultSet é copiada para um objeto no vetor contatos)
			 */
			int i = 0;
			while (rs.next()) {
				notebook[i++] = new Notebook(
						rs.getString("serialnote"), 
						rs.getString("modelo"),
						rs.getString("descricao"),
						rs.getInt("estoque"),
						rs.getDouble("precoUnitario"),
						rs.getString("figura"),
						rs.getString("dataCadastro")
						);
			}
			// É necessário encerrar o acesso ao banco para liberar a conexão
			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebook;
	}	
	

	
	
	public static Notebook excluir (String serialNote) {
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			String sql = "delete from notebook where serialnote = ?";

			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, serialNote);
			comando.executeUpdate();

		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
		
		return notebook;
	
	}

	

	

	public static Notebook atualizar(String descricao, int estoque, double precoUnitario,
			String figura, String dataCadastro, String serialNote) {
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			String sql = "update notebook set descricao = ?, estoque = ?, precoUnitario = ?, figura = ?, dataCadastro = ? where serialnote = ?";

			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1,descricao);
			comando.setInt(2,estoque);
			comando.setDouble(3,precoUnitario);
			comando.setString(4,figura);
			comando.setString(5,dataCadastro);
			comando.setString(6,serialNote);
			comando.executeUpdate();
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}
	
	public static Notebook atualizar(String descricao, String serialNote) {
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			String sql = "update notebook set descricao = ? where serialnote = ?";
			//String sql2 = "update notebook set descricao = "+descricao+" where serialnote = "+serialNote+"";
			//System.out.println(sql2);
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1,descricao);
			comando.setString(2, serialNote);
			comando.executeUpdate();
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		

	return notebook;		
	
	}

	public static Notebook atualizar(int estoque, String serialNote) {
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			String sql = "update notebook set estoque = ? where serialnote = ?";

			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			
			comando.setInt(1,estoque);
			comando.setString(2,serialNote);
			comando.executeUpdate();

		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	
	public static Notebook atualizar(double precoUnitario, String serialNote) {
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			String sql = "update notebook set precoUnitario = ? where serialnote = ?";

			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setDouble(1,precoUnitario);
			comando.setString(2,serialNote);
			comando.executeUpdate();
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	public static Notebook atualizar(String figura, String serialNote ,int assinatura) {
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			String sql = "update notebook set figura = ? where serialnote = ?";

			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			
			comando.setString(1,figura);
			comando.setString(2,serialNote);
			comando.executeUpdate();
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	public static Notebook atualizar(String dataCadastro, String serialNote, double assinatura) {
		
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			String sql = "update notebook set dataCadastro = ? where serialnote = ?";

			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			Connection con = conex.obterConexao();


			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1,dataCadastro);
			comando.setString(2,serialNote);
			comando.executeUpdate();
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	
		
		return notebook;
	
	}

	
	
}
	
	

