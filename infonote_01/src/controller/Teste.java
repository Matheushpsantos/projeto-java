package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {

	Usuario usuario1 = new Usuario();
	Endereco endereco1 = new Endereco();
	Pedido pedido1 = new Pedido();
	ItemDePedido item1 = new ItemDePedido();
	Notebook notebook1 = new Notebook(); 
	
	
	// Usuario
	System.out.println("______________________________________________");
	System.out.println("");
	usuario1.setEmail("murillo01@gmail.com");
	usuario1.setLogin("Murillo01");
	usuario1.setMatricula(2246);
	usuario1.setSenha("1234");
	usuario1.setTelefone("21 5656-4444");
	usuario1.setNome("Murillo");
	System.out.println(usuario1.toString());
	
	// Endereco
	System.out.println("______________________________________________");
	System.out.println("");
	endereco1.setBairro("Vasconcelos");
	endereco1.setCep("20466815");
	endereco1.setCidade("Rj");
	endereco1.setComplemento("fundos");
	endereco1.setEstado("Rio de janeiro");
	endereco1.setLogradouro("dr. Vasconcelos");
	endereco1.setNumero("403");
	System.out.println(endereco1.toString());
	
	// Pedido
	System.out.println("______________________________________________");
	System.out.println("");
	pedido1.setDataEmissão("12/11/2018");
	pedido1.setFormaDePagamento("Cartão de credito");
	pedido1.setNumero(6458);
	pedido1.setSituacao("em andamento");
	pedido1.setValorTotal(2430.30);
	System.out.println(pedido1.toString());
	
	// ItemDePedido
	System.out.println("______________________________________________");
	System.out.println("");
	item1.setQtde(2);
	item1.setSubtotal(234.3);
	System.out.println(item1.toString());
	
	// Notebook 
	System.out.println("______________________________________________");
	System.out.println("");
	notebook1.setDataCadastro("12/11/2018");
	notebook1.setDescricao("64bits, dell");
	notebook1.setEstoque(30);
	notebook1.setFigura("nenhuma");
	notebook1.setModelo("2.4.1");
	notebook1.setNumeroNote(29);
	notebook1.setPrecoUnitario(2839.99);
	System.out.println(notebook1.toString());
	
	}

}
