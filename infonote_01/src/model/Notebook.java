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
	
	
}
