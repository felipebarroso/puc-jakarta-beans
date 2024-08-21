package br.puc.sessionbens.stateless;

import jakarta.ejb.EJB;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("conversor")
@Produces({"application/json"})
public class StatelessController {


    @EJB
    private ConversorService conversorService;

    
    @POST
    @Path("converter/{valor}")
    public int converter(@PathParam("valor") int valor) {
    	return conversorService.converter(valor);
    }
    
    
}