package br.puc.sessionbens.stateful;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.Stateful;

@Stateful
public class CarrinhoService {
	
	private List<String> itens;
	
	
	public CarrinhoService() {
		this.itens = new ArrayList<>();
	}


	public void adicionarItem(String item) {
		System.out.println("------------------ Adicionando no Carrinho --------------");
		System.out.println(this.toString());
		this.itens.add(item);
	}
	
	public List<String> getItens() {
		System.out.println("------------------ Retornando Carrinho --------------");
		System.out.println(this.toString());
		return this.itens;
	}

}
