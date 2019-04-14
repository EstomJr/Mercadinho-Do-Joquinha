package br.com.mercadojoca;

import java.util.List;

public interface SisMercado {
	
	public void cadastrarUsuario(Usuario usuario);
	
	public boolean realizarLogin(String login, String senha);
	
	public void cadastrarCliente(Cliente cliente);
	
	public void cadastrarProduto(Produto produto);
	
	public void cadastrarVenda(Venda venda);
	
	public boolean verificarLogin(String login, String senha);
	
	public List<Usuario> PesquisarUsariosComNomeComecandoCom(String prefixo);
	
	public List<Cliente> ObterListaDeClientes();
}
