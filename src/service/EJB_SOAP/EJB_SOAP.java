package service.EJB_SOAP;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService(serviceName = "SOAP")
public class EJB_SOAP { //http://localhost:8080/Corso_JAVA_EE/webservices/EJB_SOAP?wsdl

    public EJB_SOAP() {
    }

    @WebMethod(operationName = "saluta")
    public String saluta(String nome, String cognome) {
        return "Ciao " + nome + " " + cognome;
    }

}
