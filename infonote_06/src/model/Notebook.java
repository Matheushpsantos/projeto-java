package model;

public class Notebook {

	private int serialNote;
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

	
	
	public int getSerialNote() {
		return serialNote;
	}
	public void setSerialNote(int numeroNote) {
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
	public Notebook(int construNumeroNote, String construModelo, String construDescricao, int construEstoque, 
			double construPrecoUnitario, String construFigura,String construDataCadastro) {
		super();
		this.serialNote = construNumeroNote;
		this.modelo = construModelo;
		this.descricao = construDescricao;
		this.estoque = construEstoque;
		this.precoUnitario = construPrecoUnitario;
		this.figura = construFigura;
		this.dataCadastro = construDataCadastro;
	}
	
	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "NOTEBOOK"+ENTER+
				"serial do Note: " + serialNote + ENTER+
				"modelo: " + modelo +ENTER+
				"descricao: " + descricao + ENTER+
				"estoque: "+ estoque + ENTER+
				"precoUnitario: " + precoUnitario +ENTER+
				"figura:" + figura + ENTER+
				"Data do Cadastro: " + dataCadastro +ENTER;

		return retValue;
	}
}
