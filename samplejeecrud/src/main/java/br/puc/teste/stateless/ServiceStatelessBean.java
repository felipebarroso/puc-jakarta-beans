package br.puc.teste.stateless;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.Stateless;

@Stateless
public class ServiceStatelessBean {
	
	private List<String> itens = new ArrayList<>();
	
	
	public void addItem(String item) {
		System.out.println("------------------ Adicionando no Carrinho ServiceStatelessBean --------------");
		System.out.println(this.toString());
		this.itens.add(item);
	}
	
	public List<String> getItens(){
		System.out.println("------------------ Retornando Carrinho ServiceStatelessBean --------------");
		System.out.println(this.toString());
		return this.itens;
	}

}
