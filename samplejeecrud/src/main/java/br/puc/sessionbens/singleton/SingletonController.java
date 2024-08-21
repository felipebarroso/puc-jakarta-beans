package br.puc.sessionbens.singleton;

import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("configuracao")
@Produces({"application/json"})
public class SingletonController {


    @EJB
    private ConfiguracaoService configuracaoService;

    
    @PUT
    @Path("valor-cotacao/{cotacaoConversao}")
    public int alterarConfigCotacaoConversao(@PathParam("cotacaoConversao") int cotacaoConversao) {
    	configuracaoService.setCotacaoConversao(cotacaoConversao);
    	return cotacaoConversao;
    }
    
    @GET
    @Path("valor-cotacao")
    public int getCotacaoConversao() {
        return configuracaoService.getCotacaoConversao();
    }
    
    
}