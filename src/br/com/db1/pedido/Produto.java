package br.com.db1.pedido;

public class Produto {
	
	private String codigo;
	private String descricao;
	private Double valor;
	
	public Produto(String codigo, String descricao, Double valor) {
		if(codigo == null) {
			throw new RuntimeException("Codigo é obrigatório");
		}
		
		if(descricao == null) {
			throw new RuntimeException("Descricao é obrigatória");
		}
		
		if(valor == null) {
			throw new RuntimeException("Valor é obrigatório");
		}
		
		if(valor <= 0) {
			throw new RuntimeException("Valor deve ser maior do que zero");
		}
		
		this.valor = valor;
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Double getValor() {
		return valor;
	}
}
