package br.com.db1.pedido;

public class Produto {
	
	String codigo;
	String descricao;
	Double valor;
	
	public Produto(String codigo, String descricao, Double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}
}
