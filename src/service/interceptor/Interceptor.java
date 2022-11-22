package service.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class Interceptor {

    public void log(String dato) {
        System.out.println(dato);
    }

    @AroundInvoke
    public Object filtra(InvocationContext ic) throws Exception {
        log("FILTRO!");
        System.out.println("sono nel metodo filtra!");

        return "OK";
    }
}
