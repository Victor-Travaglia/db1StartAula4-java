package br.com.db1.pedido;

public class PedidoItem {

	private Double quantidade;
	private Double valor;
	private Produto produto;
	
	public PedidoItem(Double quantidade, Double valor, Produto produto) {
		if(quantidade == null) {
			throw new RuntimeException("Quantidade é obrigatória para o item");
		}
		
		if(quantidade <= 0) {
			throw new RuntimeException("Quantidade deve ser maior do que 0");
		}
		
		if(valor == null) {
			throw new RuntimeException("Valor é obrigatório para o item");
		}
		
		if(valor <= 0.0) {
			throw new RuntimeException("Valor deve ser maior do que 0.0");
		}
		
		this.quantidade = quantidade;
		this.valor = valor;
		this.produto = produto;
	}
}
