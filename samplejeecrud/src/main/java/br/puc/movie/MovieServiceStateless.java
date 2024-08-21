package br.puc.movie;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.Stateless;

@Stateless
public class MovieServiceStateless {

	private List<Movie> carrinho = new ArrayList<>();

	public void addCarrinho(Movie movie) {
		System.out.println("------------------ Adicionando no Carrinho A --------------");
		System.out.println(this.toString());
		this.carrinho.add(movie);
	}

	public List<Movie> getCarrinho() {
		System.out.println("------------------ Retornando Carrinho A --------------");
		System.out.println(this.toString());
		return this.carrinho;
	}
	
}