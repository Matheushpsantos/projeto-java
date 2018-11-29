package model;

public class Pedido {

	private int numero;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataEmissão() {
		return dataEmissao;
	}
	public void setDataEmissão(String dataEmissão) {
		this.dataEmissao = dataEmissão;
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
		return "PEDIDO \n|numero: " + numero + "|    |dataEmissão: " + dataEmissao + "|    |formaDePagamento: " + formaDePagamento
				+ "|\n\n|valorTotal: " + valorTotal + "|    |situacao:" + situacao +"|\n";
	}
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pedido(int ConstruNumero, String ConstruDataEmissão, String ConstruFormaDePagamento, double ConstruValorTotal, String ConstruSituacao) {
		super();
		this.numero = ConstruNumero;
		this.dataEmissao = ConstruDataEmissão;
		this.formaDePagamento = ConstruFormaDePagamento;
		this.valorTotal = ConstruValorTotal;
		this.situacao = ConstruSituacao;
	}
	
	public void mostrar() {
		
		System.out.println("\n\nPEDIDO:\n");
		System.out.println("Numero: "+this.numero);
		System.out.println("Data de emissao: "+this.dataEmissao);
		System.out.println("Forma de pagamento: "+this.formaDePagamento);
		System.out.println("Valor total: "+this.valorTotal);
		System.out.println("situação: "+this.situacao);
	}
	
	
}
