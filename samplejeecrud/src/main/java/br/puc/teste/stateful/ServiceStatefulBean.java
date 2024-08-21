package br.puc.teste.stateful;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.Stateful;

@Stateful
public class ServiceStatefulBean {
	
	private List<String> itens = new ArrayList<>();
	
	
	public void addItem(String item) {
		System.out.println("------------------ Adicionando no Carrinho ServiceStatefulBean --------------");
		System.out.println(this.toString());
		this.itens.add(item);
	}
	
	public List<String> getItens(){
		System.out.println("------------------ Retornando Carrinho ServiceStatefulBean --------------");
		System.out.println(this.toString());
		return this.itens;
	}

}
