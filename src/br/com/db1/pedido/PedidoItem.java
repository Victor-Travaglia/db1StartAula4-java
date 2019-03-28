package br.com.db1.pedido;

public class PedidoItem {

	private Double quantidade;
	private Double valor;
	private Produto produto;
	
	public PedidoItem(Double quantidade, Double valor, Produto produto) {
		this.quantidade = quantidade;
		this.valor = valor;
		this.produto = produto;
	}
	
	
	
	
}
