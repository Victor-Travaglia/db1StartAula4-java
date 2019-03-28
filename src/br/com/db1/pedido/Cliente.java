package br.com.db1.pedido;

public class Cliente {
	
	String nome;
	String cpf;
	StatusCliente status = StatusCliente.ATIVO;
	
	public Cliente(String nome, String cpf, StatusCliente status) {
		if(nome == null) {
			throw new RuntimeException("Nome é obrigatório");
		}
		
		if(cpf == null) {
			throw new RuntimeException("CPF é obrigatório");
		}
		
		if(status == null) {
			throw new RuntimeException("Status é obrigatório");
		}

		this.nome = nome;
		this.cpf = cpf;
		this.status = status;
	}
	
}
