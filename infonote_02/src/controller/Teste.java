package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {

	Usuario usuario1 = new Usuario();
	Endereco endereco1 = new Endereco();
	Pedido pedido1 = new Pedido();
	ItemDePedido item1 = new ItemDePedido();
	ItemDePedido item2 = new ItemDePedido();
	Notebook notebook1 = new Notebook();
	Notebook notebook2 = new Notebook();
	Notebook notebook3 = new Notebook();
	
	
	// Usuario
	System.out.println("");//linha de design
	System.out.println("______________________________________________");//linha de design
	usuario1.setEmail("murillo01@gmail.com");
	usuario1.setLogin("Murillo01");
	usuario1.setMatricula(2246);
	usuario1.setSenha("1234");
	usuario1.setTelefone("21 5656-4444");
	usuario1.setNome("Murillo");
	System.out.println(usuario1.toString());// mostra o resultado dos set's
	
	// Endereco
	System.out.println("");//linha de design
	System.out.println("______________________________________________");//linha de design
	endereco1.setBairro("Vasconcelos");
	endereco1.setCep("20466815");
	endereco1.setCidade("Rj");
	endereco1.setComplemento("fundos");
	endereco1.setEstado("Rio de janeiro");
	endereco1.setLogradouro("dr. Vasconcelos");
	endereco1.setNumero("403");
	System.out.println(endereco1.toString());
	
	// Pedido
	System.out.println("");//linha de design
	System.out.println("______________________________________________");//linha de design
	pedido1.setDataEmissão("12/11/2018");
	pedido1.setFormaDePagamento("Cartão de credito");
	pedido1.setNumero(6458);
	pedido1.setSituacao("em andamento");
	pedido1.setValorTotal(2430.30);
	System.out.println(pedido1.toString());
	
	// ItemDePedido
	System.out.println("");//linha de design
	System.out.println("______________________________________________");//linha de design
	item1.setQtde(2);
	item1.setSubtotal(234.3);
	System.out.println(item1.toString());
	
	// ItemDePedido
	System.out.println("");//linha de design
	System.out.println("______________________________________________");//linha de design
	item2.setQtde(1);
	item2.setSubtotal(4800.90);
	System.out.println(item2.toString());
	
	// Notebook 
	System.out.println("");//linha de design
	System.out.println("______________________________________________");//linha de design
	notebook1.setDataCadastro("12/11/2018");
	notebook1.setDescricao("64bits, dell");
	notebook1.setEstoque(30);
	notebook1.setFigura("nenhuma");
	notebook1.setModelo("2.4.1");
	notebook1.setNumeroNote(29);
	notebook1.setPrecoUnitario(2839.99);
	System.out.println(notebook1.toString());
		
	// Notebook 
	System.out.println("");//linha de design
	System.out.println("______________________________________________");//linha de design
	notebook2.setDataCadastro("12/11/2018");
	notebook2.setDescricao("64bits, mac");
	notebook2.setEstoque(14);
	notebook2.setFigura("nenhuma");
	notebook2.setModelo("11.4.3");
	notebook2.setNumeroNote(14);
	notebook2.setPrecoUnitario(5899.99);
	System.out.println(notebook1.toString());
		
	// Notebook 
	System.out.println("");//linha de design
	System.out.println("______________________________________________");//linha de design
	notebook3.setDataCadastro("08/11/2018");
	notebook3.setDescricao("64bits, dell");
	notebook3.setEstoque(36);
	notebook3.setFigura("nenhuma");
	notebook3.setModelo("2.4.1");
	notebook3.setNumeroNote(31);
	notebook3.setPrecoUnitario(2839.99);
	System.out.println(notebook1.toString());
	
	}

}
