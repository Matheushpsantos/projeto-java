package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Notebook {

	private String serialNote;
	private String modelo;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;
	
	
	
	
	
	public void mostrar () {//n�o utilizar no infonote_06
		
		System.out.println("\n\nNOTEBOOK:\n");
		System.out.println("Numero do Notebook: "+this.serialNote);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Descri��o: "+this.descricao);
		System.out.println("Estoque: "+this.estoque);
		System.out.println("Pre�o Unit�rio: "+this.precoUnitario);
		System.out.println("Figura: "+this.figura);
		System.out.println("Data de cadastro: "+this.dataCadastro);
	}

	
	
	public String getSerialNote() {
		return serialNote;
	}
	public void setSerialNote(String numeroNote) {
		this.serialNote = numeroNote;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public String getFigura() {
		return figura;
	}
	public void setFigura(String figura) {
		this.figura = figura;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public Notebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notebook(String construSerialNote, String construModelo, String construDescricao, int construEstoque, 
			double construPrecoUnitario, String construFigura,String construDataCadastro) {
		super();
		this.serialNote = construSerialNote;
		this.modelo = construModelo;
		this.descricao = construDescricao;
		this.estoque = construEstoque;
		this.precoUnitario = construPrecoUnitario;
		this.figura = construFigura;
		this.dataCadastro = construDataCadastro;
	}
	
	@Override
	public String toString(){
	final String ENTER = "\n";
	String retValue = "";
	Locale local = new Locale("pt", "BR");
	retValue = "Informa��es sobre Notebook:" + ENTER +
	"N�mero de S�rie do Notebook: " + serialNote + ENTER +
	"Modelo: " + modelo + ENTER +
	"Descricao: " + descricao + ENTER +
	"Estoque: " + estoque + ENTER +
	"Pre�o Unitario: " +
	NumberFormat.getCurrencyInstance(local).format(this.precoUnitario) +
	ENTER +
	"Figura: " + figura + ENTER +
	"Data de cadastro: " + dataCadastro;
	return retValue;
	}

}
