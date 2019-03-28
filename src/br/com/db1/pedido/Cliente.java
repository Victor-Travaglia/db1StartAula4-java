package br.com.db1.pedido;

public class Cliente {
	
	String nome;
	String cpf;
	StatusCliente status = StatusCliente.ATIVO;
	
	public Cliente(String nome, String cpf, StatusCliente status) {
		this.nome = nome;
		this.cpf = cpf;
		this.status = status;
	}
	
}
