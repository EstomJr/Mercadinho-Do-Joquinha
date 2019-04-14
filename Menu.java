package br.com.mercadojoca;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		SisMercadoSi sisMercadoSi = new SisMercadoSi();
		ClientePF clientePf = new ClientePF(null, null);
		ClientePJ clientePj = new ClientePJ(null, null);
		Produto produto = new Produto();
		Usuario usuario$ = new Usuario(null, null);
		Venda venda$ = new Venda();
		
		boolean acabou = false;
		while (acabou == false) {
			String opcao = JOptionPane.showInputDialog("1: Cadastrar Clientes \n 2: Cadastrar Usuarios \n 3: Cadastrar produtos");
			
			if (opcao.equals("1")){
				String nome = JOptionPane.showInputDialog("Se você for Pessoa Física digite 1 se for Empresa digite 2 ?");
				if (nome.equals("1")){
					JOptionPane.showInputDialog("Digite seu nome :");
					JOptionPane.showInputDialog("Digite seu CPF :");
					//JOptionPane.showInputDialog("Digite sua senha");
					sisMercadoSi.cadastrarCliente(clientePf);
				}
				if (nome.equals("2")){
					JOptionPane.showInputDialog("Digite o nome da empresa :");
					JOptionPane.showInputDialog("Digite o CNPJ da empresa :");
					sisMercadoSi.cadastrarCliente(clientePj);
				}
		
		
	}		else if (opcao.equals("2")){
					JOptionPane.showInputDialog("Digite seu nome");
					JOptionPane.showInputDialog("Digite seu login");
					JOptionPane.showInputDialog("Digite sua senha");
					sisMercadoSi.cadastrarUsuario(usuario$);
			
	}	
			else if (opcao.equals("3")){
					JOptionPane.showInputDialog("Digite o codigo do produto :");
					JOptionPane.showInputDialog("Digite o nome do produto :");
					JOptionPane.showInputDialog("Digite o preço de atacado :");
					JOptionPane.showInputDialog("Digite o preço de varejo :");
					sisMercadoSi.cadastrarProduto(produto);
	}
	
}
}
}
//JOptionPane.showMessageDialog(null, "Cadastrando os ClientePF");
		//sisMercadoSi.cadastrarCliente(clientePf);
		
		//JOptionPane.showMessageDialog(null, "Cadastrando os ClientePJ");
		//sisMercadoSi.cadastrarCliente(clientePj);
		
		//JOptionPane.showMessageDialog(null, "Cadastrando os Produtos" );
		//sisMercadoSi.cadastrarProduto(produto);
		
		//JOptionPane.showMessageDialog(null, "Cadastrando os Usuarios");
		//sisMercadoSi.cadastrarUsuario(usuario$);
		
		//JOptionPane.showMessageDialog(null, "Cadastrando vendas");
		//sisMercadoSi.cadastrarVenda(venda$);