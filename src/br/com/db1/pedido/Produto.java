package br.com.db1.pedido;

public class Produto {
	
	String codigo;
	String descricao;
	
	public Produto(String codigo, String descricao) {
		if(codigo == null) {
			throw new RuntimeException("Codigo � obrigat�rio");
		}
		
		if(descricao == null) {
			throw new RuntimeException("Descricao � obrigat�ria");
		}
		
		this.codigo = codigo;
		this.descricao = descricao;
	}
}
