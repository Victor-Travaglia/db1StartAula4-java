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
		cliente = new Cliente("Victor Lopes", "123456789", StatusCliente.ATIVO);
	    produto0 = new Produto("001", "SabaoEmPo");
	    produto1 = new Produto("002", "Manteiga");
	    produto2 = new Produto("003", "Ovo");
	}
	
	@Test
	public void deveCriarUmNovoPedido() {
		Pedido pedido = new Pedido(cliente, StatusPedido.ABERTO, "001");
		pedido.adicionarItem(15.0, 5.50, produto0);
		pedido.adicionarItem(5.0, 5.50, produto1);
		pedido.adicionarItem(8.0, 0.25, produto2);
		
		Assert.assertEquals(3, pedido.getPedidoItem().size());
	}
}
