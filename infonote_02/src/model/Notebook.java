package model;

public class Notebook {

	int numeroNote;
	String modelo;
	String descricao;
	int estoque;
	double precoUnitario;
	String figura;
	String dataCadastro;
	public int getNumeroNote() {
		return numeroNote;
	}
	public void setNumeroNote(int numeroNote) {
		this.numeroNote = numeroNote;
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
	@Override
	public String toString() {
		return "NOTEBOOK \n|numeroNote: " + numeroNote + "|     |modelo: " + modelo + "|     |descricao: " + descricao + "|     |estoque: "
				+ estoque + "|\n\n|precoUnitario=" + precoUnitario + "|     |figura:" + figura + "|     |dataCadastro: " + dataCadastro +"|\n";
	}
	
	
	public Notebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notebook(int construNumeroNote, String construModelo, String construDescricao, int construEstoque, double construPrecoUnitario, String construFigura,
			String construDataCadastro) {
		super();
		this.numeroNote = construNumeroNote;
		this.modelo = construModelo;
		this.descricao = construDescricao;
		this.estoque = construEstoque;
		this.precoUnitario = construPrecoUnitario;
		this.figura = construFigura;
		this.dataCadastro = construDataCadastro;
	}
	
	public void mostrar () {
		
		System.out.println("\n\nNOTEBOOK:\n");
		System.out.println("Numero do Notebook: "+this.numeroNote);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Descrição: "+this.descricao);
		System.out.println("Estoque: "+this.estoque);
		System.out.println("Preço Unitário: "+this.precoUnitario);
		System.out.println("Figura: "+this.figura);
		System.out.println("Data de cadastro: "+this.dataCadastro);
																
	}
	
	
}
