package br.puc.movie;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.Singleton;

@Singleton
public class MovieServiceSingleton {

	private List<Movie> carrinho = new ArrayList<>();

	public void addCarrinho(Movie movie) {
		System.out.println("------------------ Adicionando no Carrinho C --------------");
		System.out.println(this.toString());
		this.carrinho.add(movie);
	}

	public List<Movie> getCarrinho() {
		System.out.println("------------------ Retornando Carrinho C --------------");
		System.out.println(this.toString());
		return this.carrinho;
	}
	
}