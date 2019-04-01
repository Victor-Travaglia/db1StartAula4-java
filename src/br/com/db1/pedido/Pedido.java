package br.com.db1.pedido;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pedido {
	
	private Cliente cliente;
	private StatusPedido status;
	private String codigo;
	private List<HistoricoPedidos> historicos = new ArrayList<>();
	private Set<PedidoItem> pedidoItem = new HashSet<>();
	
	public Pedido(Cliente cliente,  String codigo) {
		if(cliente == null) {
			throw new RuntimeException("Cliente é obrigatório para o pedido");
		}
		
		if(status == null) {
			throw new RuntimeException("Status é obrigatório para o pedido");
		}

		if(codigo == null) {
			throw new RuntimeException("Codigo é obrigatório para o pedido");
		}
		
		this.cliente = cliente;
		this.codigo = codigo;
	}
	
	public Set<PedidoItem> getPedidoItem() {
		return pedidoItem;
	}
	
	public void adicionarItem(Double quantidade, Double valor, Produto produto) {
		PedidoItem item = new PedidoItem(quantidade, produto);
		this.pedidoItem.add(item);
	}

	public void faturar() {
		this.status = StatusPedido.FATURADO;
		Pedido pedido = new Pedido(cliente, codigo);
		HistoricoPedidos historico = new HistoricoPedidos(pedido, pedidoItem);
		this.historicos.add(historico);
	}
	
	public void cancelar() {
		this.status = StatusPedido.CANCELADO;
		Pedido pedido = new Pedido(cliente, codigo);
		HistoricoPedidos historico = new HistoricoPedidos(pedido, pedidoItem);
		this.historicos.add(historico);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public StatusPedido getStatus() {
		return status;
	}
}