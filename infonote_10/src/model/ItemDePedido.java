package model;

import java.text.NumberFormat;
import java.util.Locale;


public class ItemDePedido {

	private int qtde;
	private double subtotal;
	
	private Notebook notebook;
	
	
	public Notebook getNotebook() {
		return notebook;
	}
	
	
	public ItemDePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDePedido(int construQtde, double construSubtotal) {
		super();
		this.qtde = construQtde;
		this.subtotal = construSubtotal;
	}
	
	
	public ItemDePedido(int construQtde, double construSubtotal,Notebook construNotebook) {
		super();
		this.notebook = construNotebook;
		this.qtde = construQtde;
		this.subtotal = construSubtotal; 
	}
	
	
	public void mostrar() {//não usar no infonote_06
		
		System.out.println("\n\nITEM DE PEDIDO:\n");
		System.out.println("Quantidade: "+this.qtde);
		System.out.println("Subtotal: "+this.subtotal);
	}

	
	
//===========================================================================
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		Locale local = new Locale("pt", "BR");
		
		retValue = "ITEM DE PEDIDO"+ENTER+
				"Quantidade: " + qtde + ENTER+ 
				"subtotal: " + NumberFormat.getCurrencyInstance(local).format(this.subtotal) + ENTER;
		
		return retValue;
	}
	
	
}
