package br.com.epiousion.teste;


import br.com.epiousion.beans.Cliente;

import java.util.HashSet;
import java.util.Set;

public class TesteSetComGenerics {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente4", "4444", "cpf4");
		
		//a. Definição de uma coleção de tipo HashSet usando Generics
		Set<Cliente> clientes = new HashSet<Cliente>();
		//b. Adição dos clientes na coleção
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);

		//c. Impressao do nome dos clientes da coleção
		for (Cliente c : clientes){
			System.out.println("Nome: "+ c.getNome());
		}
	}
}

