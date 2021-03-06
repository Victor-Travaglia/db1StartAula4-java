package br.com.db1.pedido;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class HistoricoPedidos {
	
	private LocalDateTime data;
	private Pedido pedido;
	private Set<PedidoItem> pedidoItem = new HashSet<>();
	
	public HistoricoPedidos(Pedido pedido, Set<PedidoItem> pedidoItem) {
		this.data = LocalDateTime.now();
		this.pedido = pedido;
		this.pedidoItem = pedidoItem;
	}
}
