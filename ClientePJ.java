package br.com.mercadojoca;

public class ClientePJ extends Cliente {
	
	private String cnpj;
	
	public ClientePJ(String nome, String cnpj){
		
		super(nome);
		this.cnpj = cnpj;
	}
	
	public String getCodigo(){
		return this.cnpj;
	}
	
	public String getCNPJ(){
		return this.cnpj;
	}
	
	

}
