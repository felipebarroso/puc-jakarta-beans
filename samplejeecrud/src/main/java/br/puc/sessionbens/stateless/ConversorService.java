package br.puc.sessionbens.stateless;

import br.puc.sessionbens.singleton.ConfiguracaoService;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class ConversorService {
	
	@EJB
	private ConfiguracaoService configuracaoService;
	

	public int converter(int valor) {
		return valor * configuracaoService.getCotacaoConversao();
	}
	
	

}
