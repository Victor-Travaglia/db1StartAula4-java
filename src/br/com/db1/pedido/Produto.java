package br.com.db1.pedido;

public class Produto {
	
	String codigo;
	String descricao;
	
	public Produto(String codigo, String descricao) {
		if(codigo == null) {
			throw new RuntimeException("Codigo é obrigatório");
		}
		
		if(descricao == null) {
			throw new RuntimeException("Descricao é obrigatória");
		}
		
		this.codigo = codigo;
		this.descricao = descricao;
	}
}
