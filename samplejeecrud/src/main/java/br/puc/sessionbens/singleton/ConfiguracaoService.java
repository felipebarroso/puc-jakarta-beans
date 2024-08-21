package br.puc.sessionbens.singleton;

import jakarta.ejb.Singleton;

@Singleton
public class ConfiguracaoService {
	
	private int cotacaoConversao;
	
	
	public ConfiguracaoService() {
		// valor padrao
		this.cotacaoConversao = 5;
	}

	public void setCotacaoConversao(int cotacaoConversao) {
		this.cotacaoConversao = cotacaoConversao;
	}

	public int getCotacaoConversao() {
		return this.cotacaoConversao;
	}
	

}
