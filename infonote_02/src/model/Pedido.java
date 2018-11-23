package model;

public class Pedido {

	int numero;
	String dataEmissão;
	String formaDePagamento;
	double valorTotal;
	String situacao;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataEmissão() {
		return dataEmissão;
	}
	public void setDataEmissão(String dataEmissão) {
		this.dataEmissão = dataEmissão;
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
		return "PEDIDO \n|numero: " + numero + "|    |dataEmissão: " + dataEmissão + "|    |formaDePagamento: " + formaDePagamento
				+ "|\n\n|valorTotal: " + valorTotal + "|    |situacao:" + situacao +"|\n";
	}
	
	
}
