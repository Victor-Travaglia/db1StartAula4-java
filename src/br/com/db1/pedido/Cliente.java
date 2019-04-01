package br.com.db1.pedido;

public class Cliente {
	
	private String nome;
	private String cpf;
	private StatusCliente status;
	
	public Cliente(String nome, String cpf) {
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
		this.status = StatusCliente.ATIVO;
	}
	
	public String getNome() {
		return nome;
	}
	
	public StatusCliente getStatus() {
		return status;
	}
	
	public String getCpf() {
		return cpf;
	}
}
