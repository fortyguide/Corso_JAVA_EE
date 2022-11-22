package service.EJB_REST;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Stateless
@Path(value="/fattura")
public class EJB_REST { //http://localhost:8080/Corso_JAVA_EE/fattura

    public EJB_REST() {
    }

    @GET
    @Produces(value="text/plain")
    @Path(value="generaNumero")
    public String generaNumero(){ //http://localhost:8080/Corso_JAVA_EE/fattura/generaNumero
        return "1234";
    }

    @GET
    @Produces(value="text/plain") //http://localhost:8080/Corso_JAVA_EE/fattura/generaAnno
    @Path(value="generaAnno")
    public String generaAnno(){
        return "2017";
    }
}
