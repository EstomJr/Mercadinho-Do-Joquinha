package br.com.mercadojoca;

public abstract class Cliente {

	private String nome;
	
	public Cliente(String nome){
		this.nome = nome;
	}
	
	public abstract String getCodigo();
	
	public String getNome(){ 
		return this.nome;
	}
	
	public String toString(){
		return "nome; "+ this.nome+ " ,codigo; "+ this.getCodigo(); 
	}
	
}
