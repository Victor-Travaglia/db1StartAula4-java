package br.com.db1.pedido;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pedido {
	
	private Cliente cliente;
	private StatusPedido status = StatusPedido.ABERTO;
	private String codigo;
	private List<HistoricoPedidos> historicos = new ArrayList<>();
	private Set<PedidoItem> pedidoItem = new HashSet<>();
	
	public Pedido(Cliente cliente, StatusPedido status, String codigo) {
		if(cliente == null) {
			throw new RuntimeException("Cliente é obrigatório para o pedido");
		}
		
		if(status == null && status != StatusPedido.ABERTO) {
			throw new RuntimeException("Status é obrigatório para o pedido");
		}
		
		if(codigo == null) {
			throw new RuntimeException("Codigo é obrigatório para o pedido");
		}
		
		this.cliente = cliente;
		this.status = status;
		this.codigo = codigo;
	}
	
	public Set<PedidoItem> getPedidoItem() {
		return pedidoItem;
	}
	
	public void adicionarItem(Double quantidade, Double valor, Produto produto) {
		PedidoItem item = new PedidoItem(quantidade, valor, produto);
		this.pedidoItem.add(item);
	}

	public void faturar() {
		Pedido pedido = new Pedido(cliente, status.FATURADO, codigo);
		HistoricoPedidos historico = new HistoricoPedidos(pedido, pedidoItem);
		this.historicos.add(historico);
	}
	
	public void cancelar() {
		Pedido pedido = new Pedido(cliente, status.CANCELADO, codigo);
		HistoricoPedidos historico = new HistoricoPedidos(pedido, pedidoItem);
		this.historicos.add(historico);
	}	
}