package model;

public class ItemDePedido {

	int qtde;
	double subtotal;
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
	
	
}
