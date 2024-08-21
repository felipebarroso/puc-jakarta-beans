package br.puc.sessionbens.stateful;

import java.util.List;

import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("carrinho")
@Produces({"application/json"})
public class StatefulController {


    @EJB
    private CarrinhoService carrinhoService;

    
    @POST
    @Path("{item}")
    public List<String> converter(@PathParam("item") String item) {
    	carrinhoService.adicionarItem(item);
    	return carrinhoService.getItens();
    }
    
    @GET
    public List<String> getCarrinhoB() {
        return carrinhoService.getItens();
    }
    
    
}