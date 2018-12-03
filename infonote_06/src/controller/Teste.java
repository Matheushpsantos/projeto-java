package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {

	UsuarioOld usuario1 = new UsuarioOld(00421,"joelee", "*****", "Joe Lee", "lee@gmail.com","21 987220222");
	Endereco endereco1 = new Endereco("praça Piauí", "328", "casa 3", "Juquinha", "Rio de Janeiro", "RJ",
			"20042267");
	Pedido pedido1 = new Pedido(864000, "12/11/2018", "cheque pré-datado", 8940.00, "em andamento...");
	ItemDePedido item1 = new ItemDePedido(1,3800.00);
	Notebook notebook1 = new Notebook(82400, "Dell, 2.21.3", "preto, com não removível, 64BITS", 5, 3800.00, "nenhuma",
			"08/11/2018");
	
	
	usuario1.mostrar();
	endereco1.mostrar();
	pedido1.mostrar();
	item1.mostrar();
	notebook1.mostrar();
	}

}
