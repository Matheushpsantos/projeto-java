package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Pedido {

	private int numeroPedido;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;
	
	private Endereco enderecoEntrega;
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

	
	public void mostrar() {//não utilizar no infonote_06
		
		System.out.println("\n\nPEDIDO:\n");
		System.out.println("Numero: "+this.numeroPedido);
		System.out.println("Data de emissao: "+this.dataEmissao);
		System.out.println("Forma de pagamento: "+this.formaDePagamento);
		System.out.println("Valor total: "+this.valorTotal);
		System.out.println("situação: "+this.situacao);
		System.out.println("\n\nITENS DO PEDIDO:\n");
		for (int i = 0; i< itens.length; i++) {
			if(itens[i]!= null) {
				itens[i].mostrar();
			}
		}
	}
	
//===============================================================================	
//===============================================================================	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numero) {
		this.numeroPedido = numero;
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
	
	
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public ItemDePedido[] getItens() {
		return itens;
	}
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pedido(int ConstruNumero, String ConstruDataEmissão, String ConstruFormaDePagamento,
			double ConstruValorTotal, String ConstruSituacao, Endereco ConstruEndEntrega) {
		super();
		this.numeroPedido = ConstruNumero;
		this.dataEmissao = ConstruDataEmissão;
		this.formaDePagamento = ConstruFormaDePagamento;
		this.valorTotal = ConstruValorTotal;
		this.situacao = ConstruSituacao;
		this.enderecoEntrega = ConstruEndEntrega;
	}

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		Locale local = null;
		local = new Locale("pt", "BR");
		
		retValue = "PEDIDO" + ENTER +
				"Numero do Pedido: " + numeroPedido + ENTER+
				"Data da Emissão: " + dataEmissao + ENTER+
				"Forma De Pagamento: " + formaDePagamento+ENTER+ 
				"valorTotal: " + NumberFormat.getCurrencyInstance(local).format(this.valorTotal) + 
				ENTER+
				"situacao: " + situacao+ ENTER +
				"Endereço de Entrega: "+ENTER+
				"Itens: ";
		
		for (int i = 0; i< itens.length; i++) {
			retValue += itens[i]+ ENTER;
		}
		
		return retValue;
	}
}
