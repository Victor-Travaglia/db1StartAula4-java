package br.com.db1.pedido;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PedidoTeste {
	
	private Produto produto;
	@Before
	public void init() {
		Cliente cliente = new Cliente("Victor Lopes", "123456789", StatusCliente.ATIVO);
	    produto = new Produto("001", "SabaoEmPo", 8.50);
	    
	}
	
	@Test
	public void deveSacarDinheiroDaConta() {
		PedidoItem pedidoItem = 
		
		Assert.assertEquals(500.0, conta.getSaldo(), 0);
		Assert.assertEquals(1, conta.getHistoricos().size());
	}
}
