package br.com.db1.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private Cliente cliente;
	private StatusPedido status = StatusPedido.ABERTO;
	private String codigo;
	private List<HistoricoPedidos> historicos = new ArrayList<>();
	private List<PedidoItem> pedidoItem = new ArrayList<>();
	
	
	
	public Pedido(Cliente cliente, StatusPedido status, String codigo, PedidoItem itens) {
		this.cliente = cliente;
		this.status = status;
		this.codigo = codigo;
		this.pedidoItem.add(itens);
	}

	public void faturar() {
		HistoricoPedidos historico = new HistoricoPedidos(status.FATURADO);
		this.historicos.add(historico);
	}
	
	public void cancelar() {
		HistoricoPedidos historico = new HistoricoPedidos(status.CANCELADO);
		this.historicos.add(historico);
	}
	
	
	
	
	
}
