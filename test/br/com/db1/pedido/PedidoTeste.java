package br.com.db1.pedido;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PedidoTeste {
	
	private Produto produto0;
	private Produto produto1;
	private Produto produto2;
	private Cliente cliente;
	
	@Before
	public void init() {
		cliente = new Cliente("Victor Lopes", "123456789");
	    produto0 = new Produto("001", "SabaoEmPo", 15.0);
	    produto1 = new Produto("002", "Manteiga", 5.0);
	    produto2 = new Produto("003", "Ovo", 1.25);
	}
	
	@Test
	public void deveCriarUmNovoPedido() {
		Pedido pedido = new Pedido(cliente, "001");
		pedido.adicionarItem(produto0.getValor(), 5.50, produto0);
		pedido.adicionarItem(produto1.getValor(), 5.50, produto1);
		pedido.adicionarItem(produto2.getValor(), 0.25, produto2);
		
		Assert.assertEquals(3, pedido.getPedidoItem().size());
	}
}