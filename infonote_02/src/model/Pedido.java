package model;

public class Pedido {

	int numero;
	String dataEmiss�o;
	String formaDePagamento;
	double valorTotal;
	String situacao;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataEmiss�o() {
		return dataEmiss�o;
	}
	public void setDataEmiss�o(String dataEmiss�o) {
		this.dataEmiss�o = dataEmiss�o;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	@Override
	public String toString() {
		return "PEDIDO \n|numero: " + numero + "|    |dataEmiss�o: " + dataEmiss�o + "|    |formaDePagamento: " + formaDePagamento
				+ "|\n\n|valorTotal: " + valorTotal + "|    |situacao:" + situacao +"|\n";
	}
	
	
}
