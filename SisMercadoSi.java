package br.com.mercadojoca;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SisMercadoSi implements SisMercado {
	
		List<Usuario> usuarios = new ArrayList<Usuario>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Venda> vendas = new ArrayList<Venda>();
		
		@Override
		public void cadastrarUsuario(Usuario usuario) {
			if(usuarios.contains(usuario)){
				JOptionPane.showMessageDialog(null, "Usuario já cadastrado.");
			}else{
				usuarios.add(usuario);
				JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso.");
			}
		}
		@Override
		public boolean realizarLogin(String login, String senha) {
			boolean achou = false;
			for (int k = 0; k < usuarios.size(); k++){
				if (usuarios.get(k).getLogin().equals(login) && usuarios.get(k).getSenha().equals(senha));
					achou = true;
				
			}
			return achou;
		}
		@Override
		public void cadastrarCliente(Cliente cliente) {
			if(clientes.contains(cliente)){
				JOptionPane.showMessageDialog(null, "Cliente já cadastrado.");
			}else{
				clientes.add(cliente);	
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
				
			}
			
		}
		@Override
		public void cadastrarProduto(Produto produto) {
			if(produtos.contains(produto)){
				JOptionPane.showMessageDialog(null, "Produto já cadastrado.");
			  }else{
				  produtos.add(produto);
				  JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
			}
			
		}
		@Override
		public void cadastrarVenda(Venda venda) {
			if(vendas.contains(venda)){
				JOptionPane.showMessageDialog(null, "Venda já cadastrada");
				vendas.add(venda);
				JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso");
			}
				
			
		}
		@Override
		public boolean verificarLogin(String login, String senha) {
			boolean achou = false;
			for (int k = 0; k < usuarios.size(); k++){
				if (usuarios.get(k).getLogin().equals(login) && usuarios.get(k).getSenha().equals(senha));
					achou = true;
				
			}
			return achou;
		}
		@Override
		public List<Usuario> PesquisarUsariosComNomeComecandoCom(String prefixo) {
			List<Usuario> lista = new ArrayList<Usuario>();
			for (Usuario u : this.usuarios) {
				if (u.getNome().startsWith(prefixo)) {
					lista.add(u);
				}
			}

			return lista;
		}	
		@Override
		public List<Cliente> ObterListaDeClientes() {
			return this.clientes;
		}
		
}
		