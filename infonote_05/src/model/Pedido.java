package model;

import com.sun.scenario.effect.impl.prism.ps.PPSBlend_COLOR_DODGEPeer;

public class Pedido {

	private int numero;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;
	
	private Endereco novaEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];
	
	
	
	public boolean inserirItem (ItemDePedido item) {
	
		for (int i = 0; i< itens.length; i++) {
			if(itens[i]==null) {
				itens[i] = item;
				return true;
			}
		}
		return false;
	}

	
	public void mostrar() {
		
		System.out.println("\n\nPEDIDO:\n");
		System.out.println("Numero: "+this.numero);
		System.out.println("Data de emissao: "+this.dataEmissao);
		System.out.println("Forma de pagamento: "+this.formaDePagamento);
		System.out.println("Valor total: "+this.valorTotal);
		System.out.println("situa��o: "+this.situacao);
		System.out.println("\n\nITENS DO PEDIDO:\n");
		for (int i = 0; i< itens.length; i++) {
			if(itens[i]!= null) {
				itens[i].mostrar();
			}
		}
	}
	
//===============================================================================	
//===============================================================================	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataEmiss�o() {
		return dataEmissao;
	}
	public void setDataEmiss�o(String dataEmiss�o) {
		this.dataEmissao = dataEmiss�o;
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
	
	
	public Endereco getNovaEntrega() {
		return novaEntrega;
	}
	public ItemDePedido[] getItens() {
		return itens;
	}
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pedido(int ConstruNumero, String ConstruDataEmiss�o, String ConstruFormaDePagamento, double ConstruValorTotal, String ConstruSituacao) {
		super();
		this.numero = ConstruNumero;
		this.dataEmissao = ConstruDataEmiss�o;
		this.formaDePagamento = ConstruFormaDePagamento;
		this.valorTotal = ConstruValorTotal;
		this.situacao = ConstruSituacao;
	}

	@Override
	public String toString() {
		return "PEDIDO \n|numero: " + numero + "|    |dataEmiss�o: " + dataEmissao + "|    |formaDePagamento: " + formaDePagamento
				+ "|\n\n|valorTotal: " + valorTotal + "|    |situacao:" + situacao +"|\n";
	}
}
