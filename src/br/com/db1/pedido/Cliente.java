package br.com.db1.pedido;

public class Cliente {
	
	String nome;
	String cpf;
	StatusCliente status = StatusCliente.ATIVO;
	
	public Cliente(String nome, String cpf, StatusCliente status) {
		if(nome == null) {
			throw new RuntimeException("Nome � obrigat�rio");
		}
		
		if(cpf == null) {
			throw new RuntimeException("CPF � obrigat�rio");
		}
		
		if(status == null) {
			throw new RuntimeException("Status � obrigat�rio");
		}

		this.nome = nome;
		this.cpf = cpf;
		this.status = status;
	}
	
}
