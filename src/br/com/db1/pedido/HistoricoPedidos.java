package br.com.db1.pedido;

import java.time.LocalDateTime;

public class HistoricoPedidos {
	
	LocalDateTime data;
	StatusPedido status;
	
	public HistoricoPedidos(StatusPedido status) {
		this.data = LocalDateTime.now();
		this.status = status;
	}
	
	
}
