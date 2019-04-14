package br.com.mercadojoca;

public class ClientePF extends Cliente{

	private String cpf;
	
	public ClientePF  (String nome, String cpf){
		
		super(nome);
		this.cpf = cpf;
	}
	
	public String getCodigo(){
		return this.cpf;
	}
	
	public String getCPF(){
		return this.cpf;
	}
	
	
}
