package model;

public class ItemDePedido {

	private int qtde;
	private double subtotal;
	
	private Notebook notebook;
	
	
	
	
	public void mostrar() {
		
		System.out.println("\n\nITEM DE PEDIDO:\n");
		System.out.println("Quantidade: "+this.qtde);
		System.out.println("Subtotal: "+this.subtotal);
	}
	
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
		return "ITEM DE PEDIDO \n|Quantidade: " + qtde + "|    |subtotal=" + subtotal +"|\n";
	}
	
	
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
}
